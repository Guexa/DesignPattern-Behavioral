
package Behavioral.Excercise5;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author guexa
 * This package contain a challenge that show the Obsrever Pattern
 */
public class Connection {
    
    private String status = "";
    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    
    public void setStatus(String status){
        support.firePropertyChange("status", this.status, status);
        this.status = status;
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }
    
}
