//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.04 at 05:31:06 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.contproc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T_aprend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_aprend">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indAprend">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cnpjEntQual" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_02_00}TS_cnpj" minOccurs="0"/>
 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_02_00}TS_tpInsc_1_2" minOccurs="0"/>
 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_02_00}TS_nrInsc_11_14" minOccurs="0"/>
 *         &lt;element name="cnpjPrat" type="{http://www.esocial.gov.br/schema/evt/evtContProc/v_S_01_02_00}TS_cnpj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_aprend", propOrder = {
    "indAprend",
    "cnpjEntQual",
    "tpInsc",
    "nrInsc",
    "cnpjPrat"
})
public class TAprend {

    protected byte indAprend;
    protected String cnpjEntQual;
    protected Byte tpInsc;
    protected String nrInsc;
    protected String cnpjPrat;

    /**
     * Gets the value of the indAprend property.
     * 
     */
    public byte getIndAprend() {
        return indAprend;
    }

    /**
     * Sets the value of the indAprend property.
     * 
     */
    public void setIndAprend(byte value) {
        this.indAprend = value;
    }

    /**
     * Gets the value of the cnpjEntQual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjEntQual() {
        return cnpjEntQual;
    }

    /**
     * Sets the value of the cnpjEntQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjEntQual(String value) {
        this.cnpjEntQual = value;
    }

    /**
     * Gets the value of the tpInsc property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTpInsc() {
        return tpInsc;
    }

    /**
     * Sets the value of the tpInsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTpInsc(Byte value) {
        this.tpInsc = value;
    }

    /**
     * Gets the value of the nrInsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrInsc() {
        return nrInsc;
    }

    /**
     * Sets the value of the nrInsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrInsc(String value) {
        this.nrInsc = value;
    }

    /**
     * Gets the value of the cnpjPrat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjPrat() {
        return cnpjPrat;
    }

    /**
     * Sets the value of the cnpjPrat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjPrat(String value) {
        this.cnpjPrat = value;
    }

}
