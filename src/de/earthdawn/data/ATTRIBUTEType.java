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
 * <p>Java class for ATTRIBUTE_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATTRIBUTE_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://earthdawn.com/datatypes}STEPDICE_type">
 *       &lt;attribute name="name" use="required" type="{http://earthdawn.com/datatypes}ATTRIBUTE_name_type" />
 *       &lt;attribute name="racevalue" type="{http://earthdawn.com/datatypes}unsigned_int" default="10" />
 *       &lt;attribute name="generationvalue" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="basevalue" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="lpincrease" type="{http://earthdawn.com/datatypes}lpincrease_type" default="0" />
 *       &lt;attribute name="currentvalue" type="{http://earthdawn.com/datatypes}unsigned_int" default="10" />
 *       &lt;attribute name="cost" type="{http://earthdawn.com/datatypes}attcost_type" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATTRIBUTE_type")
public class ATTRIBUTEType
    extends STEPDICEType
{

    @XmlAttribute(required = true)
    protected ATTRIBUTENameType name;
    @XmlAttribute
    protected Integer racevalue;
    @XmlAttribute
    protected Integer generationvalue;
    @XmlAttribute
    protected Integer basevalue;
    @XmlAttribute
    protected Integer lpincrease;
    @XmlAttribute
    protected Integer currentvalue;
    @XmlAttribute
    protected Integer cost;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ATTRIBUTENameType }
     *     
     */
    public ATTRIBUTENameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATTRIBUTENameType }
     *     
     */
    public void setName(ATTRIBUTENameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the racevalue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRacevalue() {
        if (racevalue == null) {
            return  10;
        } else {
            return racevalue;
        }
    }

    /**
     * Sets the value of the racevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRacevalue(Integer value) {
        this.racevalue = value;
    }

    /**
     * Gets the value of the generationvalue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getGenerationvalue() {
        if (generationvalue == null) {
            return  0;
        } else {
            return generationvalue;
        }
    }

    /**
     * Sets the value of the generationvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGenerationvalue(Integer value) {
        this.generationvalue = value;
    }

    /**
     * Gets the value of the basevalue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getBasevalue() {
        if (basevalue == null) {
            return  0;
        } else {
            return basevalue;
        }
    }

    /**
     * Sets the value of the basevalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBasevalue(Integer value) {
        this.basevalue = value;
    }

    /**
     * Gets the value of the lpincrease property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLpincrease() {
        if (lpincrease == null) {
            return  0;
        } else {
            return lpincrease;
        }
    }

    /**
     * Sets the value of the lpincrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLpincrease(Integer value) {
        this.lpincrease = value;
    }

    /**
     * Gets the value of the currentvalue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCurrentvalue() {
        if (currentvalue == null) {
            return  10;
        } else {
            return currentvalue;
        }
    }

    /**
     * Sets the value of the currentvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentvalue(Integer value) {
        this.currentvalue = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCost() {
        if (cost == null) {
            return  0;
        } else {
            return cost;
        }
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCost(Integer value) {
        this.cost = value;
    }

}
