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
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.oxm.annotations.XmlMarshalNullRepresentation;
import org.eclipse.persistence.oxm.annotations.XmlNullPolicy;

/**
 * Feature Class Data Element object.
 *
 * <p>Java class for DEFeatureClass complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DEFeatureClass">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.esri.com/schemas/ArcGIS/10.1}DETable">
 *       &lt;sequence>
 *         &lt;element name="FeatureType" type="{http://www.esri.com/schemas/ArcGIS/10.1}esriFeatureType"/>
 *         &lt;element name="ShapeType" type="{http://www.esri.com/schemas/ArcGIS/10.1}esriGeometryType"/>
 *         &lt;element name="ShapeFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HasM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasZ" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasSpatialIndex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AreaFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LengthFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extent" type="{http://www.esri.com/schemas/ArcGIS/10.1}Envelope"/>
 *         &lt;element name="SpatialReference" type="{http://www.esri.com/schemas/ArcGIS/10.1}SpatialReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "DEFeatureClass",
  propOrder = {
    "featureType",
    "shapeType",
    "shapeFieldName",
    "hasM",
    "hasZ",
    "hasSpatialIndex",
    "areaFieldName",
    "lengthFieldName",
    "extent",
    "spatialReference"
  }
)
public class DEFeatureClass extends DETable {

  @XmlElement(name = "FeatureType", required = true)
  protected EsriFeatureType featureType;

  @XmlElement(name = "ShapeType", required = true)
  protected EsriGeometryType shapeType;

  @XmlElement(name = "ShapeFieldName", required = true)
  @XmlNullPolicy(
    emptyNodeRepresentsNull = true,
    nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE
  )
  protected String shapeFieldName;

  @XmlElement(name = "HasM")
  protected Boolean hasM = false;

  @XmlElement(name = "HasZ")
  protected Boolean hasZ = false;

  @XmlElement(name = "HasSpatialIndex")
  protected Boolean hasSpatialIndex;

  @XmlElement(name = "AreaFieldName")
  @XmlNullPolicy(
    emptyNodeRepresentsNull = true,
    nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE
  )
  protected String areaFieldName;

  @XmlElement(name = "LengthFieldName")
  @XmlNullPolicy(
    emptyNodeRepresentsNull = true,
    nullRepresentationForXml = XmlMarshalNullRepresentation.EMPTY_NODE
  )
  protected String lengthFieldName;

  @XmlElement(name = "Extent", required = true, nillable = true)
  protected Envelope extent;

  @XmlElement(name = "SpatialReference")
  protected SpatialReference spatialReference;

  /**
   * Gets the value of the featureType property.
   *
   * @return possible object is {@link EsriFeatureType }
   */
  public EsriFeatureType getFeatureType() {
    return featureType;
  }

  /**
   * Sets the value of the featureType property.
   *
   * @param value allowed object is {@link EsriFeatureType }
   */
  public void setFeatureType(EsriFeatureType value) {
    this.featureType = value;
  }

  /**
   * Gets the value of the shapeType property.
   *
   * @return possible object is {@link EsriGeometryType }
   */
  public EsriGeometryType getShapeType() {
    return shapeType;
  }

  /**
   * Sets the value of the shapeType property.
   *
   * @param value allowed object is {@link EsriGeometryType }
   */
  public void setShapeType(EsriGeometryType value) {
    this.shapeType = value;
  }

  /**
   * Gets the value of the shapeFieldName property.
   *
   * @return possible object is {@link String }
   */
  public String getShapeFieldName() {
    return shapeFieldName;
  }

  /**
   * Sets the value of the shapeFieldName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setShapeFieldName(String value) {
    this.shapeFieldName = value;
  }

  /**
   * Gets the value of the hasM property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isHasM() {
    return hasM;
  }

  /**
   * Sets the value of the hasM property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setHasM(Boolean value) {
    this.hasM = value;
  }

  /**
   * Gets the value of the hasZ property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isHasZ() {
    return hasZ;
  }

  /**
   * Sets the value of the hasZ property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setHasZ(Boolean value) {
    this.hasZ = value;
  }

  /**
   * Gets the value of the hasSpatialIndex property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isHasSpatialIndex() {
    return hasSpatialIndex;
  }

  /**
   * Sets the value of the hasSpatialIndex property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setHasSpatialIndex(Boolean value) {
    this.hasSpatialIndex = value;
  }

  /**
   * Gets the value of the areaFieldName property.
   *
   * @return possible object is {@link String }
   */
  public String getAreaFieldName() {
    return areaFieldName;
  }

  /**
   * Sets the value of the areaFieldName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setAreaFieldName(String value) {
    this.areaFieldName = value;
  }

  /**
   * Gets the value of the lengthFieldName property.
   *
   * @return possible object is {@link String }
   */
  public String getLengthFieldName() {
    return lengthFieldName;
  }

  /**
   * Sets the value of the lengthFieldName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLengthFieldName(String value) {
    this.lengthFieldName = value;
  }

  /**
   * Gets the value of the extent property.
   *
   * @return possible object is {@link Envelope }
   */
  public Envelope getExtent() {
    return extent;
  }

  /**
   * Sets the value of the extent property.
   *
   * @param value allowed object is {@link Envelope }
   */
  public void setExtent(Envelope value) {
    this.extent = value;
  }

  /**
   * Gets the value of the spatialReference property.
   *
   * @return possible object is {@link SpatialReference }
   */
  public SpatialReference getSpatialReference() {
    return spatialReference;
  }

  /**
   * Sets the value of the spatialReference property.
   *
   * @param value allowed object is {@link SpatialReference }
   */
  public void setSpatialReference(SpatialReference value) {
    this.spatialReference = value;
  }
}
