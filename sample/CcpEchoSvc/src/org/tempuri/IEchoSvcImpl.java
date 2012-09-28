/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.tempuri;

import java.io.*;
import java.net.InetAddress;

import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.CastUtils;
import org.apache.cxf.jaxws.context.WrappedMessageContext;
import org.apache.cxf.message.Message;
import org.datacontract.schemas._2004._07.echosvclib.StatisticInfo;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.microsoft.hpc.scheduler.session.DataClient;
import com.microsoft.hpc.scheduler.session.servicecontext.ServiceContext;
import com.microsoft.hpc.scheduler.session.servicecontext.etw.*;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**
 * This class was generated by Apache CXF 2.3.3 2011-03-11T14:28:00.191+08:00
 * Generated source version: 2.3.3
 * 
 */

@javax.jws.WebService(serviceName = "EchoSvc", portName = "DefaultBinding_IEchoSvc", targetNamespace = "http://tempuri.org/", wsdlLocation = "file:tempuri.org.wsdl", endpointInterface = "org.tempuri.IEchoSvc")
public class IEchoSvcImpl implements IEchoSvc {
    @Resource
    WebServiceContext wsContext;

    private static final int BufferSize = 64000;
    private static final Logger LOG = Logger.getLogger(IEchoSvcImpl.class
            .getName());

    /*
     * (non-Javadoc)
     * 
     * @see org.tempuri.IEchoSvc#echoData(java.lang.String dataClientId )*
     */
    public java.lang.Integer echoData(java.lang.String dataClientId) {
        ServiceContext.Logger.traceEvent(Level.INFO,
                "Executing operation echoData");
        ServiceContext.Logger.traceEvent(Level.ALL, dataClientId);
        try {
            DataClient client = ServiceContext.getDataClient(dataClientId);
            byte[] data = client.readRawBytesAll();
            return data.length;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tempuri.IEchoSvc#generateLoad(java.lang.Double runMilliSeconds
     * ,)byte[] dummyData ,)java.lang.String fileData )*
     */
    public StatisticInfo generateLoad(java.lang.Double runMilliSeconds,
            byte[] dummyData, java.lang.String fileData) {
        ServiceContext.Logger.traceEvent(Level.INFO,
                "Executing operation generateLoad");
        ServiceContext.Logger.traceEvent(Level.ALL, runMilliSeconds.toString());
        try {
            StatisticInfo info = new StatisticInfo();

            // Set start time to now.
            info.setStartTime(Utility.getXMLCurrentTime());

            if (!Utility.isNullOrEmpty(fileData)) {
                byte[] buffer = new byte[BufferSize];
                int readed;
                InputStream file;
                try {
                    file = new FileInputStream(new File(fileData));
                } catch (FileNotFoundException e) {
                    throw new Exception("File not found", e);
                }

                do {
                    readed = file.read(buffer, 0, BufferSize);
                } while (readed != BufferSize);

                file.close();
            }

            GregorianCalendar target = new GregorianCalendar();
            target.add(GregorianCalendar.MILLISECOND,
                    runMilliSeconds.intValue());
            String dummy = System.getenv("CCP_TASKINSTANCEID");
            if (!Utility.isNullOrEmpty(dummy)) {
                try {
                    info.setTaskId(Integer.parseInt(dummy));
                } catch (NumberFormatException e) {
                    // taskid to default (0)
                    info.setTaskId(0);
                }
            }

            while (GregorianCalendar.getInstance().before(target)) {
                // busy wait
            }

            info.setEndTime(Utility.getXMLCurrentTime());

            return info;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tempuri.IEchoSvc#echo(java.lang.String input )*
     */
    public java.lang.String echo(java.lang.String input) {
        ServiceContext.Logger
                .traceEvent(Level.INFO, "Executing operation echo");
        ServiceContext.Logger.traceEvent(Level.ALL, input);
        ServiceContext.Logger.traceEvent(Level.INFO, "Start to use ETW tracing...");
        ETWTraceEvent etw =new ETWTraceEvent(wsContext);
        etw.TraceInformation(input);

        String userData = getUserData();
        ServiceContext.Logger.traceEvent(Level.INFO, "UserData : " + userData);
        try {
            String computername = InetAddress.getLocalHost().getHostName();
            return computername + ":" + input;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    private String getUserData() {
        MessageContext mc = this.wsContext.getMessageContext();
        Message message = ((WrappedMessageContext) mc).getWrappedMessage();
        String userData = "";
        List<Header> headers = CastUtils.cast((List<?>) message
                .get(Header.HEADER_LIST));

        for (Header h : headers) {
            QName name = h.getName();
            if (name.getLocalPart() == com.microsoft.hpc.scheduler.session.Constant.UserDataHeaderName &&
                    name.getNamespaceURI() == com.microsoft.hpc.scheduler.session.Constant.HpcHeaderNS)
            {
                Element root = (Element) h.getObject();
                userData = root.getTextContent();
                break;
            }
        }
        return userData;
    }

}
