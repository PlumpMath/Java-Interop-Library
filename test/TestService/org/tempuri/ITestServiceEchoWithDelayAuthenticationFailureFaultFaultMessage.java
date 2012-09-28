
package org.tempuri;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.0
 * 2012-09-18T10:11:49.107+08:00
 * Generated source version: 2.4.0
 * 
 */

@WebFault(name = "AuthenticationFailure", targetNamespace = "http://hpc.microsoft.com/session/")
public class ITestServiceEchoWithDelayAuthenticationFailureFaultFaultMessage extends Exception {
    public static final long serialVersionUID = 20120918101149L;
    
    private com.microsoft.hpc.session.AuthenticationFailure authenticationFailure;

    public ITestServiceEchoWithDelayAuthenticationFailureFaultFaultMessage() {
        super();
    }
    
    public ITestServiceEchoWithDelayAuthenticationFailureFaultFaultMessage(String message) {
        super(message);
    }
    
    public ITestServiceEchoWithDelayAuthenticationFailureFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ITestServiceEchoWithDelayAuthenticationFailureFaultFaultMessage(String message, com.microsoft.hpc.session.AuthenticationFailure authenticationFailure) {
        super(message);
        this.authenticationFailure = authenticationFailure;
    }

    public ITestServiceEchoWithDelayAuthenticationFailureFaultFaultMessage(String message, com.microsoft.hpc.session.AuthenticationFailure authenticationFailure, Throwable cause) {
        super(message, cause);
        this.authenticationFailure = authenticationFailure;
    }

    public com.microsoft.hpc.session.AuthenticationFailure getFaultInfo() {
        return this.authenticationFailure;
    }
}
