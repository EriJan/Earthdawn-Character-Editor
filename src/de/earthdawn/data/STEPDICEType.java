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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STEPDICE_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STEPDICE_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="step" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="dice" type="{http://earthdawn.com/datatypes}dice_type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STEPDICE_type")
@XmlSeeAlso({
    RANKType.class,
    ATTRIBUTEType.class,
    INITIATIVEType.class,
    RECOVERYType.class
})
public class STEPDICEType {

    @XmlAttribute(required = true)
    protected int step;
    @XmlAttribute
    protected DiceType dice;

    /**
     * Gets the value of the step property.
     * 
     */
    public int getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     */
    public void setStep(int value) {
        this.step = value;
    }

    /**
     * Gets the value of the dice property.
     * 
     * @return
     *     possible object is
     *     {@link DiceType }
     *     
     */
    public DiceType getDice() {
        return dice;
    }

    /**
     * Sets the value of the dice property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiceType }
     *     
     */
    public void setDice(DiceType value) {
        this.dice = value;
    }

}
