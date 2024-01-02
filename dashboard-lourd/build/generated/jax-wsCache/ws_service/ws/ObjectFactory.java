
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Create_QNAME = new QName("http://ws/", "create");
    private final static QName _CreateResponse_QNAME = new QName("http://ws/", "createResponse");
    private final static QName _CreateOperation_QNAME = new QName("http://ws/", "create_operation");
    private final static QName _CreateOperationResponse_QNAME = new QName("http://ws/", "create_operationResponse");
    private final static QName _FindCompteById_QNAME = new QName("http://ws/", "find_Compte_by_id");
    private final static QName _FindCompteByIdResponse_QNAME = new QName("http://ws/", "find_Compte_by_idResponse");
    private final static QName _FindEmployeById_QNAME = new QName("http://ws/", "find_Employe_by_id");
    private final static QName _FindEmployeByIdResponse_QNAME = new QName("http://ws/", "find_Employe_by_idResponse");
    private final static QName _Findall_QNAME = new QName("http://ws/", "findall");
    private final static QName _FindallResponse_QNAME = new QName("http://ws/", "findallResponse");
    private final static QName _FindallEmploye_QNAME = new QName("http://ws/", "findall_employe");
    private final static QName _FindallEmployeResponse_QNAME = new QName("http://ws/", "findall_employeResponse");
    private final static QName _Hello_QNAME = new QName("http://ws/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://ws/", "helloResponse");
    private final static QName _RemoveCompte_QNAME = new QName("http://ws/", "remove_compte");
    private final static QName _RemoveCompteResponse_QNAME = new QName("http://ws/", "remove_compteResponse");
    private final static QName _Retrait_QNAME = new QName("http://ws/", "retrait");
    private final static QName _RetraitResponse_QNAME = new QName("http://ws/", "retraitResponse");
    private final static QName _TClients_QNAME = new QName("http://ws/", "tClients");
    private final static QName _TComptes_QNAME = new QName("http://ws/", "tComptes");
    private final static QName _TEmployes_QNAME = new QName("http://ws/", "tEmployes");
    private final static QName _TOperations_QNAME = new QName("http://ws/", "tOperations");
    private final static QName _Versement_QNAME = new QName("http://ws/", "versement");
    private final static QName _VersementResponse_QNAME = new QName("http://ws/", "versementResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link CreateOperation }
     * 
     */
    public CreateOperation createCreateOperation() {
        return new CreateOperation();
    }

    /**
     * Create an instance of {@link CreateOperationResponse }
     * 
     */
    public CreateOperationResponse createCreateOperationResponse() {
        return new CreateOperationResponse();
    }

    /**
     * Create an instance of {@link FindCompteById }
     * 
     */
    public FindCompteById createFindCompteById() {
        return new FindCompteById();
    }

    /**
     * Create an instance of {@link FindCompteByIdResponse }
     * 
     */
    public FindCompteByIdResponse createFindCompteByIdResponse() {
        return new FindCompteByIdResponse();
    }

    /**
     * Create an instance of {@link FindEmployeById }
     * 
     */
    public FindEmployeById createFindEmployeById() {
        return new FindEmployeById();
    }

    /**
     * Create an instance of {@link FindEmployeByIdResponse }
     * 
     */
    public FindEmployeByIdResponse createFindEmployeByIdResponse() {
        return new FindEmployeByIdResponse();
    }

    /**
     * Create an instance of {@link Findall }
     * 
     */
    public Findall createFindall() {
        return new Findall();
    }

    /**
     * Create an instance of {@link FindallResponse }
     * 
     */
    public FindallResponse createFindallResponse() {
        return new FindallResponse();
    }

    /**
     * Create an instance of {@link FindallEmploye }
     * 
     */
    public FindallEmploye createFindallEmploye() {
        return new FindallEmploye();
    }

    /**
     * Create an instance of {@link FindallEmployeResponse }
     * 
     */
    public FindallEmployeResponse createFindallEmployeResponse() {
        return new FindallEmployeResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link RemoveCompte }
     * 
     */
    public RemoveCompte createRemoveCompte() {
        return new RemoveCompte();
    }

    /**
     * Create an instance of {@link RemoveCompteResponse }
     * 
     */
    public RemoveCompteResponse createRemoveCompteResponse() {
        return new RemoveCompteResponse();
    }

    /**
     * Create an instance of {@link Retrait }
     * 
     */
    public Retrait createRetrait() {
        return new Retrait();
    }

    /**
     * Create an instance of {@link RetraitResponse }
     * 
     */
    public RetraitResponse createRetraitResponse() {
        return new RetraitResponse();
    }

    /**
     * Create an instance of {@link TClients }
     * 
     */
    public TClients createTClients() {
        return new TClients();
    }

    /**
     * Create an instance of {@link TComptes }
     * 
     */
    public TComptes createTComptes() {
        return new TComptes();
    }

    /**
     * Create an instance of {@link TEmployes }
     * 
     */
    public TEmployes createTEmployes() {
        return new TEmployes();
    }

    /**
     * Create an instance of {@link TOperations }
     * 
     */
    public TOperations createTOperations() {
        return new TOperations();
    }

    /**
     * Create an instance of {@link Versement }
     * 
     */
    public Versement createVersement() {
        return new Versement();
    }

    /**
     * Create an instance of {@link VersementResponse }
     * 
     */
    public VersementResponse createVersementResponse() {
        return new VersementResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Create }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateOperation }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "create_operation")
    public JAXBElement<CreateOperation> createCreateOperation(CreateOperation value) {
        return new JAXBElement<CreateOperation>(_CreateOperation_QNAME, CreateOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateOperationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "create_operationResponse")
    public JAXBElement<CreateOperationResponse> createCreateOperationResponse(CreateOperationResponse value) {
        return new JAXBElement<CreateOperationResponse>(_CreateOperationResponse_QNAME, CreateOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCompteById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindCompteById }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "find_Compte_by_id")
    public JAXBElement<FindCompteById> createFindCompteById(FindCompteById value) {
        return new JAXBElement<FindCompteById>(_FindCompteById_QNAME, FindCompteById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCompteByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindCompteByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "find_Compte_by_idResponse")
    public JAXBElement<FindCompteByIdResponse> createFindCompteByIdResponse(FindCompteByIdResponse value) {
        return new JAXBElement<FindCompteByIdResponse>(_FindCompteByIdResponse_QNAME, FindCompteByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmployeById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindEmployeById }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "find_Employe_by_id")
    public JAXBElement<FindEmployeById> createFindEmployeById(FindEmployeById value) {
        return new JAXBElement<FindEmployeById>(_FindEmployeById_QNAME, FindEmployeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmployeByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindEmployeByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "find_Employe_by_idResponse")
    public JAXBElement<FindEmployeByIdResponse> createFindEmployeByIdResponse(FindEmployeByIdResponse value) {
        return new JAXBElement<FindEmployeByIdResponse>(_FindEmployeByIdResponse_QNAME, FindEmployeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Findall }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Findall }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findall")
    public JAXBElement<Findall> createFindall(Findall value) {
        return new JAXBElement<Findall>(_Findall_QNAME, Findall.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindallResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindallResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findallResponse")
    public JAXBElement<FindallResponse> createFindallResponse(FindallResponse value) {
        return new JAXBElement<FindallResponse>(_FindallResponse_QNAME, FindallResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindallEmploye }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindallEmploye }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findall_employe")
    public JAXBElement<FindallEmploye> createFindallEmploye(FindallEmploye value) {
        return new JAXBElement<FindallEmploye>(_FindallEmploye_QNAME, FindallEmploye.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindallEmployeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindallEmployeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findall_employeResponse")
    public JAXBElement<FindallEmployeResponse> createFindallEmployeResponse(FindallEmployeResponse value) {
        return new JAXBElement<FindallEmployeResponse>(_FindallEmployeResponse_QNAME, FindallEmployeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "remove_compte")
    public JAXBElement<RemoveCompte> createRemoveCompte(RemoveCompte value) {
        return new JAXBElement<RemoveCompte>(_RemoveCompte_QNAME, RemoveCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "remove_compteResponse")
    public JAXBElement<RemoveCompteResponse> createRemoveCompteResponse(RemoveCompteResponse value) {
        return new JAXBElement<RemoveCompteResponse>(_RemoveCompteResponse_QNAME, RemoveCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retrait }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Retrait }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "retrait")
    public JAXBElement<Retrait> createRetrait(Retrait value) {
        return new JAXBElement<Retrait>(_Retrait_QNAME, Retrait.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetraitResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetraitResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "retraitResponse")
    public JAXBElement<RetraitResponse> createRetraitResponse(RetraitResponse value) {
        return new JAXBElement<RetraitResponse>(_RetraitResponse_QNAME, RetraitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TClients }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TClients }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "tClients")
    public JAXBElement<TClients> createTClients(TClients value) {
        return new JAXBElement<TClients>(_TClients_QNAME, TClients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "tComptes")
    public JAXBElement<TComptes> createTComptes(TComptes value) {
        return new JAXBElement<TComptes>(_TComptes_QNAME, TComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEmployes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TEmployes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "tEmployes")
    public JAXBElement<TEmployes> createTEmployes(TEmployes value) {
        return new JAXBElement<TEmployes>(_TEmployes_QNAME, TEmployes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TOperations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TOperations }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "tOperations")
    public JAXBElement<TOperations> createTOperations(TOperations value) {
        return new JAXBElement<TOperations>(_TOperations_QNAME, TOperations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Versement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Versement }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "versement")
    public JAXBElement<Versement> createVersement(Versement value) {
        return new JAXBElement<Versement>(_Versement_QNAME, Versement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersementResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VersementResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "versementResponse")
    public JAXBElement<VersementResponse> createVersementResponse(VersementResponse value) {
        return new JAXBElement<VersementResponse>(_VersementResponse_QNAME, VersementResponse.class, null, value);
    }

}
