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
 *         &lt;element name="MAINWINDOW" type="{http://earthdawn.com/eceguilayout}LAYOUT_DIMENSION_type"/>
 *         &lt;element name="STATUSWINDOW" type="{http://earthdawn.com/eceguilayout}LAYOUT_DIMENSION_type"/>
 *         &lt;element name="TABWINDOW" type="{http://earthdawn.com/eceguilayout}LAYOUT_DIMENSION_type"/>
 *         &lt;element name="TABLE" type="{http://earthdawn.com/eceguilayout}LAYOUT_TABLE_type" maxOccurs="unbounded" minOccurs="0"/>
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
    "mainwindow",
    "statuswindow",
    "tabwindow",
    "table"
})
@XmlRootElement(name = "ECEGUILAYOUT", namespace = "http://earthdawn.com/eceguilayout")
public class ECEGUILAYOUT {

    @XmlElement(name = "MAINWINDOW", namespace = "http://earthdawn.com/eceguilayout", required = true)
    protected LAYOUTDIMENSIONType mainwindow;
    @XmlElement(name = "STATUSWINDOW", namespace = "http://earthdawn.com/eceguilayout", required = true)
    protected LAYOUTDIMENSIONType statuswindow;
    @XmlElement(name = "TABWINDOW", namespace = "http://earthdawn.com/eceguilayout", required = true)
    protected LAYOUTDIMENSIONType tabwindow;
    @XmlElement(name = "TABLE", namespace = "http://earthdawn.com/eceguilayout")
    protected List<LAYOUTTABLEType> table;

    /**
     * Gets the value of the mainwindow property.
     * 
     * @return
     *     possible object is
     *     {@link LAYOUTDIMENSIONType }
     *     
     */
    public LAYOUTDIMENSIONType getMAINWINDOW() {
        return mainwindow;
    }

    /**
     * Sets the value of the mainwindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link LAYOUTDIMENSIONType }
     *     
     */
    public void setMAINWINDOW(LAYOUTDIMENSIONType value) {
        this.mainwindow = value;
    }

    /**
     * Gets the value of the statuswindow property.
     * 
     * @return
     *     possible object is
     *     {@link LAYOUTDIMENSIONType }
     *     
     */
    public LAYOUTDIMENSIONType getSTATUSWINDOW() {
        return statuswindow;
    }

    /**
     * Sets the value of the statuswindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link LAYOUTDIMENSIONType }
     *     
     */
    public void setSTATUSWINDOW(LAYOUTDIMENSIONType value) {
        this.statuswindow = value;
    }

    /**
     * Gets the value of the tabwindow property.
     * 
     * @return
     *     possible object is
     *     {@link LAYOUTDIMENSIONType }
     *     
     */
    public LAYOUTDIMENSIONType getTABWINDOW() {
        return tabwindow;
    }

    /**
     * Sets the value of the tabwindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link LAYOUTDIMENSIONType }
     *     
     */
    public void setTABWINDOW(LAYOUTDIMENSIONType value) {
        this.tabwindow = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the table property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTABLE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LAYOUTTABLEType }
     * 
     * 
     */
    public List<LAYOUTTABLEType> getTABLE() {
        if (table == null) {
            table = new ArrayList<LAYOUTTABLEType>();
        }
        return this.table;
    }

}
