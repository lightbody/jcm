
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
 *         &lt;element name="Campaign.DeleteResult" type="{http://api.createsend.com/api/}Result" minOccurs="0"/>
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
    "campaignDeleteResult"
})
@XmlRootElement(name = "Campaign.DeleteResponse")
public class CampaignDeleteResponse {

    @XmlElement(name = "Campaign.DeleteResult")
    protected Result campaignDeleteResult;

    /**
     * Gets the value of the campaignDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getCampaignDeleteResult() {
        return campaignDeleteResult;
    }

    /**
     * Sets the value of the campaignDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setCampaignDeleteResult(Result value) {
        this.campaignDeleteResult = value;
    }

}
