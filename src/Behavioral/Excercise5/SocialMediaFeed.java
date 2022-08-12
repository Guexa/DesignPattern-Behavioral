
package Behavioral.Excercise5;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

/**
 *
 * @author guexa
 * This package contain a challenge that show the Obsrever Pattern
 */
public class SocialMediaFeed implements PropertyChangeListener {
    
    private ArrayList<String> statuses = new ArrayList<>();
    
    public void printStatuses(){
        statuses.forEach(System.out::println);
    }
    
    public void propertyChange(PropertyChangeEvent event){
        statuses.add((String) event.getNewValue());
    }
}
