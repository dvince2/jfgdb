//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.09.21 at 09:16:28 AM CEST
//

package org.fgdbapi.thindriver.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for ArrayOfRing complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfRing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ring" type="{http://www.esri.com/schemas/ArcGIS/10.1}Ring" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "ArrayOfRing",
  propOrder = {"ring"}
)
public class ArrayOfRing {

  @XmlElement(name = "Ring")
  protected List<Ring> ring;

  /**
   * Gets the value of the ring property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the ring property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getRing().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Ring }
   */
  public List<Ring> getRing() {
    if (ring == null) {
      ring = new ArrayList<Ring>();
    }
    return this.ring;
  }
}
