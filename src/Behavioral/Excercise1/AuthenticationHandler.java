
package Behavioral.Excercise1;

/**
 *
 * @author guexa
 * This package contain a challenge that show the chain of Responsability
 */
public abstract class AuthenticationHandler {
    
    private AuthenticationHandler next;
    
    public AuthenticationHandler(AuthenticationHandler next){
        this.next = next;
    }
    
    public void handleRequest(String requestType){
        if(next != null){
            next.handleRequest(requestType);
        }
    }
    
}
