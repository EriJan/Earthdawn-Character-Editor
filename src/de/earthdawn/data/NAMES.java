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
 *         &lt;element name="ATTRIBUTES" type="{http://earthdawn.com/names}NAMES_ATTRIBUTES_type"/>
 *         &lt;element name="DURABILITY" type="{http://earthdawn.com/names}NAME_LANG_type"/>
 *         &lt;element name="VERSATILITY" type="{http://earthdawn.com/names}NAME_LANG_type"/>
 *         &lt;element name="KARMARUTUAL" type="{http://earthdawn.com/names}NAME_LANG_type"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "attributesOrDURABILITYOrVERSATILITY"
})
@XmlRootElement(name = "NAMES", namespace = "http://earthdawn.com/names")
public class NAMES {

    @XmlElementRefs({
        @XmlElementRef(name = "KARMARUTUAL", namespace = "http://earthdawn.com/names", type = JAXBElement.class),
        @XmlElementRef(name = "VERSATILITY", namespace = "http://earthdawn.com/names", type = JAXBElement.class),
        @XmlElementRef(name = "ATTRIBUTES", namespace = "http://earthdawn.com/names", type = JAXBElement.class),
        @XmlElementRef(name = "DURABILITY", namespace = "http://earthdawn.com/names", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> attributesOrDURABILITYOrVERSATILITY;

    /**
     * Gets the value of the attributesOrDURABILITYOrVERSATILITY property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributesOrDURABILITYOrVERSATILITY property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATTRIBUTESOrDURABILITYOrVERSATILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link NAMELANGType }{@code >}
     * {@link JAXBElement }{@code <}{@link NAMELANGType }{@code >}
     * {@link JAXBElement }{@code <}{@link NAMESATTRIBUTESType }{@code >}
     * {@link JAXBElement }{@code <}{@link NAMELANGType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getATTRIBUTESOrDURABILITYOrVERSATILITY() {
        if (attributesOrDURABILITYOrVERSATILITY == null) {
            attributesOrDURABILITYOrVERSATILITY = new ArrayList<JAXBElement<?>>();
        }
        return this.attributesOrDURABILITYOrVERSATILITY;
    }

}
