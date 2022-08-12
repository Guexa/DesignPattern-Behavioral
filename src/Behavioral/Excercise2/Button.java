
package Behavioral.Excercise2;

/**
 *
 * @author guexa
 * This package contain a challenge that show the Command Pattern
 */
public class Button {
    
    String text;
    
    public Button(String text){
        this.text = text;
    }
    
    public void click(Command command){
        
        command.execute();
        
    }
    
}
