package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2012-09-18T10:11:49.192+08:00
 * Generated source version: 2.4.0
 * 
 */
 
@WebService(targetNamespace = "http://tempuri.org/", name = "ITestService")
@XmlSeeAlso({ObjectFactory.class, org.datacontract.schemas._2004._07.aitestlib.ObjectFactory.class, org.datacontract.schemas._2004._07.system.ObjectFactory.class, org.datacontract.schemas._2004._07.services.ObjectFactory.class, com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, com.microsoft.hpc.session.ObjectFactory.class, com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class})
public interface ITestService {

    @WebResult(name = "EchoObject2Result", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoObject2", output = "http://tempuri.org/ITestService/EchoObject2Response")
    @RequestWrapper(localName = "EchoObject2", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoObject2")
    @WebMethod(operationName = "EchoObject2", action = "http://tempuri.org/ITestService/EchoObject2")
    @ResponseWrapper(localName = "EchoObject2Response", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoObject2Response")
    public org.datacontract.schemas._2004._07.services.ClassObj echoObject2(
        @WebParam(name = "obj", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.services.ClassObj obj
    );

    @WebResult(name = "EchoDoubleResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoDouble", output = "http://tempuri.org/ITestService/EchoDoubleResponse")
    @RequestWrapper(localName = "EchoDouble", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoDouble")
    @WebMethod(operationName = "EchoDouble", action = "http://tempuri.org/ITestService/EchoDouble")
    @ResponseWrapper(localName = "EchoDoubleResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoDoubleResponse")
    public java.lang.Double echoDouble(
        @WebParam(name = "inp", targetNamespace = "http://tempuri.org/")
        java.lang.Double inp
    );

    @WebResult(name = "EchoWithParamResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoWithParam", output = "http://tempuri.org/ITestService/EchoWithParamResponse")
    @RequestWrapper(localName = "EchoWithParam", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoWithParam")
    @WebMethod(operationName = "EchoWithParam", action = "http://tempuri.org/ITestService/EchoWithParam")
    @ResponseWrapper(localName = "EchoWithParamResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoWithParamResponse")
    public org.datacontract.schemas._2004._07.services.ComputerInfo echoWithParam(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID,
        @WebParam(name = "d", targetNamespace = "http://tempuri.org/")
        java.lang.Double d,
        @WebParam(name = "f", targetNamespace = "http://tempuri.org/")
        java.lang.Float f,
        @WebParam(name = "i64", targetNamespace = "http://tempuri.org/")
        java.lang.Long i64,
        @WebParam(name = "i32_1", targetNamespace = "http://tempuri.org/")
        java.lang.Integer i321,
        @WebParam(name = "i32_2", targetNamespace = "http://tempuri.org/")
        java.lang.Integer i322,
        @WebParam(name = "e", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.services.TestEnum e,
        @WebParam(name = "s", targetNamespace = "http://tempuri.org/")
        java.lang.String s
    );

    @WebResult(name = "EchoObjectResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoObject", output = "http://tempuri.org/ITestService/EchoObjectResponse")
    @RequestWrapper(localName = "EchoObject", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoObject")
    @WebMethod(operationName = "EchoObject", action = "http://tempuri.org/ITestService/EchoObject")
    @ResponseWrapper(localName = "EchoObjectResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoObjectResponse")
    public java.lang.Object echoObject(
        @WebParam(name = "type", targetNamespace = "http://tempuri.org/")
        java.lang.String type,
        @WebParam(name = "o", targetNamespace = "http://tempuri.org/")
        java.lang.Object o
    );

    @WebResult(name = "EchoStructResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoStruct", output = "http://tempuri.org/ITestService/EchoStructResponse")
    @RequestWrapper(localName = "EchoStruct", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoStruct")
    @WebMethod(operationName = "EchoStruct", action = "http://tempuri.org/ITestService/EchoStruct")
    @ResponseWrapper(localName = "EchoStructResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoStructResponse")
    public org.datacontract.schemas._2004._07.services.ComputerInfo echoStruct(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID,
        @WebParam(name = "s", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.services.TestStruct s
    );

    @WebResult(name = "EchoClassResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoClass", output = "http://tempuri.org/ITestService/EchoClassResponse")
    @RequestWrapper(localName = "EchoClass", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoClass")
    @WebMethod(operationName = "EchoClass", action = "http://tempuri.org/ITestService/EchoClass")
    @ResponseWrapper(localName = "EchoClassResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoClassResponse")
    public org.datacontract.schemas._2004._07.services.ClassFoo echoClass(
        @WebParam(name = "cls", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.services.ClassFoo cls
    );

    @WebResult(name = "ServiceSideAsyncEchoResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/ServiceSideAsyncEcho", output = "http://tempuri.org/ITestService/ServiceSideAsyncEchoResponse")
    @RequestWrapper(localName = "ServiceSideAsyncEcho", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ServiceSideAsyncEcho")
    @WebMethod(operationName = "ServiceSideAsyncEcho", action = "http://tempuri.org/ITestService/ServiceSideAsyncEcho")
    @ResponseWrapper(localName = "ServiceSideAsyncEchoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ServiceSideAsyncEchoResponse")
    public org.datacontract.schemas._2004._07.services.ComputerInfo serviceSideAsyncEcho(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID
    );

    @WebResult(name = "SerializationTestResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/SerializationTest", output = "http://tempuri.org/ITestService/SerializationTestResponse")
    @RequestWrapper(localName = "SerializationTest", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SerializationTest")
    @WebMethod(operationName = "SerializationTest", action = "http://tempuri.org/ITestService/SerializationTest")
    @ResponseWrapper(localName = "SerializationTestResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SerializationTestResponse")
    public java.lang.Boolean serializationTest(
        @WebParam(name = "stream", targetNamespace = "http://tempuri.org/")
        byte[] stream
    );

    @WebResult(name = "TraceResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/Trace", output = "http://tempuri.org/ITestService/TraceResponse", fault = {@FaultAction(className = ITestServiceTraceRetryOperationErrorFaultFaultMessage.class, value = "http://hpc.microsoft.com/session/RetryOperationError"), @FaultAction(className = ITestServiceTraceOutOfMemoryExceptionFaultFaultMessage.class, value = "http://tempuri.org/ITestService/TraceOutOfMemoryExceptionFault")})
    @RequestWrapper(localName = "Trace", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Trace")
    @WebMethod(operationName = "Trace", action = "http://tempuri.org/ITestService/Trace")
    @ResponseWrapper(localName = "TraceResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.TraceResponse")
    public org.datacontract.schemas._2004._07.services.ComputerInfo trace(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID,
        @WebParam(name = "traceMsgs", targetNamespace = "http://tempuri.org/")
        com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring traceMsgs,
        @WebParam(name = "sleepBeforeTrace", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.Duration sleepBeforeTrace,
        @WebParam(name = "sleepAfterTrace", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.Duration sleepAfterTrace,
        @WebParam(name = "testActionId", targetNamespace = "http://tempuri.org/")
        java.lang.Integer testActionId
    ) throws ITestServiceTraceRetryOperationErrorFaultFaultMessage, ITestServiceTraceOutOfMemoryExceptionFaultFaultMessage;

    @WebResult(name = "RunInprocSoaJobResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/RunInprocSoaJob", output = "http://tempuri.org/ITestService/RunInprocSoaJobResponse")
    @RequestWrapper(localName = "RunInprocSoaJob", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RunInprocSoaJob")
    @WebMethod(operationName = "RunInprocSoaJob", action = "http://tempuri.org/ITestService/RunInprocSoaJob")
    @ResponseWrapper(localName = "RunInprocSoaJobResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RunInprocSoaJobResponse")
    public java.lang.String runInprocSoaJob();

    @WebResult(name = "EchoObject3Result", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoObject3", output = "http://tempuri.org/ITestService/EchoObject3Response")
    @RequestWrapper(localName = "EchoObject3", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoObject3")
    @WebMethod(operationName = "EchoObject3", action = "http://tempuri.org/ITestService/EchoObject3")
    @ResponseWrapper(localName = "EchoObject3Response", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoObject3Response")
    public java.lang.Object echoObject3(
        @WebParam(name = "type", targetNamespace = "http://tempuri.org/")
        java.lang.String type,
        @WebParam(name = "o", targetNamespace = "http://tempuri.org/")
        java.lang.Object o
    );

    @WebResult(name = "GetCommonDataResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/GetCommonData", output = "http://tempuri.org/ITestService/GetCommonDataResponse", fault = {@FaultAction(className = ITestServiceGetCommonDataCommonDataErrorFaultFaultMessage.class, value = "http://tempuri.org/ITestService/GetCommonDataCommonDataErrorFault")})
    @RequestWrapper(localName = "GetCommonData", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetCommonData")
    @WebMethod(operationName = "GetCommonData", action = "http://tempuri.org/ITestService/GetCommonData")
    @ResponseWrapper(localName = "GetCommonDataResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetCommonDataResponse")
    public org.datacontract.schemas._2004._07.services.ComputerInfo getCommonData(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID,
        @WebParam(name = "sleepBeforeGet", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.Duration sleepBeforeGet,
        @WebParam(name = "sleepAfterGet", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.Duration sleepAfterGet,
        @WebParam(name = "dataClientId", targetNamespace = "http://tempuri.org/")
        java.lang.String dataClientId,
        @WebParam(name = "expectedMd5Hash", targetNamespace = "http://tempuri.org/")
        java.lang.String expectedMd5Hash,
        @WebParam(name = "testActionId", targetNamespace = "http://tempuri.org/")
        java.lang.Integer testActionId
    ) throws ITestServiceGetCommonDataCommonDataErrorFaultFaultMessage;

    @WebResult(name = "PingResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/Ping", output = "http://tempuri.org/ITestService/PingResponse")
    @RequestWrapper(localName = "Ping", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Ping")
    @WebMethod(operationName = "Ping", action = "http://tempuri.org/ITestService/Ping")
    @ResponseWrapper(localName = "PingResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PingResponse")
    public java.lang.Boolean ping();

    @WebResult(name = "GenerateLoadWithInputFileResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/GenerateLoadWithInputFile", output = "http://tempuri.org/ITestService/GenerateLoadWithInputFileResponse")
    @RequestWrapper(localName = "GenerateLoadWithInputFile", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GenerateLoadWithInputFile")
    @WebMethod(operationName = "GenerateLoadWithInputFile", action = "http://tempuri.org/ITestService/GenerateLoadWithInputFile")
    @ResponseWrapper(localName = "GenerateLoadWithInputFileResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GenerateLoadWithInputFileResponse")
    public org.datacontract.schemas._2004._07.services.StatisticInfo generateLoadWithInputFile(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID,
        @WebParam(name = "millisec", targetNamespace = "http://tempuri.org/")
        java.lang.Long millisec,
        @WebParam(name = "input_data_path", targetNamespace = "http://tempuri.org/")
        java.lang.String inputDataPath,
        @WebParam(name = "common_data_path", targetNamespace = "http://tempuri.org/")
        java.lang.String commonDataPath
    );

    @WebResult(name = "EchoWithDelayOnSelectedNodeResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoWithDelayOnSelectedNode", output = "http://tempuri.org/ITestService/EchoWithDelayOnSelectedNodeResponse")
    @RequestWrapper(localName = "EchoWithDelayOnSelectedNode", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoWithDelayOnSelectedNode")
    @WebMethod(operationName = "EchoWithDelayOnSelectedNode", action = "http://tempuri.org/ITestService/EchoWithDelayOnSelectedNode")
    @ResponseWrapper(localName = "EchoWithDelayOnSelectedNodeResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoWithDelayOnSelectedNodeResponse")
    public org.datacontract.schemas._2004._07.services.ComputerInfo echoWithDelayOnSelectedNode(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID,
        @WebParam(name = "selectedNode", targetNamespace = "http://tempuri.org/")
        java.lang.String selectedNode,
        @WebParam(name = "delayOnSelectedNode", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.Duration delayOnSelectedNode,
        @WebParam(name = "delayOnOtherNodes", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.Duration delayOnOtherNodes
    );

    @Action(input = "http://tempuri.org/ITestService/Kill", output = "http://tempuri.org/ITestService/KillResponse")
    @RequestWrapper(localName = "Kill", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Kill")
    @WebMethod(operationName = "Kill", action = "http://tempuri.org/ITestService/Kill")
    @ResponseWrapper(localName = "KillResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.KillResponse")
    public void kill();

    @WebResult(name = "EchoFaultWithNameResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoFaultWithName", output = "http://tempuri.org/ITestService/EchoFaultWithNameResponse", fault = {@FaultAction(className = ITestServiceEchoFaultWithNameExceptionFaultFaultMessage.class, value = "http://tempuri.org/ITestService/EchoFaultWithNameExceptionFault"), @FaultAction(className = ITestServiceEchoFaultWithNameArgumentNullExceptionFaultFaultMessage.class, value = "http://tempuri.org/ITestService/EchoFaultWithNameArgumentNullExceptionFault"), @FaultAction(className = ITestServiceEchoFaultWithNameOutOfMemoryExceptionFaultFaultMessage.class, value = "http://tempuri.org/ITestService/EchoFaultWithNameOutOfMemoryExceptionFault"), @FaultAction(className = ITestServiceEchoFaultWithNameDivideByZeroExceptionFaultFaultMessage.class, value = "http://tempuri.org/ITestService/EchoFaultWithNameDivideByZeroExceptionFault")})
    @RequestWrapper(localName = "EchoFaultWithName", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoFaultWithName")
    @WebMethod(operationName = "EchoFaultWithName", action = "http://tempuri.org/ITestService/EchoFaultWithName")
    @ResponseWrapper(localName = "EchoFaultWithNameResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoFaultWithNameResponse")
    public org.datacontract.schemas._2004._07.services.ComputerInfo echoFaultWithName(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID,
        @WebParam(name = "exceptionName", targetNamespace = "http://tempuri.org/")
        java.lang.String exceptionName
    ) throws ITestServiceEchoFaultWithNameExceptionFaultFaultMessage, ITestServiceEchoFaultWithNameArgumentNullExceptionFaultFaultMessage, ITestServiceEchoFaultWithNameOutOfMemoryExceptionFaultFaultMessage, ITestServiceEchoFaultWithNameDivideByZeroExceptionFaultFaultMessage;

    @WebResult(name = "EchoWithFailResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoWithFail", output = "http://tempuri.org/ITestService/EchoWithFailResponse", fault = {@FaultAction(className = ITestServiceEchoWithFailAuthenticationFailureFaultFaultMessage.class, value = "http://hpc.microsoft.com/session/AuthenticationFailure"), @FaultAction(className = ITestServiceEchoWithFailRetryOperationErrorFaultFaultMessage.class, value = "http://hpc.microsoft.com/session/RetryOperationError")})
    @RequestWrapper(localName = "EchoWithFail", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoWithFail")
    @WebMethod(operationName = "EchoWithFail", action = "http://tempuri.org/ITestService/EchoWithFail")
    @ResponseWrapper(localName = "EchoWithFailResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoWithFailResponse")
    public org.datacontract.schemas._2004._07.services.ComputerInfo echoWithFail(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID,
        @WebParam(name = "failTime", targetNamespace = "http://tempuri.org/")
        java.lang.Integer failTime
    ) throws ITestServiceEchoWithFailAuthenticationFailureFaultFaultMessage, ITestServiceEchoWithFailRetryOperationErrorFaultFaultMessage;

    @WebResult(name = "CheckACLOnAzureResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/CheckACLOnAzure", output = "http://tempuri.org/ITestService/CheckACLOnAzureResponse")
    @RequestWrapper(localName = "CheckACLOnAzure", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CheckACLOnAzure")
    @WebMethod(operationName = "CheckACLOnAzure", action = "http://tempuri.org/ITestService/CheckACLOnAzure")
    @ResponseWrapper(localName = "CheckACLOnAzureResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CheckACLOnAzureResponse")
    public java.lang.String checkACLOnAzure();

    @WebResult(name = "EchoWithOnExitResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoWithOnExit", output = "http://tempuri.org/ITestService/EchoWithOnExitResponse")
    @RequestWrapper(localName = "EchoWithOnExit", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoWithOnExit")
    @WebMethod(operationName = "EchoWithOnExit", action = "http://tempuri.org/ITestService/EchoWithOnExit")
    @ResponseWrapper(localName = "EchoWithOnExitResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoWithOnExitResponse")
    public org.datacontract.schemas._2004._07.services.ComputerInfo echoWithOnExit(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID,
        @WebParam(name = "runTime", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.Duration runTime,
        @WebParam(name = "exitDelay", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.Duration exitDelay,
        @WebParam(name = "logPath", targetNamespace = "http://tempuri.org/")
        java.lang.String logPath
    );

    @WebResult(name = "EchoFaultResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoFault", output = "http://tempuri.org/ITestService/EchoFaultResponse", fault = {@FaultAction(className = ITestServiceEchoFaultExceptionFaultFaultMessage.class, value = "http://tempuri.org/ITestService/EchoFaultExceptionFault"), @FaultAction(className = ITestServiceEchoFaultArgumentNullExceptionFaultFaultMessage.class, value = "http://tempuri.org/ITestService/EchoFaultArgumentNullExceptionFault"), @FaultAction(className = ITestServiceEchoFaultOutOfMemoryExceptionFaultFaultMessage.class, value = "http://tempuri.org/ITestService/EchoFaultOutOfMemoryExceptionFault"), @FaultAction(className = ITestServiceEchoFaultDivideByZeroExceptionFaultFaultMessage.class, value = "http://tempuri.org/ITestService/EchoFaultDivideByZeroExceptionFault")})
    @RequestWrapper(localName = "EchoFault", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoFault")
    @WebMethod(operationName = "EchoFault", action = "http://tempuri.org/ITestService/EchoFault")
    @ResponseWrapper(localName = "EchoFaultResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoFaultResponse")
    public org.datacontract.schemas._2004._07.services.ComputerInfo echoFault(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID,
        @WebParam(name = "ex", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.system.Exception ex
    ) throws ITestServiceEchoFaultExceptionFaultFaultMessage, ITestServiceEchoFaultArgumentNullExceptionFaultFaultMessage, ITestServiceEchoFaultOutOfMemoryExceptionFaultFaultMessage, ITestServiceEchoFaultDivideByZeroExceptionFaultFaultMessage;

    @WebResult(name = "EchoWithDelayResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoWithDelay", output = "http://tempuri.org/ITestService/EchoWithDelayResponse", fault = {@FaultAction(className = ITestServiceEchoWithDelayAuthenticationFailureFaultFaultMessage.class, value = "http://hpc.microsoft.com/session/AuthenticationFailure"), @FaultAction(className = ITestServiceEchoWithDelayRetryOperationErrorFaultFaultMessage.class, value = "http://hpc.microsoft.com/session/RetryOperationError")})
    @RequestWrapper(localName = "EchoWithDelay", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoWithDelay")
    @WebMethod(operationName = "EchoWithDelay", action = "http://tempuri.org/ITestService/EchoWithDelay")
    @ResponseWrapper(localName = "EchoWithDelayResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoWithDelayResponse")
    public org.datacontract.schemas._2004._07.services.ComputerInfo echoWithDelay(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID,
        @WebParam(name = "delay", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.Duration delay
    ) throws ITestServiceEchoWithDelayAuthenticationFailureFaultFaultMessage, ITestServiceEchoWithDelayRetryOperationErrorFaultFaultMessage;

    @WebResult(name = "GenerateLoadWithResponseDataResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/GenerateLoadWithResponseData", output = "http://tempuri.org/ITestService/GenerateLoadWithResponseDataResponse")
    @RequestWrapper(localName = "GenerateLoadWithResponseData", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GenerateLoadWithResponseData")
    @WebMethod(operationName = "GenerateLoadWithResponseData", action = "http://tempuri.org/ITestService/GenerateLoadWithResponseData")
    @ResponseWrapper(localName = "GenerateLoadWithResponseDataResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GenerateLoadWithResponseDataResponse")
    public org.datacontract.schemas._2004._07.services.StatisticInfo generateLoadWithResponseData(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID,
        @WebParam(name = "sleepTime", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.Duration sleepTime,
        @WebParam(name = "input_data", targetNamespace = "http://tempuri.org/")
        byte[] inputData,
        @WebParam(name = "output_data_size", targetNamespace = "http://tempuri.org/")
        java.lang.Integer outputDataSize
    );

    @WebResult(name = "LastTimeResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/LastTime", output = "http://tempuri.org/ITestService/LastTimeResponse")
    @RequestWrapper(localName = "LastTime", targetNamespace = "http://tempuri.org/", className = "org.tempuri.LastTime")
    @WebMethod(operationName = "LastTime", action = "http://tempuri.org/ITestService/LastTime")
    @ResponseWrapper(localName = "LastTimeResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.LastTimeResponse")
    public javax.xml.datatype.XMLGregorianCalendar lastTime(
        @WebParam(name = "millisec", targetNamespace = "http://tempuri.org/")
        java.lang.Integer millisec
    );

    @WebResult(name = "GenerateLoadResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/GenerateLoad", output = "http://tempuri.org/ITestService/GenerateLoadResponse")
    @RequestWrapper(localName = "GenerateLoad", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GenerateLoad")
    @WebMethod(operationName = "GenerateLoad", action = "http://tempuri.org/ITestService/GenerateLoad")
    @ResponseWrapper(localName = "GenerateLoadResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GenerateLoadResponse")
    public org.datacontract.schemas._2004._07.services.StatisticInfo generateLoad(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID,
        @WebParam(name = "millisec", targetNamespace = "http://tempuri.org/")
        java.lang.Long millisec,
        @WebParam(name = "input_data", targetNamespace = "http://tempuri.org/")
        byte[] inputData,
        @WebParam(name = "common_data_path", targetNamespace = "http://tempuri.org/")
        java.lang.String commonDataPath
    );

    @WebResult(name = "ConsumeCPUResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "ConsumeCPU", output = "ConsumeCPUResponse")
    @RequestWrapper(localName = "ConsumeCPU", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsumeCPU")
    @WebMethod(operationName = "ConsumeCPU", action = "ConsumeCPU")
    @ResponseWrapper(localName = "ConsumeCPUResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ConsumeCPUResponse")
    public java.lang.String consumeCPU(
        @WebParam(name = "time", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.Duration time
    );

    @WebResult(name = "EchoAppSettingsResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoAppSettings", output = "http://tempuri.org/ITestService/EchoAppSettingsResponse")
    @RequestWrapper(localName = "EchoAppSettings", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoAppSettings")
    @WebMethod(operationName = "EchoAppSettings", action = "http://tempuri.org/ITestService/EchoAppSettings")
    @ResponseWrapper(localName = "EchoAppSettingsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoAppSettingsResponse")
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring echoAppSettings(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID
    );

    @WebResult(name = "EchoObject4Result", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoObject4", output = "http://tempuri.org/ITestService/EchoObject4Response")
    @RequestWrapper(localName = "EchoObject4", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoObject4")
    @WebMethod(operationName = "EchoObject4", action = "http://tempuri.org/ITestService/EchoObject4")
    @ResponseWrapper(localName = "EchoObject4Response", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoObject4Response")
    public org.datacontract.schemas._2004._07.services.ClassObj echoObject4(
        @WebParam(name = "obj", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.services.ClassObj obj
    );

    @WebResult(name = "EchoResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/Echo", output = "http://tempuri.org/ITestService/EchoResponse", fault = {@FaultAction(className = ITestServiceEchoAuthenticationFailureFaultFaultMessage.class, value = "http://hpc.microsoft.com/session/AuthenticationFailure"), @FaultAction(className = ITestServiceEchoRetryOperationErrorFaultFaultMessage.class, value = "http://hpc.microsoft.com/session/RetryOperationError")})
    @RequestWrapper(localName = "Echo", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Echo")
    @WebMethod(operationName = "Echo", action = "http://tempuri.org/ITestService/Echo")
    @ResponseWrapper(localName = "EchoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoResponse")
    public org.datacontract.schemas._2004._07.services.ComputerInfo echo(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID
    ) throws ITestServiceEchoAuthenticationFailureFaultFaultMessage, ITestServiceEchoRetryOperationErrorFaultFaultMessage;

    @WebResult(name = "EchoExceptionResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ITestService/EchoException", output = "http://tempuri.org/ITestService/EchoExceptionResponse")
    @RequestWrapper(localName = "EchoException", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoException")
    @WebMethod(operationName = "EchoException", action = "http://tempuri.org/ITestService/EchoException")
    @ResponseWrapper(localName = "EchoExceptionResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoExceptionResponse")
    public org.datacontract.schemas._2004._07.services.ComputerInfo echoException(
        @WebParam(name = "refID", targetNamespace = "http://tempuri.org/")
        java.lang.Integer refID,
        @WebParam(name = "ex", targetNamespace = "http://tempuri.org/")
        org.datacontract.schemas._2004._07.system.Exception ex
    );
}
