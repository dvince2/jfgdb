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

/**
 * Java class for TriangleStrip complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TriangleStrip">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.esri.com/schemas/ArcGIS/10.1}Geometry">
 *       &lt;sequence>
 *         &lt;element name="PointArray" type="{http://www.esri.com/schemas/ArcGIS/10.1}ArrayOfPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "TriangleStrip",
  propOrder = {"pointArray"}
)
public class TriangleStrip extends Geometry {

  @XmlElement(name = "PointArray")
  protected ArrayOfPoint pointArray;

  /**
   * Gets the value of the pointArray property.
   *
   * @return possible object is {@link ArrayOfPoint }
   */
  public ArrayOfPoint getPointArray() {
    return pointArray;
  }

  /**
   * Sets the value of the pointArray property.
   *
   * @param value allowed object is {@link ArrayOfPoint }
   */
  public void setPointArray(ArrayOfPoint value) {
    this.pointArray = value;
  }
}
