
package org.bimserver.generatedclient;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadByGuids complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadByGuids">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roids" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="guids" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="formatIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sync" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadByGuids", propOrder = {
    "roids",
    "guids",
    "formatIdentifier",
    "sync"
})
public class DownloadByGuids {

    @XmlElement(type = Long.class)
    protected List<Long> roids;
    protected List<String> guids;
    protected String formatIdentifier;
    protected boolean sync;

    /**
     * Gets the value of the roids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getRoids() {
        if (roids == null) {
            roids = new ArrayList<Long>();
        }
        return this.roids;
    }

    /**
     * Gets the value of the guids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGuids() {
        if (guids == null) {
            guids = new ArrayList<String>();
        }
        return this.guids;
    }

    /**
     * Gets the value of the formatIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatIdentifier() {
        return formatIdentifier;
    }

    /**
     * Sets the value of the formatIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatIdentifier(String value) {
        this.formatIdentifier = value;
    }

    /**
     * Gets the value of the sync property.
     * 
     */
    public boolean isSync() {
        return sync;
    }

    /**
     * Sets the value of the sync property.
     * 
     */
    public void setSync(boolean value) {
        this.sync = value;
    }

}
