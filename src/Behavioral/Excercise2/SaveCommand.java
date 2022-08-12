
package Behavioral.Excercise2;

// This package contain a challenge that show the Command Pattern

public class SaveCommand implements Command {
    
    private Document document;
    
    public SaveCommand(Document document){
        this.document = document;
    }
    
    @Override
    public void execute() {
        
        document.save();
        
    }
    
}
