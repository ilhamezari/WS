
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _Convert_QNAME = new QName("http://WS/", "convert");
    private final static QName _ConvertResponse_QNAME = new QName("http://WS/", "convertResponse");
    private final static QName _Getcompte_QNAME = new QName("http://WS/", "getcompte");
    private final static QName _GetcompteResponse_QNAME = new QName("http://WS/", "getcompteResponse");
    private final static QName _Listecomptes_QNAME = new QName("http://WS/", "listecomptes");
    private final static QName _ListecomptesResponse_QNAME = new QName("http://WS/", "listecomptesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Convert }
     * 
     * @return
     *     the new instance of {@link Convert }
     */
    public Convert createConvert() {
        return new Convert();
    }

    /**
     * Create an instance of {@link ConvertResponse }
     * 
     * @return
     *     the new instance of {@link ConvertResponse }
     */
    public ConvertResponse createConvertResponse() {
        return new ConvertResponse();
    }

    /**
     * Create an instance of {@link Getcompte }
     * 
     * @return
     *     the new instance of {@link Getcompte }
     */
    public Getcompte createGetcompte() {
        return new Getcompte();
    }

    /**
     * Create an instance of {@link GetcompteResponse }
     * 
     * @return
     *     the new instance of {@link GetcompteResponse }
     */
    public GetcompteResponse createGetcompteResponse() {
        return new GetcompteResponse();
    }

    /**
     * Create an instance of {@link Listecomptes }
     * 
     * @return
     *     the new instance of {@link Listecomptes }
     */
    public Listecomptes createListecomptes() {
        return new Listecomptes();
    }

    /**
     * Create an instance of {@link ListecomptesResponse }
     * 
     * @return
     *     the new instance of {@link ListecomptesResponse }
     */
    public ListecomptesResponse createListecomptesResponse() {
        return new ListecomptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "convert")
    public JAXBElement<Convert> createConvert(Convert value) {
        return new JAXBElement<>(_Convert_QNAME, Convert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "convertResponse")
    public JAXBElement<ConvertResponse> createConvertResponse(ConvertResponse value) {
        return new JAXBElement<>(_ConvertResponse_QNAME, ConvertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getcompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Getcompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getcompte")
    public JAXBElement<Getcompte> createGetcompte(Getcompte value) {
        return new JAXBElement<>(_Getcompte_QNAME, Getcompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetcompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetcompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getcompteResponse")
    public JAXBElement<GetcompteResponse> createGetcompteResponse(GetcompteResponse value) {
        return new JAXBElement<>(_GetcompteResponse_QNAME, GetcompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listecomptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Listecomptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "listecomptes")
    public JAXBElement<Listecomptes> createListecomptes(Listecomptes value) {
        return new JAXBElement<>(_Listecomptes_QNAME, Listecomptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListecomptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListecomptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "listecomptesResponse")
    public JAXBElement<ListecomptesResponse> createListecomptesResponse(ListecomptesResponse value) {
        return new JAXBElement<>(_ListecomptesResponse_QNAME, ListecomptesResponse.class, null, value);
    }

}
