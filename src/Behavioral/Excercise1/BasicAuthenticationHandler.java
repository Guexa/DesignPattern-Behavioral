
package Behavioral.Excercise1;

/**
 *
 * @author guexa
 * This package contain a challenge that show the chain of Responsabilitys
 */
public class BasicAuthenticationHandler extends AuthenticationHandler {
    
    public BasicAuthenticationHandler(AuthenticationHandler next) {
        super(next);
    }
    
    @Override
    public void handleRequest(String requestType){
        if(requestType.equals("basic")){
            System.out.println("Handling basic authentication request");
        } else {
            super.handleRequest(requestType);
        }
    }
}
