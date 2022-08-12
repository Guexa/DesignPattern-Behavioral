
package Behavioral.Excercise1;

/**
 *
 * @author guexa
 * This package contain a challenge that show the chain of Responsability
 */
public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

    public ClientCertificateAuthenticationHandler(AuthenticationHandler next) {
        super(next);
    }
    
    @Override
    public void handleRequest(String requestType){
        if(requestType.equals("client certificate")){
            System.out.println("Handling client certificate authentication request");
        } else {
            super.handleRequest(requestType);
        }
    }
    
}
