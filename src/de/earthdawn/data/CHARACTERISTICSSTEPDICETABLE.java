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
 * <p>Java class for CHARACTERISTICS_STEPDICETABLE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHARACTERISTICS_STEPDICETABLE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://earthdawn.com/datatypes}STEPDICE_type">
 *       &lt;attribute name="attribute" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHARACTERISTICS_STEPDICETABLE", namespace = "http://earthdawn.com/characteristics")
public class CHARACTERISTICSSTEPDICETABLE
    extends STEPDICEType
{

    @XmlAttribute(required = true)
    protected int attribute;

    /**
     * Gets the value of the attribute property.
     * 
     */
    public int getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     */
    public void setAttribute(int value) {
        this.attribute = value;
    }

}