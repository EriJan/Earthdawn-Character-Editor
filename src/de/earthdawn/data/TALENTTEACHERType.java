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
 * <p>Java class for TALENTTEACHER_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TALENTTEACHER_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="discipline" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="talentcircle" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="teachercircle" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="byversatility" type="{http://earthdawn.com/datatypes}yesno_type" default="no" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TALENTTEACHER_type")
public class TALENTTEACHERType {

    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String discipline;
    @XmlAttribute
    protected Integer talentcircle;
    @XmlAttribute
    protected Integer teachercircle;
    @XmlAttribute
    protected String comment;
    @XmlAttribute
    protected YesnoType byversatility;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        if (name == null) {
            return "";
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the discipline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscipline() {
        if (discipline == null) {
            return "";
        } else {
            return discipline;
        }
    }

    /**
     * Sets the value of the discipline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscipline(String value) {
        this.discipline = value;
    }

    /**
     * Gets the value of the talentcircle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getTalentcircle() {
        if (talentcircle == null) {
            return  0;
        } else {
            return talentcircle;
        }
    }

    /**
     * Sets the value of the talentcircle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTalentcircle(Integer value) {
        this.talentcircle = value;
    }

    /**
     * Gets the value of the teachercircle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getTeachercircle() {
        if (teachercircle == null) {
            return  0;
        } else {
            return teachercircle;
        }
    }

    /**
     * Sets the value of the teachercircle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTeachercircle(Integer value) {
        this.teachercircle = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        if (comment == null) {
            return "";
        } else {
            return comment;
        }
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the byversatility property.
     * 
     * @return
     *     possible object is
     *     {@link YesnoType }
     *     
     */
    public YesnoType getByversatility() {
        if (byversatility == null) {
            return YesnoType.NO;
        } else {
            return byversatility;
        }
    }

    /**
     * Sets the value of the byversatility property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *     
     */
    public void setByversatility(YesnoType value) {
        this.byversatility = value;
    }

}