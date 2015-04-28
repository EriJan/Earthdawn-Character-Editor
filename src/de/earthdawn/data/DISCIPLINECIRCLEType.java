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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DISCIPLINECIRCLE_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DISCIPLINECIRCLE_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FOREIGNTALENTS" type="{http://earthdawn.com/discipline}FOREIGNTALENTS_type" minOccurs="0"/>
 *         &lt;element name="OPTIONALTALENT" type="{http://earthdawn.com/datatypes}TALENTABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FREETALENT" type="{http://earthdawn.com/datatypes}TALENTABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DISCIPLINETALENT" type="{http://earthdawn.com/datatypes}TALENTABILITY_type" maxOccurs="8" minOccurs="0"/>
 *         &lt;element name="TALENTABILITY" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type"/>
 *         &lt;element name="SPELL" type="{http://earthdawn.com/discipline}DISCIPLINESPELL_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SPELLABILITY" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DEFENSE" type="{http://earthdawn.com/datatypes}DEFENSEABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="INITIATIVE" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RECOVERYTESTPERDAY" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RECOVERYTESTSTEP" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KARMA" type="{http://earthdawn.com/datatypes}KARMAABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KARMASTEP" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ABILITY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DISCIPLINECIRCLE_type", namespace = "http://earthdawn.com/discipline", propOrder = {
    "foreigntalents",
    "optionaltalent",
    "freetalent",
    "disciplinetalent",
    "talentability",
    "spell",
    "spellability",
    "defense",
    "initiative",
    "recoverytestperday",
    "recoveryteststep",
    "karma",
    "karmastep",
    "ability"
})
public class DISCIPLINECIRCLEType {

    @XmlElement(name = "FOREIGNTALENTS")
    protected FOREIGNTALENTSType foreigntalents;
    @XmlElement(name = "OPTIONALTALENT")
    protected List<TALENTABILITYType> optionaltalent;
    @XmlElement(name = "FREETALENT")
    protected List<TALENTABILITYType> freetalent;
    @XmlElement(name = "DISCIPLINETALENT")
    protected List<TALENTABILITYType> disciplinetalent;
    @XmlElement(name = "TALENTABILITY", required = true)
    protected DISZIPINABILITYType talentability;
    @XmlElement(name = "SPELL")
    protected List<DISCIPLINESPELLType> spell;
    @XmlElement(name = "SPELLABILITY")
    protected List<DISZIPINABILITYType> spellability;
    @XmlElement(name = "DEFENSE")
    protected List<DEFENSEABILITYType> defense;
    @XmlElement(name = "INITIATIVE")
    protected List<DISZIPINABILITYType> initiative;
    @XmlElement(name = "RECOVERYTESTPERDAY")
    protected List<DISZIPINABILITYType> recoverytestperday;
    @XmlElement(name = "RECOVERYTESTSTEP")
    protected List<DISZIPINABILITYType> recoveryteststep;
    @XmlElement(name = "KARMA")
    protected List<KARMAABILITYType> karma;
    @XmlElement(name = "KARMASTEP")
    protected List<DISZIPINABILITYType> karmastep;
    @XmlElement(name = "ABILITY")
    protected List<String> ability;

    /**
     * Gets the value of the foreigntalents property.
     * 
     * @return
     *     possible object is
     *     {@link FOREIGNTALENTSType }
     *     
     */
    public FOREIGNTALENTSType getFOREIGNTALENTS() {
        return foreigntalents;
    }

    /**
     * Sets the value of the foreigntalents property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOREIGNTALENTSType }
     *     
     */
    public void setFOREIGNTALENTS(FOREIGNTALENTSType value) {
        this.foreigntalents = value;
    }

    /**
     * Gets the value of the optionaltalent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionaltalent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOPTIONALTALENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TALENTABILITYType }
     * 
     * 
     */
    public List<TALENTABILITYType> getOPTIONALTALENT() {
        if (optionaltalent == null) {
            optionaltalent = new ArrayList<TALENTABILITYType>();
        }
        return this.optionaltalent;
    }

