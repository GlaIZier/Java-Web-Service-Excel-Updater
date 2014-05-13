
package ru.ibs.updateservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndexMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceIndex" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="targetIndex" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexMapping", propOrder = {
    "sourceIndex",
    "targetIndex"
})
public class IndexMapping {

    @XmlElement(required = true)
    protected BigInteger sourceIndex;
    @XmlElement(required = true)
    protected BigInteger targetIndex;

    /**
     * Gets the value of the sourceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceIndex() {
        return sourceIndex;
    }

    /**
     * Sets the value of the sourceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceIndex(BigInteger value) {
        this.sourceIndex = value;
    }

    /**
     * Gets the value of the targetIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTargetIndex() {
        return targetIndex;
    }

    /**
     * Sets the value of the targetIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTargetIndex(BigInteger value) {
        this.targetIndex = value;
    }

}
