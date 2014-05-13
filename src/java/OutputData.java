
package ru.ibs.updateservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updatedData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="erroneousData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputData", propOrder = {
    "updatedData",
    "erroneousData"
})
public class OutputData {

    @XmlElement(required = true)
    protected byte[] updatedData;
    protected byte[] erroneousData;

    /**
     * Gets the value of the updatedData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getUpdatedData() {
        return updatedData;
    }

    /**
     * Sets the value of the updatedData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setUpdatedData(byte[] value) {
        this.updatedData = ((byte[]) value);
    }

    /**
     * Gets the value of the erroneousData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getErroneousData() {
        return erroneousData;
    }

    /**
     * Sets the value of the erroneousData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setErroneousData(byte[] value) {
        this.erroneousData = ((byte[]) value);
    }

}
