//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
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
 * <p>Java class for SHIELD_type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SHIELD_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://earthdawn.com/datatypes}ARMOR_type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DEFENSE" type="{http://earthdawn.com/datatypes}DEFENSE_type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="shatterthreshold" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" /&gt;
 *       &lt;attribute name="physicaldeflectionbonus" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" /&gt;
 *       &lt;attribute name="mysticdeflectionbonus" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SHIELD_type", propOrder = {
    "defense"
})
public class SHIELDType
    extends ARMORType
{

    @XmlElement(name = "DEFENSE")
    protected DEFENSEType defense;
    @XmlAttribute(name = "shatterthreshold")
    protected Integer shatterthreshold;
    @XmlAttribute(name = "physicaldeflectionbonus")
    protected Integer physicaldeflectionbonus;
    @XmlAttribute(name = "mysticdeflectionbonus")
    protected Integer mysticdeflectionbonus;

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
     * Gets the value of the shatterthreshold property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getShatterthreshold() {
        if (shatterthreshold == null) {
            return  0;
        } else {
            return shatterthreshold;
        }
    }

    /**
     * Sets the value of the shatterthreshold property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setShatterthreshold(Integer value) {
        this.shatterthreshold = value;
    }

    /**
     * Gets the value of the physicaldeflectionbonus property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getPhysicaldeflectionbonus() {
        if (physicaldeflectionbonus == null) {
            return  0;
        } else {
            return physicaldeflectionbonus;
        }
    }

    /**
     * Sets the value of the physicaldeflectionbonus property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPhysicaldeflectionbonus(Integer value) {
        this.physicaldeflectionbonus = value;
    }

    /**
     * Gets the value of the mysticdeflectionbonus property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getMysticdeflectionbonus() {
        if (mysticdeflectionbonus == null) {
            return  0;
        } else {
            return mysticdeflectionbonus;
        }
    }

    /**
     * Sets the value of the mysticdeflectionbonus property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setMysticdeflectionbonus(Integer value) {
        this.mysticdeflectionbonus = value;
    }

}
