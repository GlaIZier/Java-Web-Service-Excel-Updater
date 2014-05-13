
package ru.ibs.updateservice;

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
 *         &lt;element name="obsoleteData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="obsoleteDataType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actualData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="actualDataType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="keyColumnMapping" type="{http://www.ibs.ru/UpdateService/}IndexMapping" maxOccurs="unbounded"/>
 *         &lt;element name="mergeColumnMapping" type="{http://www.ibs.ru/UpdateService/}IndexMapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="complexKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "obsoleteData",
    "obsoleteDataType",
    "actualData",
    "actualDataType",
    "keyColumnMapping",
    "mergeColumnMapping",
    "complexKey"
})
@XmlRootElement(name = "Update")
public class Update {

    @XmlElement(required = true)
    protected byte[] obsoleteData;
    @XmlElement(required = true)
    protected String obsoleteDataType;
    @XmlElement(required = true)
    protected byte[] actualData;
    @XmlElement(required = true)
    protected String actualDataType;
    @XmlElement(required = true)
    protected List<IndexMapping> keyColumnMapping;
    protected List<IndexMapping> mergeColumnMapping;
    @XmlElement(defaultValue = "false")
    protected Boolean complexKey;

    /**
     * Gets the value of the obsoleteData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getObsoleteData() {
        return obsoleteData;
    }

    /**
     * Sets the value of the obsoleteData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setObsoleteData(byte[] value) {
        this.obsoleteData = ((byte[]) value);
    }

    /**
     * Gets the value of the obsoleteDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsoleteDataType() {
        return obsoleteDataType;
    }

    /**
     * Sets the value of the obsoleteDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsoleteDataType(String value) {
        this.obsoleteDataType = value;
    }

    /**
     * Gets the value of the actualData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getActualData() {
        return actualData;
    }

    /**
     * Sets the value of the actualData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setActualData(byte[] value) {
        this.actualData = ((byte[]) value);
    }

    /**
     * Gets the value of the actualDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualDataType() {
        return actualDataType;
    }

    /**
     * Sets the value of the actualDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDataType(String value) {
        this.actualDataType = value;
    }

    /**
     * Gets the value of the keyColumnMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyColumnMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyColumnMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexMapping }
     * 
     * 
     */
    public List<IndexMapping> getKeyColumnMapping() {
        if (keyColumnMapping == null) {
            keyColumnMapping = new ArrayList<IndexMapping>();
        }
        return this.keyColumnMapping;
    }

    /**
     * Gets the value of the mergeColumnMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mergeColumnMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMergeColumnMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexMapping }
     * 
     * 
     */
    public List<IndexMapping> getMergeColumnMapping() {
        if (mergeColumnMapping == null) {
            mergeColumnMapping = new ArrayList<IndexMapping>();
        }
        return this.mergeColumnMapping;
    }

    /**
     * Gets the value of the complexKey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplexKey() {
        return complexKey;
    }

    /**
     * Sets the value of the complexKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplexKey(Boolean value) {
        this.complexKey = value;
    }

}
