
package Behavioral.Excercise2;

// This package contain a challenge that show the Command Pattern

public class PrintCommand implements Command {

    private Document document;
    
    public PrintCommand(Document document){
        this.document = document;
    }
    
    @Override
    public void execute() {
        
        document.print();
        
    }
    
}
