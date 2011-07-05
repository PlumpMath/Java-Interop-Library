
package com.microsoft.hpc.brokerlauncher;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.3.1
 * Mon Dec 13 16:05:47 GMT+08:00 2010
 * Generated source version: 2.3.1
 * 
 */

@WebFault(name = "SessionFault", targetNamespace = "http://hpc.microsoft.com/session/")
public class IBrokerLauncherGetActiveBrokerIdListSessionFaultFaultFaultMessage extends Exception {
    public static final long serialVersionUID = 20101213160547L;
    
    private com.microsoft.hpc.session.SessionFault sessionFault;

    public IBrokerLauncherGetActiveBrokerIdListSessionFaultFaultFaultMessage() {
        super();
    }
    
    public IBrokerLauncherGetActiveBrokerIdListSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IBrokerLauncherGetActiveBrokerIdListSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IBrokerLauncherGetActiveBrokerIdListSessionFaultFaultFaultMessage(String message, com.microsoft.hpc.session.SessionFault sessionFault) {
        super(message);
        this.sessionFault = sessionFault;
    }

    public IBrokerLauncherGetActiveBrokerIdListSessionFaultFaultFaultMessage(String message, com.microsoft.hpc.session.SessionFault sessionFault, Throwable cause) {
        super(message, cause);
        this.sessionFault = sessionFault;
    }

    public com.microsoft.hpc.session.SessionFault getFaultInfo() {
        return this.sessionFault;
    }
}
