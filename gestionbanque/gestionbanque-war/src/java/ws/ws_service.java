/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import beans.TClientsFacade;
import beans.TComptesFacade;
import beans.TEmployesFacade;
import beans.TOperationsFacade;
import entity.TComptes;
import entity.TEmployes;
import entity.TOperations;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceException;

/**
 *
 * @author ibelm
 */
@WebService(serviceName = "ws_service")
public class ws_service {

    @EJB
    private TOperationsFacade tOperationsFacade;

    @EJB
    private TEmployesFacade tEmployesFacade;

    @EJB
    private TComptesFacade tComptesFacade;

    @EJB
    private TClientsFacade tClientsFacade;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    
    //create compte
    @WebMethod(operationName = "create")
    public void create_Compte(@WebParam(name = "tComptes") TComptes tComptes) {
        tComptesFacade.create(tComptes);
    }

    //create operation
    @WebMethod(operationName = "create_operation")
    public void create_Operation(@WebParam(name = "tOperations") TOperations tOperations) {
        tOperationsFacade.create(tOperations);
    }
    
    // give all compte
    @WebMethod(operationName = "findall")
    public List<TComptes> find_All_Compte() {
        return tComptesFacade.findAll();
    }
    
    // find all employe
    @WebMethod(operationName = "findall_employe")
    public List<TEmployes> find_All_Employe() {
        return tEmployesFacade.findAll();
    }

    // find compte by 
    @WebMethod(operationName = "find_Compte_by_id")
    public TComptes find_Compte_by_id(@WebParam(name = "id") int id) {
        return tComptesFacade.find(id);
    }

    // find employe by 
    @WebMethod(operationName = "find_Employe_by_id")
    public TEmployes find_Employe_by_id(@WebParam(name = "id") int id) {
        return tEmployesFacade.find(id);
    }
    
    //delete compte 
    @WebMethod(operationName = "remove_compte")
    public void remove_compte(@WebParam(name = "") TComptes tComptes) {
        tComptesFacade.remove(tComptes);
    }
    
    // Versement
    @WebMethod(operationName = "versement")
    public void versement(
            @WebParam(name = "sourceAccountNumber") int sourceAccountNumber,
            @WebParam(name = "amount") double amount) {
        try {
                tOperationsFacade.versement(sourceAccountNumber, amount);
            
        } catch (Exception e) {
            // Handle exceptions
            throw new WebServiceException("Error performing versement", e);
        }
    }
    
    // Retrait
    @WebMethod(operationName = "retrait")
    public void retrait(
            @WebParam(name = "sourceAccountNumber") int sourceAccountNumber,
            @WebParam(name = "amount") double amount) {
        try {
            // Input validation
           
                tOperationsFacade.retrait(sourceAccountNumber, amount);
           
        } catch (Exception e) {
            // Handle exceptions
            throw new WebServiceException("Error performing retrait", e);
        }
    }
}
