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
 * Java class for ArrayOfPath complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfPath">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Path" type="{http://www.esri.com/schemas/ArcGIS/10.1}Path" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "ArrayOfPath",
  propOrder = {"path"}
)
public class ArrayOfPath {

  @XmlElement(name = "Path")
  protected List<Path> path;

  /**
   * Gets the value of the path property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the path property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getPath().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Path }
   */
  public List<Path> getPath() {
    if (path == null) {
      path = new ArrayList<Path>();
    }
    return this.path;
  }
}
