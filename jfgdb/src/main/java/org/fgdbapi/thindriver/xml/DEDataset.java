//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.09.21 at 09:16:28 AM CEST
//

package org.fgdbapi.thindriver.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlMarshalNullRepresentation;
import org.eclipse.persistence.oxm.annotations.XmlNullPolicy;

/**
 * Java class for DEDataset complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DEDataset">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.esri.com/schemas/ArcGIS/10.1}DataElement">
 *       &lt;sequence>
 *         &lt;element name="DatasetType" type="{http://www.esri.com/schemas/ArcGIS/10.1}esriDatasetType"/>
 *         &lt;element name="DSID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Versioned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConfigurationKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "DEDataset",
  propOrder = {"datasetType", "dsid", "versioned", "canVersion", "configurationKeyword"}
)
@XmlSeeAlso({DEGeoDataset.class, DETable.class})
public class DEDataset extends DataElement {

  @XmlElement(name = "DatasetType", required = true)
  protected EsriDatasetType datasetType;

  @XmlElement(name = "DSID")
  protected Integer dsid;

  @XmlElement(name = "Versioned")
  protected Boolean versioned = false;

  @XmlElement(name = "CanVersion")
  protected Boolean canVersion = false;

  @XmlElement(name = "ConfigurationKeyword")
  @XmlNullPolicy(
    emptyNodeRepresentsNull = true,
    nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE
  )
  protected String configurationKeyword;

  /**
   * Gets the value of the datasetType property.
   *
   * @return possible object is {@link EsriDatasetType }
   */
  public EsriDatasetType getDatasetType() {
    return datasetType;
  }

  /**
   * Sets the value of the datasetType property.
   *
   * @param value allowed object is {@link EsriDatasetType }
   */
  public void setDatasetType(EsriDatasetType value) {
    this.datasetType = value;
  }

  /**
   * Gets the value of the dsid property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getDSID() {
    return dsid;
  }

  /**
   * Sets the value of the dsid property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setDSID(Integer value) {
    this.dsid = value;
  }

  /**
   * Gets the value of the versioned property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isVersioned() {
    return versioned;
  }

  /**
   * Sets the value of the versioned property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setVersioned(Boolean value) {
    this.versioned = value;
  }

  /**
   * Gets the value of the canVersion property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isCanVersion() {
    return canVersion;
  }

  /**
   * Sets the value of the canVersion property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setCanVersion(Boolean value) {
    this.canVersion = value;
  }

  /**
   * Gets the value of the configurationKeyword property.
   *
   * @return possible object is {@link String }
   */
  public String getConfigurationKeyword() {
    return configurationKeyword;
  }

  /**
   * Sets the value of the configurationKeyword property.
   *
   * @param value allowed object is {@link String }
   */
  public void setConfigurationKeyword(String value) {
    this.configurationKeyword = value;
  }
}
