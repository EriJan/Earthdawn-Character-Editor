//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
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
 *       &lt;sequence>
 *         &lt;element name="ATTRIBUTES" type="{http://earthdawn.com/names}NAMES_ATTRIBUTES_type" maxOccurs="unbounded"/>
 *         &lt;element name="DURABILITY" type="{http://earthdawn.com/names}NAME_LANG_type" maxOccurs="unbounded"/>
 *         &lt;element name="VERSATILITY" type="{http://earthdawn.com/names}NAME_LANG_type" maxOccurs="unbounded"/>
 *         &lt;element name="KARMARUTUAL" type="{http://earthdawn.com/names}NAME_LANG_type" maxOccurs="unbounded"/>
 *         &lt;element name="ARTISAN" type="{http://earthdawn.com/names}NAME_LANG_type" maxOccurs="unbounded"/>
 *         &lt;element name="SPELLWEAVING" type="{http://earthdawn.com/names}NAME_SPELLWEAVING_type" maxOccurs="unbounded"/>
 *         &lt;element name="STARTINGWEAPONS" type="{http://earthdawn.com/names}NAME_STARTINGWEAPONS_type" maxOccurs="unbounded"/>
 *         &lt;element name="STARTINGITEMS" type="{http://earthdawn.com/names}NAME_STARTINGITEMS_type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "attributes",
    "durability",
    "versatility",
    "karmarutual",
    "artisan",
    "spellweaving",
    "startingweapons",
    "startingitems"
})
@XmlRootElement(name = "NAMES", namespace = "http://earthdawn.com/names")
public class NAMES {

    @XmlElement(name = "ATTRIBUTES", namespace = "http://earthdawn.com/names", required = true)
    protected List<NAMESATTRIBUTESType> attributes;
    @XmlElement(name = "DURABILITY", namespace = "http://earthdawn.com/names", required = true)
    protected List<NAMELANGType> durability;
    @XmlElement(name = "VERSATILITY", namespace = "http://earthdawn.com/names", required = true)
    protected List<NAMELANGType> versatility;
    @XmlElement(name = "KARMARUTUAL", namespace = "http://earthdawn.com/names", required = true)
    protected List<NAMELANGType> karmarutual;
    @XmlElement(name = "ARTISAN", namespace = "http://earthdawn.com/names", required = true)
    protected List<NAMELANGType> artisan;
    @XmlElement(name = "SPELLWEAVING", namespace = "http://earthdawn.com/names", required = true)
    protected List<NAMESPELLWEAVINGType> spellweaving;
    @XmlElement(name = "STARTINGWEAPONS", namespace = "http://earthdawn.com/names", required = true)
    protected List<NAMESTARTINGWEAPONSType> startingweapons;
    @XmlElement(name = "STARTINGITEMS", namespace = "http://earthdawn.com/names", required = true)
    protected List<NAMESTARTINGITEMSType> startingitems;

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATTRIBUTES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAMESATTRIBUTESType }
     * 
     * 
     */
    public List<NAMESATTRIBUTESType> getATTRIBUTES() {
        if (attributes == null) {
            attributes = new ArrayList<NAMESATTRIBUTESType>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the durability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the durability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDURABILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAMELANGType }
     * 
     * 
     */
    public List<NAMELANGType> getDURABILITY() {
        if (durability == null) {
            durability = new ArrayList<NAMELANGType>();
        }
        return this.durability;
    }

    /**
     * Gets the value of the versatility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versatility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVERSATILITY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAMELANGType }
     * 
     * 
     */
    public List<NAMELANGType> getVERSATILITY() {
        if (versatility == null) {
            versatility = new ArrayList<NAMELANGType>();
        }
        return this.versatility;
    }

    /**
     * Gets the value of the karmarutual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the karmarutual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKARMARUTUAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAMELANGType }
     * 
     * 
     */
    public List<NAMELANGType> getKARMARUTUAL() {
        if (karmarutual == null) {
            karmarutual = new ArrayList<NAMELANGType>();
        }
        return this.karmarutual;
    }

    /**
     * Gets the value of the artisan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artisan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getARTISAN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAMELANGType }
     * 
     * 
     */
    public List<NAMELANGType> getARTISAN() {
        if (artisan == null) {
            artisan = new ArrayList<NAMELANGType>();
        }
        return this.artisan;
    }

    /**
     * Gets the value of the spellweaving property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spellweaving property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPELLWEAVING().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAMESPELLWEAVINGType }
     * 
     * 
     */
    public List<NAMESPELLWEAVINGType> getSPELLWEAVING() {
        if (spellweaving == null) {
            spellweaving = new ArrayList<NAMESPELLWEAVINGType>();
        }
        return this.spellweaving;
    }

    /**
     * Gets the value of the startingweapons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startingweapons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTARTINGWEAPONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAMESTARTINGWEAPONSType }
     * 
     * 
     */
    public List<NAMESTARTINGWEAPONSType> getSTARTINGWEAPONS() {
        if (startingweapons == null) {
            startingweapons = new ArrayList<NAMESTARTINGWEAPONSType>();
        }
        return this.startingweapons;
    }

    /**
     * Gets the value of the startingitems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startingitems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTARTINGITEMS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAMESTARTINGITEMSType }
     * 
     * 
     */
    public List<NAMESTARTINGITEMSType> getSTARTINGITEMS() {
        if (startingitems == null) {
            startingitems = new ArrayList<NAMESTARTINGITEMSType>();
        }
        return this.startingitems;
    }

}
