//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KARMAABILITY_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KARMAABILITY_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="circle" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="spend" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KARMAABILITY_type")
public class KARMAABILITYType {

    @XmlAttribute(required = true)
    protected int circle;
    @XmlAttribute(required = true)
    protected String spend;

    /**
     * Gets the value of the circle property.
     * 
     */
    public int getCircle() {
        return circle;
    }

    /**
     * Sets the value of the circle property.
     * 
     */
    public void setCircle(int value) {
        this.circle = value;
    }

    /**
     * Gets the value of the spend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpend() {
        return spend;
    }

    /**
     * Sets the value of the spend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpend(String value) {
        this.spend = value;
    }

}
