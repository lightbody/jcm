
package com.campaignmonitor.api.types;

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
 *         &lt;element name="User.GetTimezonesResult" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "userGetTimezonesResult"
})
@XmlRootElement(name = "User.GetTimezonesResponse")
public class UserGetTimezonesResponse {

    @XmlElement(name = "User.GetTimezonesResult")
    protected Object userGetTimezonesResult;

    /**
     * Gets the value of the userGetTimezonesResult property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUserGetTimezonesResult() {
        return userGetTimezonesResult;
    }

    /**
     * Sets the value of the userGetTimezonesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUserGetTimezonesResult(Object value) {
        this.userGetTimezonesResult = value;
    }

}
