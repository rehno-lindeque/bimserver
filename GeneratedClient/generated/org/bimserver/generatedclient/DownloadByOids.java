
package org.bimserver.generatedclient;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadByOids complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadByOids">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roids" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="oids" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "downloadByOids", propOrder = {
    "roids",
    "oids",
    "formatIdentifier",
    "sync"
})
public class DownloadByOids {

    @XmlElement(type = Long.class)
    protected List<Long> roids;
    @XmlElement(type = Long.class)
    protected List<Long> oids;
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
     * Gets the value of the oids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getOids() {
        if (oids == null) {
            oids = new ArrayList<Long>();
        }
        return this.oids;
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
