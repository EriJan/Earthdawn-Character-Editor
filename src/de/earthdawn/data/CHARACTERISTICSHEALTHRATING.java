//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
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
 * <p>Java class for CHARACTERISTICS_HEALTHRATING complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHARACTERISTICS_HEALTHRATING">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="value" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="death" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="unconsciousness" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="wound" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="recovery" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHARACTERISTICS_HEALTHRATING", namespace = "http://earthdawn.com/characteristics")
public class CHARACTERISTICSHEALTHRATING {

    @XmlAttribute(name = "value", required = true)
    protected int value;
    @XmlAttribute(name = "death", required = true)
    protected int death;
    @XmlAttribute(name = "unconsciousness", required = true)
    protected int unconsciousness;
    @XmlAttribute(name = "wound", required = true)
    protected int wound;
    @XmlAttribute(name = "recovery", required = true)
    protected int recovery;

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the death property.
     * 
     */
    public int getDeath() {
        return death;
    }

    /**
     * Sets the value of the death property.
     * 
     */
    public void setDeath(int value) {
        this.death = value;
    }

    /**
     * Gets the value of the unconsciousness property.
     * 
     */
    public int getUnconsciousness() {
        return unconsciousness;
    }

    /**
     * Sets the value of the unconsciousness property.
     * 
     */
    public void setUnconsciousness(int value) {
        this.unconsciousness = value;
    }

    /**
     * Gets the value of the wound property.
     * 
     */
    public int getWound() {
        return wound;
    }

    /**
     * Sets the value of the wound property.
     * 
     */
    public void setWound(int value) {
        this.wound = value;
    }

    /**
     * Gets the value of the recovery property.
     * 
     */
    public int getRecovery() {
        return recovery;
    }

    /**
     * Sets the value of the recovery property.
     * 
     */
    public void setRecovery(int value) {
        this.recovery = value;
    }

}
