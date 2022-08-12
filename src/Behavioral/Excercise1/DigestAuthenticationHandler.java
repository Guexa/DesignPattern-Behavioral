
package Behavioral.Excercise1;

/**
 *
 * @author guexa
 * This package contain a challenge that show the chain of Responsability
 */
public class DigestAuthenticationHandler extends AuthenticationHandler {
    
    public DigestAuthenticationHandler(AuthenticationHandler next) {
        super(next);
    }
    
    @Override
    public void handleRequest(String requestType){
        if(requestType.equals("digest")){
            System.out.println("Handling digest authentication request");
        } else {
            super.handleRequest(requestType);
        }
    }
}
