
package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ws_service", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsService {


    /**
     * 
     * @param tComptes
     */
    @WebMethod
    @RequestWrapper(localName = "create", targetNamespace = "http://ws/", className = "ws.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "http://ws/", className = "ws.CreateResponse")
    @Action(input = "http://ws/ws_service/createRequest", output = "http://ws/ws_service/createResponse")
    public void create(
        @WebParam(name = "tComptes", targetNamespace = "")
        TComptes tComptes);

    /**
     * 
     * @param amount
     * @param sourceAccountNumber
     */
    @WebMethod
    @RequestWrapper(localName = "versement", targetNamespace = "http://ws/", className = "ws.Versement")
    @ResponseWrapper(localName = "versementResponse", targetNamespace = "http://ws/", className = "ws.VersementResponse")
    @Action(input = "http://ws/ws_service/versementRequest", output = "http://ws/ws_service/versementResponse")
    public void versement(
        @WebParam(name = "sourceAccountNumber", targetNamespace = "")
        int sourceAccountNumber,
        @WebParam(name = "amount", targetNamespace = "")
        double amount);

    /**
     * 
     * @return
     *     returns java.util.List<ws.TComptes>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findall", targetNamespace = "http://ws/", className = "ws.Findall")
    @ResponseWrapper(localName = "findallResponse", targetNamespace = "http://ws/", className = "ws.FindallResponse")
    @Action(input = "http://ws/ws_service/findallRequest", output = "http://ws/ws_service/findallResponse")
    public List<TComptes> findall();

    /**
     * 
     * @return
     *     returns java.util.List<ws.TEmployes>
     */
    @WebMethod(operationName = "findall_employe")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findall_employe", targetNamespace = "http://ws/", className = "ws.FindallEmploye")
    @ResponseWrapper(localName = "findall_employeResponse", targetNamespace = "http://ws/", className = "ws.FindallEmployeResponse")
    @Action(input = "http://ws/ws_service/findall_employeRequest", output = "http://ws/ws_service/findall_employeResponse")
    public List<TEmployes> findallEmploye();

    /**
     * 
     * @param tOperations
     */
    @WebMethod(operationName = "create_operation")
    @RequestWrapper(localName = "create_operation", targetNamespace = "http://ws/", className = "ws.CreateOperation")
    @ResponseWrapper(localName = "create_operationResponse", targetNamespace = "http://ws/", className = "ws.CreateOperationResponse")
    @Action(input = "http://ws/ws_service/create_operationRequest", output = "http://ws/ws_service/create_operationResponse")
    public void createOperation(
        @WebParam(name = "tOperations", targetNamespace = "")
        TOperations tOperations);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://ws/", className = "ws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://ws/", className = "ws.HelloResponse")
    @Action(input = "http://ws/ws_service/helloRequest", output = "http://ws/ws_service/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param id
     * @return
     *     returns ws.TComptes
     */
    @WebMethod(operationName = "find_Compte_by_id")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "find_Compte_by_id", targetNamespace = "http://ws/", className = "ws.FindCompteById")
    @ResponseWrapper(localName = "find_Compte_by_idResponse", targetNamespace = "http://ws/", className = "ws.FindCompteByIdResponse")
    @Action(input = "http://ws/ws_service/find_Compte_by_idRequest", output = "http://ws/ws_service/find_Compte_by_idResponse")
    public TComptes findCompteById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param id
     * @return
     *     returns ws.TEmployes
     */
    @WebMethod(operationName = "find_Employe_by_id")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "find_Employe_by_id", targetNamespace = "http://ws/", className = "ws.FindEmployeById")
    @ResponseWrapper(localName = "find_Employe_by_idResponse", targetNamespace = "http://ws/", className = "ws.FindEmployeByIdResponse")
    @Action(input = "http://ws/ws_service/find_Employe_by_idRequest", output = "http://ws/ws_service/find_Employe_by_idResponse")
    public TEmployes findEmployeById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param arg0
     */
    @WebMethod(operationName = "remove_compte")
    @RequestWrapper(localName = "remove_compte", targetNamespace = "http://ws/", className = "ws.RemoveCompte")
    @ResponseWrapper(localName = "remove_compteResponse", targetNamespace = "http://ws/", className = "ws.RemoveCompteResponse")
    @Action(input = "http://ws/ws_service/remove_compteRequest", output = "http://ws/ws_service/remove_compteResponse")
    public void removeCompte(
        @WebParam(name = "arg0", targetNamespace = "")
        TComptes arg0);

    /**
     * 
     * @param amount
     * @param sourceAccountNumber
     */
    @WebMethod
    @RequestWrapper(localName = "retrait", targetNamespace = "http://ws/", className = "ws.Retrait")
    @ResponseWrapper(localName = "retraitResponse", targetNamespace = "http://ws/", className = "ws.RetraitResponse")
    @Action(input = "http://ws/ws_service/retraitRequest", output = "http://ws/ws_service/retraitResponse")
    public void retrait(
        @WebParam(name = "sourceAccountNumber", targetNamespace = "")
        int sourceAccountNumber,
        @WebParam(name = "amount", targetNamespace = "")
        double amount);

}
