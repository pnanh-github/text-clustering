//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.10 at 03:15:13 AM ICT 
//


package yahoo.answers;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the yahoo.answers package. 
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

    private final static QName _Link_QNAME = new QName("urn:yahoo:answers", "Link");
    private final static QName _ChosenAnswer_QNAME = new QName("urn:yahoo:answers", "ChosenAnswer");
    private final static QName _UserPhotoURL_QNAME = new QName("urn:yahoo:answers", "UserPhotoURL");
    private final static QName _ChosenAnswererId_QNAME = new QName("urn:yahoo:answers", "ChosenAnswererId");
    private final static QName _ChosenAnswererNick_QNAME = new QName("urn:yahoo:answers", "ChosenAnswererNick");
    private final static QName _ChosenAnswerTimestamp_QNAME = new QName("urn:yahoo:answers", "ChosenAnswerTimestamp");
    private final static QName _Date_QNAME = new QName("urn:yahoo:answers", "Date");
    private final static QName _ChosenAnswerAwardTimestamp_QNAME = new QName("urn:yahoo:answers", "ChosenAnswerAwardTimestamp");
    private final static QName _Content_QNAME = new QName("urn:yahoo:answers", "Content");
    private final static QName _NumComments_QNAME = new QName("urn:yahoo:answers", "NumComments");
    private final static QName _Subject_QNAME = new QName("urn:yahoo:answers", "Subject");
    private final static QName _UserNick_QNAME = new QName("urn:yahoo:answers", "UserNick");
    private final static QName _UserId_QNAME = new QName("urn:yahoo:answers", "UserId");
    private final static QName _NumAnswers_QNAME = new QName("urn:yahoo:answers", "NumAnswers");
    private final static QName _Timestamp_QNAME = new QName("urn:yahoo:answers", "Timestamp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: yahoo.answers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Question }
     * 
     */
    public Question createQuestion() {
        return new Question();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:yahoo:answers", name = "Link")
    public JAXBElement<String> createLink(String value) {
        return new JAXBElement<String>(_Link_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:yahoo:answers", name = "ChosenAnswer")
    public JAXBElement<String> createChosenAnswer(String value) {
        return new JAXBElement<String>(_ChosenAnswer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:yahoo:answers", name = "UserPhotoURL")
    public JAXBElement<String> createUserPhotoURL(String value) {
        return new JAXBElement<String>(_UserPhotoURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:yahoo:answers", name = "ChosenAnswererId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createChosenAnswererId(String value) {
        return new JAXBElement<String>(_ChosenAnswererId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:yahoo:answers", name = "ChosenAnswererNick")
    public JAXBElement<String> createChosenAnswererNick(String value) {
        return new JAXBElement<String>(_ChosenAnswererNick_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:yahoo:answers", name = "ChosenAnswerTimestamp")
    public JAXBElement<BigInteger> createChosenAnswerTimestamp(BigInteger value) {
        return new JAXBElement<BigInteger>(_ChosenAnswerTimestamp_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:yahoo:answers", name = "Date")
    public JAXBElement<String> createDate(String value) {
        return new JAXBElement<String>(_Date_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:yahoo:answers", name = "ChosenAnswerAwardTimestamp")
    public JAXBElement<BigInteger> createChosenAnswerAwardTimestamp(BigInteger value) {
        return new JAXBElement<BigInteger>(_ChosenAnswerAwardTimestamp_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:yahoo:answers", name = "Content")
    public JAXBElement<String> createContent(String value) {
        return new JAXBElement<String>(_Content_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:yahoo:answers", name = "NumComments")
    public JAXBElement<BigInteger> createNumComments(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumComments_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:yahoo:answers", name = "Subject")
    public JAXBElement<String> createSubject(String value) {
        return new JAXBElement<String>(_Subject_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:yahoo:answers", name = "UserNick")
    public JAXBElement<String> createUserNick(String value) {
        return new JAXBElement<String>(_UserNick_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:yahoo:answers", name = "UserId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUserId(String value) {
        return new JAXBElement<String>(_UserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:yahoo:answers", name = "NumAnswers")
    public JAXBElement<BigInteger> createNumAnswers(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumAnswers_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:yahoo:answers", name = "Timestamp")
    public JAXBElement<BigInteger> createTimestamp(BigInteger value) {
        return new JAXBElement<BigInteger>(_Timestamp_QNAME, BigInteger.class, null, value);
    }

}