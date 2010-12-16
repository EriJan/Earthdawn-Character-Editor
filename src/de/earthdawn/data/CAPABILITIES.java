//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="SKILL" type="{http://earthdawn.com/datatypes}CAPABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TALENT" type="{http://earthdawn.com/datatypes}CAPABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="lang" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "skillOrTALENT"
})
@XmlRootElement(name = "CAPABILITIES", namespace = "http://earthdawn.com/capability")
public class CAPABILITIES {

    @XmlElementRefs({
        @XmlElementRef(name = "SKILL", namespace = "http://earthdawn.com/capability", type = JAXBElement.class),
        @XmlElementRef(name = "TALENT", namespace = "http://earthdawn.com/capability", type = JAXBElement.class)
    })
    protected List<JAXBElement<CAPABILITYType>> skillOrTALENT;
    @XmlAttribute(required = true)
    protected String lang;

    /**
     * Gets the value of the skillOrTALENT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skillOrTALENT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSKILLOrTALENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CAPABILITYType }{@code >}
     * {@link JAXBElement }{@code <}{@link CAPABILITYType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<CAPABILITYType>> getSKILLOrTALENT() {
        if (skillOrTALENT == null) {
            skillOrTALENT = new ArrayList<JAXBElement<CAPABILITYType>>();
        }
        return this.skillOrTALENT;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
