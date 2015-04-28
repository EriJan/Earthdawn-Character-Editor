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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for charsheettemplatetalent_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="charsheettemplatetalent_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Strain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Karma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeStep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Step" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Page" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="discipline" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *       &lt;attribute name="free" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *       &lt;attribute name="other" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *       &lt;attribute name="versatility" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "charsheettemplatetalent_type", namespace = "http://earthdawn.com/charsheettemplate", propOrder = {
    "name",
    "action",
    "strain",
    "karma",
    "attribute",
    "attributeStep",
    "rank",
    "step",
    "dice",
    "page"
})
public class CharsheettemplatetalentType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Action")
    protected String action;
    @XmlElement(name = "Strain")
    protected String strain;
    @XmlElement(name = "Karma")
    protected String karma;
    @XmlElement(name = "Attribute")
    protected String attribute;
    @XmlElement(name = "AttributeStep")
    protected String attributeStep;
    @XmlElement(name = "Rank")
    protected String rank;
    @XmlElement(name = "Step")
    protected String step;
    @XmlElement(name = "Dice")
    protected String dice;
    @XmlElement(name = "Page")
    protected String page;
    @XmlAttribute(name = "discipline")
    protected Boolean discipline;
    @XmlAttribute(name = "free")
    protected Boolean free;
    @XmlAttribute(name = "other")
    protected Boolean other;
    @XmlAttribute(name = "versatility")
    protected Boolean versatility;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
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
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the strain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrain() {
        return strain;
    }

    /**
     * Sets the value of the strain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrain(String value) {
        this.strain = value;
    }

    /**
     * Gets the value of the karma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKarma() {
        return karma;
    }

    /**
     * Sets the value of the karma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKarma(String value) {
        this.karma = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute(String value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the attributeStep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeStep() {
        return attributeStep;
    }

    /**
     * Sets the value of the attributeStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeStep(String value) {
        this.attributeStep = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRank(String value) {
        this.rank = value;
    }

    /**
     * Gets the value of the step property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStep(String value) {
        this.step = value;
    }

    /**
     * Gets the value of the dice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDice() {
        return dice;
    }

    /**
     * Sets the value of the dice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDice(String value) {
        this.dice = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPage(String value) {
        this.page = value;
    }

    /**
     * Gets the value of the discipline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDiscipline() {
        if (discipline == null) {
            return false;
        } else {
            return discipline;
        }
    }

    /**
     * Sets the value of the discipline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscipline(Boolean value) {
        this.discipline = value;
    }

    /**
     * Gets the value of the free property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFree() {
        if (free == null) {
            return false;
        } else {
            return free;
        }
    }

    /**
     * Sets the value of the free property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFree(Boolean value) {
        this.free = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOther() {
        if (other == null) {
            return false;
        } else {
            return other;
        }
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOther(Boolean value) {
        this.other = value;
    }

    /**
     * Gets the value of the versatility property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isVersatility() {
        if (versatility == null) {
            return false;
        } else {
            return versatility;
        }
    }

    /**
     * Sets the value of the versatility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVersatility(Boolean value) {
        this.versatility = value;
    }

}
