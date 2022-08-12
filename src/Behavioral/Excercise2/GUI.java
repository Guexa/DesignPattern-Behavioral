
package Behavioral.Excercise2;

/**
 *
 * @author guexa
 * This package contain a challenge that show the Command Pattern
 */
public class GUI {
    
    private static Document document = new Document();
    
    public static void main(String[] args) {
        
        Button saveButton = new Button("Save");
        Button printButton = new Button("Print");
        
        saveButton.click(new SaveCommand(document));
        printButton.click(new PrintCommand(document));
        
    }
    
}