    /**
     * Gets the value of the freetalent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freetalent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFREETALENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TALENTABILITYType }
     * 
     * 
     */
    public List<TALENTABILITYType> getFREETALENT() {
        if (freetalent == null) {
            freetalent = new ArrayList<TALENTABILITYType>();
        }
        return this.freetalent;
    }

    /**
     * Gets the value of the disciplinetalent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disciplinetalent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDISCIPLINETALENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TALENTABILITYType }
     * 
     * 
     */
    public List<TALENTABILITYType> getDISCIPLINETALENT() {
        if (disciplinetalent == null) {
            disciplinetalent = new ArrayList<TALENTABILITYType>();
        }
        return this.disciplinetalent;
    }

    /**
     * Gets the value of the talentability property.
     * 
     * @return
     *     possible object is
     *     {@link DISZIPINABILITYType }
     *     
     */
    public DISZIPINABILITYType getTALENTABILITY() {
        return talentability;
    }

    /**
     * Sets the value of the talentability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISZIPINABILITYType }
     *     
     */
    public void setTALENTABILITY(DISZIPINABILITYType value) {
        this.talentability = value;
    }

    /**
     * Gets the value of the spell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPELL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISCIPLINESPELLType }
     * 
     * 
     */
    public List<DISCIPLINESPELLType> getSPELL() {
        if (spell == null) {
            spell = new ArrayList<DISCIPLINESPELLType>();
        }
        return this.spell;
    }

    /**
     * Gets the value of the spellability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spellability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPELLABILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISZIPINABILITYType }
     * 
     * 
     */
    public List<DISZIPINABILITYType> getSPELLABILITY() {
        if (spellability == null) {
            spellability = new ArrayList<DISZIPINABILITYType>();
        }
        return this.spellability;
    }

    /**
     * Gets the value of the defense property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defense property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEFENSE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEFENSEABILITYType }
     * 
     * 
     */
    public List<DEFENSEABILITYType> getDEFENSE() {
        if (defense == null) {
            defense = new ArrayList<DEFENSEABILITYType>();
        }
        return this.defense;
    }

    /**
     * Gets the value of the initiative property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initiative property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINITIATIVE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISZIPINABILITYType }
     * 
     * 
     */
    public List<DISZIPINABILITYType> getINITIATIVE() {
        if (initiative == null) {
            initiative = new ArrayList<DISZIPINABILITYType>();
        }
        return this.initiative;
    }

    /**
     * Gets the value of the recoverytestperday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recoverytestperday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECOVERYTESTPERDAY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISZIPINABILITYType }
     * 
     * 
     */
    public List<DISZIPINABILITYType> getRECOVERYTESTPERDAY() {
        if (recoverytestperday == null) {
            recoverytestperday = new ArrayList<DISZIPINABILITYType>();
        }
        return this.recoverytestperday;
    }

    /**
     * Gets the value of the recoveryteststep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recoveryteststep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECOVERYTESTSTEP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISZIPINABILITYType }
     * 
     * 
     */
    public List<DISZIPINABILITYType> getRECOVERYTESTSTEP() {
        if (recoveryteststep == null) {
            recoveryteststep = new ArrayList<DISZIPINABILITYType>();
        }
        return this.recoveryteststep;
    }

    /**
     * Gets the value of the karma property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the karma property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKARMA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KARMAABILITYType }
     * 
     * 
     */
    public List<KARMAABILITYType> getKARMA() {
        if (karma == null) {
            karma = new ArrayList<KARMAABILITYType>();
        }
        return this.karma;
    }

    /**
     * Gets the value of the karmastep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the karmastep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKARMASTEP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DISZIPINABILITYType }
     * 
     * 
     */
    public List<DISZIPINABILITYType> getKARMASTEP() {
        if (karmastep == null) {
            karmastep = new ArrayList<DISZIPINABILITYType>();
        }
        return this.karmastep;
    }

    /**
     * Gets the value of the ability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getABILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getABILITY() {
        if (ability == null) {
            ability = new ArrayList<String>();
        }
        return this.ability;
    }

}
