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
 * Java class for MultiPatchB complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MultiPatchB">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.esri.com/schemas/ArcGIS/10.1}MultiPatch">
 *       &lt;sequence>
 *         &lt;element name="Bytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "MultiPatchB",
  propOrder = {"bytes"}
)
public class MultiPatchB extends MultiPatch {

  @XmlElement(name = "Bytes", required = true)
  protected byte[] bytes;

  /**
   * Gets the value of the bytes property.
   *
   * @return possible object is byte[]
   */
  public byte[] getBytes() {
    return bytes;
  }

  /**
   * Sets the value of the bytes property.
   *
   * @param value allowed object is byte[]
   */
  public void setBytes(byte[] value) {
    this.bytes = value;
  }
}
