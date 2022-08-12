
package Behavioral.Excercise5;

/**
 *
 * @author guexa
 * This package contain a challenge that show the Obsrever Pattern
 */
public class Main {
    public static void main(String[] args) {
        
        Connection citlalli = new Connection();
        Connection alexa = new Connection();
        SocialMediaFeed feed =  new SocialMediaFeed();
        
        citlalli.addPropertyChangeListener(feed);
        alexa.addPropertyChangeListener(feed);
        
        citlalli.setStatus("going for a walk");
        alexa.setStatus("eating my lunch");
        
        feed.printStatuses();
        
    }
    
}
