//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.27 at 08:34:28 PM GMT 
//


package pl.baczkowicz.mqttspy.versions.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Copyable;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.CopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBCopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * <p>Java class for ReleaseStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReleaseStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FromVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpdateTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpdateDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpdateStatus" type="{http://baczkowicz.pl/mqtt-spy-versions}UpdateStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReleaseStatus", propOrder = {
    "fromVersion",
    "toVersion",
    "updateTitle",
    "updateDetails",
    "updateStatus"
})
public class ReleaseStatus
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlElement(name = "FromVersion", required = true)
    protected String fromVersion;
    @XmlElement(name = "ToVersion", required = true)
    protected String toVersion;
    @XmlElement(name = "UpdateTitle", required = true)
    protected String updateTitle;
    @XmlElement(name = "UpdateDetails", required = true)
    protected String updateDetails;
    @XmlElement(name = "UpdateStatus", required = true)
    protected UpdateStatus updateStatus;

    /**
     * Gets the value of the fromVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromVersion() {
        return fromVersion;
    }

    /**
     * Sets the value of the fromVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromVersion(String value) {
        this.fromVersion = value;
    }

    /**
     * Gets the value of the toVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToVersion() {
        return toVersion;
    }

    /**
     * Sets the value of the toVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToVersion(String value) {
        this.toVersion = value;
    }

    /**
     * Gets the value of the updateTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTitle() {
        return updateTitle;
    }

    /**
     * Sets the value of the updateTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTitle(String value) {
        this.updateTitle = value;
    }

    /**
     * Gets the value of the updateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDetails() {
        return updateDetails;
    }

    /**
     * Sets the value of the updateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDetails(String value) {
        this.updateDetails = value;
    }

    /**
     * Gets the value of the updateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateStatus }
     *     
     */
    public UpdateStatus getUpdateStatus() {
        return updateStatus;
    }

    /**
     * Sets the value of the updateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateStatus }
     *     
     */
    public void setUpdateStatus(UpdateStatus value) {
        this.updateStatus = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            String theFromVersion;
            theFromVersion = this.getFromVersion();
            toStringBuilder.append("fromVersion", theFromVersion);
        }
        {
            String theToVersion;
            theToVersion = this.getToVersion();
            toStringBuilder.append("toVersion", theToVersion);
        }
        {
            String theUpdateTitle;
            theUpdateTitle = this.getUpdateTitle();
            toStringBuilder.append("updateTitle", theUpdateTitle);
        }
        {
            String theUpdateDetails;
            theUpdateDetails = this.getUpdateDetails();
            toStringBuilder.append("updateDetails", theUpdateDetails);
        }
        {
            UpdateStatus theUpdateStatus;
            theUpdateStatus = this.getUpdateStatus();
            toStringBuilder.append("updateStatus", theUpdateStatus);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof ReleaseStatus)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final ReleaseStatus that = ((ReleaseStatus) object);
        equalsBuilder.append(this.getFromVersion(), that.getFromVersion());
        equalsBuilder.append(this.getToVersion(), that.getToVersion());
        equalsBuilder.append(this.getUpdateTitle(), that.getUpdateTitle());
        equalsBuilder.append(this.getUpdateDetails(), that.getUpdateDetails());
        equalsBuilder.append(this.getUpdateStatus(), that.getUpdateStatus());
    }

    public boolean equals(Object object) {
        if (!(object instanceof ReleaseStatus)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        hashCodeBuilder.append(this.getFromVersion());
        hashCodeBuilder.append(this.getToVersion());
        hashCodeBuilder.append(this.getUpdateTitle());
        hashCodeBuilder.append(this.getUpdateDetails());
        hashCodeBuilder.append(this.getUpdateStatus());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final ReleaseStatus copy = ((target == null)?((ReleaseStatus) createCopy()):((ReleaseStatus) target));
        {
            String sourceFromVersion;
            sourceFromVersion = this.getFromVersion();
            String copyFromVersion = ((String) copyBuilder.copy(sourceFromVersion));
            copy.setFromVersion(copyFromVersion);
        }
        {
            String sourceToVersion;
            sourceToVersion = this.getToVersion();
            String copyToVersion = ((String) copyBuilder.copy(sourceToVersion));
            copy.setToVersion(copyToVersion);
        }
        {
            String sourceUpdateTitle;
            sourceUpdateTitle = this.getUpdateTitle();
            String copyUpdateTitle = ((String) copyBuilder.copy(sourceUpdateTitle));
            copy.setUpdateTitle(copyUpdateTitle);
        }
        {
            String sourceUpdateDetails;
            sourceUpdateDetails = this.getUpdateDetails();
            String copyUpdateDetails = ((String) copyBuilder.copy(sourceUpdateDetails));
            copy.setUpdateDetails(copyUpdateDetails);
        }
        {
            UpdateStatus sourceUpdateStatus;
            sourceUpdateStatus = this.getUpdateStatus();
            UpdateStatus copyUpdateStatus = ((UpdateStatus) copyBuilder.copy(sourceUpdateStatus));
            copy.setUpdateStatus(copyUpdateStatus);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new ReleaseStatus();
    }

}
