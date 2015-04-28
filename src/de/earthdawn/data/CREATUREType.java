//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CREATURE_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREATURE_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://earthdawn.com/datatypes}ITEM_type">
 *       &lt;sequence>
 *         &lt;element name="APPEARANCE" type="{http://earthdawn.com/datatypes}APPEARANCE_type"/>
 *         &lt;element name="ATTRIBUTE" type="{http://earthdawn.com/datatypes}ATTRIBUTE_type" maxOccurs="6" minOccurs="6"/>
 *         &lt;element name="DEFENSE" type="{http://earthdawn.com/datatypes}DEFENSE_type" minOccurs="0"/>
 *         &lt;element name="PROTECTION" type="{http://earthdawn.com/datatypes}PROTECTION_type" minOccurs="0"/>
 *         &lt;element name="HEALTH" type="{http://earthdawn.com/datatypes}HEALTH_type" minOccurs="0"/>
 *         &lt;element name="MOVEMENT" type="{http://earthdawn.com/datatypes}MOVEMENT_type" minOccurs="0"/>
 *         &lt;element name="INITIATIVE" type="{http://earthdawn.com/datatypes}INITIATIVE_type" minOccurs="0"/>
 *         &lt;element name="CARRYING" type="{http://earthdawn.com/datatypes}CARRYING_type" minOccurs="0"/>
 *         &lt;element name="SKILL" type="{http://earthdawn.com/datatypes}SKILL_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KARMA" type="{http://earthdawn.com/datatypes}KARMA_type"/>
 *         &lt;element name="RACEABILITES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="familiar" type="{http://earthdawn.com/datatypes}yesno_type" default="no" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CREATURE_type", propOrder = {
    "appearance",
    "attribute",
    "defense",
    "protection",
    "health",
    "movement",
    "initiative",
    "carrying",
    "skill",
    "karma",
    "raceabilites",
    "comment"
})
public class CREATUREType
    extends ITEMType
{

    @XmlElement(name = "APPEARANCE", required = true)
    protected APPEARANCEType appearance;
    @XmlElement(name = "ATTRIBUTE", required = true)
    protected List<ATTRIBUTEType> attribute;
    @XmlElement(name = "DEFENSE")
    protected DEFENSEType defense;
    @XmlElement(name = "PROTECTION")
    protected PROTECTIONType protection;
    @XmlElement(name = "HEALTH")
    protected HEALTHType health;
    @XmlElement(name = "MOVEMENT")
    protected MOVEMENTType movement;
    @XmlElement(name = "INITIATIVE")
    protected INITIATIVEType initiative;
    @XmlElement(name = "CARRYING")
    protected CARRYINGType carrying;
    @XmlElement(name = "SKILL")
    protected List<SKILLType> skill;
    @XmlElement(name = "KARMA", required = true)
    protected KARMAType karma;
    @XmlElement(name = "RACEABILITES", defaultValue = "")
    protected String raceabilites;
    @XmlElement(name = "COMMENT", defaultValue = "")
    protected String comment;
    @XmlAttribute(name = "familiar")
    protected YesnoType familiar;

    /**
     * Gets the value of the appearance property.
     * 
     * @return
     *     possible object is
     *     {@link APPEARANCEType }
     *     
     */
    public APPEARANCEType getAPPEARANCE() {
        return appearance;
    }

    /**
     * Sets the value of the appearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPEARANCEType }
     *     
     */
    public void setAPPEARANCE(APPEARANCEType value) {
        this.appearance = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATTRIBUTE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATTRIBUTEType }
     * 
     * 
     */
    public List<ATTRIBUTEType> getATTRIBUTE() {
        if (attribute == null) {
            attribute = new ArrayList<ATTRIBUTEType>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the defense property.
     * 
     * @return
     *     possible object is
     *     {@link DEFENSEType }
     *     
     */
    public DEFENSEType getDEFENSE() {
        return defense;
    }

    /**
     * Sets the value of the defense property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEFENSEType }
     *     
     */
    public void setDEFENSE(DEFENSEType value) {
        this.defense = value;
    }

    /**
     * Gets the value of the protection property.
     * 
     * @return
     *     possible object is
     *     {@link PROTECTIONType }
     *     
     */
    public PROTECTIONType getPROTECTION() {
        return protection;
    }

    /**
     * Sets the value of the protection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROTECTIONType }
     *     
     */
    public void setPROTECTION(PROTECTIONType value) {
        this.protection = value;
    }

    /**
     * Gets the value of the health property.
     * 
     * @return
     *     possible object is
     *     {@link HEALTHType }
     *     
     */
    public HEALTHType getHEALTH() {
        return health;
    }

    /**
     * Sets the value of the health property.
     * 
     * @param value
     *     allowed object is
     *     {@link HEALTHType }
     *     
     */
    public void setHEALTH(HEALTHType value) {
        this.health = value;
    }

    /**
     * Gets the value of the movement property.
     * 
     * @return
     *     possible object is
     *     {@link MOVEMENTType }
     *     
     */
    public MOVEMENTType getMOVEMENT() {
        return movement;
    }

    /**
     * Sets the value of the movement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOVEMENTType }
     *     
     */
    public void setMOVEMENT(MOVEMENTType value) {
        this.movement = value;
    }

    /**
     * Gets the value of the initiative property.
     * 
     * @return
     *     possible object is
     *     {@link INITIATIVEType }
     *     
     */
    public INITIATIVEType getINITIATIVE() {
        return initiative;
    }

    /**
     * Sets the value of the initiative property.
     * 
     * @param value
     *     allowed object is
     *     {@link INITIATIVEType }
     *     
     */
    public void setINITIATIVE(INITIATIVEType value) {
        this.initiative = value;
    }

    /**
     * Gets the value of the carrying property.
     * 
     * @return
     *     possible object is
     *     {@link CARRYINGType }
     *     
     */
    public CARRYINGType getCARRYING() {
        return carrying;
    }

    /**
     * Sets the value of the carrying property.
     * 
     * @param value
     *     allowed object is
     *     {@link CARRYINGType }
     *     
     */
    public void setCARRYING(CARRYINGType value) {
        this.carrying = value;
    }

    /**
     * Gets the value of the skill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSKILL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SKILLType }
     * 
     * 
     */
    public List<SKILLType> getSKILL() {
        if (skill == null) {
            skill = new ArrayList<SKILLType>();
        }
        return this.skill;
    }

    /**
     * Gets the value of the karma property.
     * 
     * @return
     *     possible object is
     *     {@link KARMAType }
     *     
     */
    public KARMAType getKARMA() {
        return karma;
    }

    /**
     * Sets the value of the karma property.
     * 
     * @param value
     *     allowed object is
     *     {@link KARMAType }
     *     
     */
    public void setKARMA(KARMAType value) {
        this.karma = value;
    }

    /**
     * Gets the value of the raceabilites property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRACEABILITES() {
        return raceabilites;
    }

    /**
     * Sets the value of the raceabilites property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRACEABILITES(String value) {
        this.raceabilites = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMENT() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMENT(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the familiar property.
     * 
     * @return
     *     possible object is
     *     {@link YesnoType }
     *     
     */
    public YesnoType getFamiliar() {
        if (familiar == null) {
            return YesnoType.NO;
        } else {
            return familiar;
        }
    }

    /**
     * Sets the value of the familiar property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *     
     */
    public void setFamiliar(YesnoType value) {
        this.familiar = value;
    }

}
