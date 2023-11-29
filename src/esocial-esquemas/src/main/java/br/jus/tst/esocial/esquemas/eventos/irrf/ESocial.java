//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.04 at 05:31:11 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.irrf;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="evtIrrf">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}T_ideEvento_retorno_mensal"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}T_ideEmpregador"/>
 *                   &lt;element name="infoIRRF">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_nrRecArqBase"/>
 *                             &lt;element name="indExistInfo">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="infoCRMen" maxOccurs="50" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_CRMen"/>
 *                                       &lt;element name="vrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_valorMonetario_positivo"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="infoCRDia" maxOccurs="350" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="perApurDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_dia"/>
 *                                       &lt;element name="CRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_CRDia"/>
 *                                       &lt;element name="vrCRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_valorMonetario_positivo"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_Id_retorno" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
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
    "evtIrrf",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtIrrf evtIrrf;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtIrrf property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtIrrf }
     *     
     */
    public ESocial.EvtIrrf getEvtIrrf() {
        return evtIrrf;
    }

    /**
     * Sets the value of the evtIrrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtIrrf }
     *     
     */
    public void setEvtIrrf(ESocial.EvtIrrf value) {
        this.evtIrrf = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }


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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}T_ideEvento_retorno_mensal"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}T_ideEmpregador"/>
     *         &lt;element name="infoIRRF">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_nrRecArqBase"/>
     *                   &lt;element name="indExistInfo">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="infoCRMen" maxOccurs="50" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_CRMen"/>
     *                             &lt;element name="vrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_valorMonetario_positivo"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="infoCRDia" maxOccurs="350" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="perApurDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_dia"/>
     *                             &lt;element name="CRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_CRDia"/>
     *                             &lt;element name="vrCRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_valorMonetario_positivo"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_Id_retorno" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoIRRF"
    })
    public static class EvtIrrf {

        @XmlElement(required = true)
        protected TIdeEventoRetornoMensal ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtIrrf.InfoIRRF infoIRRF;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the ideEvento property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoRetornoMensal }
         *     
         */
        public TIdeEventoRetornoMensal getIdeEvento() {
            return ideEvento;
        }

        /**
         * Sets the value of the ideEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoRetornoMensal }
         *     
         */
        public void setIdeEvento(TIdeEventoRetornoMensal value) {
            this.ideEvento = value;
        }

        /**
         * Gets the value of the ideEmpregador property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregador }
         *     
         */
        public TIdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Sets the value of the ideEmpregador property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregador }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Gets the value of the infoIRRF property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtIrrf.InfoIRRF }
         *     
         */
        public ESocial.EvtIrrf.InfoIRRF getInfoIRRF() {
            return infoIRRF;
        }

        /**
         * Sets the value of the infoIRRF property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtIrrf.InfoIRRF }
         *     
         */
        public void setInfoIRRF(ESocial.EvtIrrf.InfoIRRF value) {
            this.infoIRRF = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


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
         *         &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_nrRecArqBase"/>
         *         &lt;element name="indExistInfo">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="infoCRMen" maxOccurs="50" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_CRMen"/>
         *                   &lt;element name="vrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_valorMonetario_positivo"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infoCRDia" maxOccurs="350" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="perApurDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_dia"/>
         *                   &lt;element name="CRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_CRDia"/>
         *                   &lt;element name="vrCRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_valorMonetario_positivo"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "nrRecArqBase",
            "indExistInfo",
            "infoCRMen",
            "infoCRDia"
        })
        public static class InfoIRRF {

            @XmlElement(required = true)
            protected String nrRecArqBase;
            protected byte indExistInfo;
            protected List<ESocial.EvtIrrf.InfoIRRF.InfoCRMen> infoCRMen;
            protected List<ESocial.EvtIrrf.InfoIRRF.InfoCRDia> infoCRDia;

            /**
             * Gets the value of the nrRecArqBase property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrRecArqBase() {
                return nrRecArqBase;
            }

            /**
             * Sets the value of the nrRecArqBase property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrRecArqBase(String value) {
                this.nrRecArqBase = value;
            }

            /**
             * Gets the value of the indExistInfo property.
             * 
             */
            public byte getIndExistInfo() {
                return indExistInfo;
            }

            /**
             * Sets the value of the indExistInfo property.
             * 
             */
            public void setIndExistInfo(byte value) {
                this.indExistInfo = value;
            }

            /**
             * Gets the value of the infoCRMen property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infoCRMen property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfoCRMen().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtIrrf.InfoIRRF.InfoCRMen }
             * 
             * 
             */
            public List<ESocial.EvtIrrf.InfoIRRF.InfoCRMen> getInfoCRMen() {
                if (infoCRMen == null) {
                    infoCRMen = new ArrayList<ESocial.EvtIrrf.InfoIRRF.InfoCRMen>();
                }
                return this.infoCRMen;
            }

            /**
             * Gets the value of the infoCRDia property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infoCRDia property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfoCRDia().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtIrrf.InfoIRRF.InfoCRDia }
             * 
             * 
             */
            public List<ESocial.EvtIrrf.InfoIRRF.InfoCRDia> getInfoCRDia() {
                if (infoCRDia == null) {
                    infoCRDia = new ArrayList<ESocial.EvtIrrf.InfoIRRF.InfoCRDia>();
                }
                return this.infoCRDia;
            }


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
             *         &lt;element name="perApurDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_dia"/>
             *         &lt;element name="CRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_CRDia"/>
             *         &lt;element name="vrCRDia" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_valorMonetario_positivo"/>
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
                "perApurDia",
                "crDia",
                "vrCRDia"
            })
            public static class InfoCRDia {

                protected byte perApurDia;
                @XmlElement(name = "CRDia", required = true)
                protected String crDia;
                @XmlElement(required = true)
                protected BigDecimal vrCRDia;

                /**
                 * Gets the value of the perApurDia property.
                 * 
                 */
                public byte getPerApurDia() {
                    return perApurDia;
                }

                /**
                 * Sets the value of the perApurDia property.
                 * 
                 */
                public void setPerApurDia(byte value) {
                    this.perApurDia = value;
                }

                /**
                 * Gets the value of the crDia property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCRDia() {
                    return crDia;
                }

                /**
                 * Sets the value of the crDia property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCRDia(String value) {
                    this.crDia = value;
                }

                /**
                 * Gets the value of the vrCRDia property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrCRDia() {
                    return vrCRDia;
                }

                /**
                 * Sets the value of the vrCRDia property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrCRDia(BigDecimal value) {
                    this.vrCRDia = value;
                }

            }


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
             *         &lt;element name="CRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_CRMen"/>
             *         &lt;element name="vrCRMen" type="{http://www.esocial.gov.br/schema/evt/evtIrrf/v_S_01_02_00}TS_valorMonetario_positivo"/>
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
                "crMen",
                "vrCRMen"
            })
            public static class InfoCRMen {

                @XmlElement(name = "CRMen", required = true)
                protected String crMen;
                @XmlElement(required = true)
                protected BigDecimal vrCRMen;

                /**
                 * Gets the value of the crMen property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCRMen() {
                    return crMen;
                }

                /**
                 * Sets the value of the crMen property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCRMen(String value) {
                    this.crMen = value;
                }

                /**
                 * Gets the value of the vrCRMen property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrCRMen() {
                    return vrCRMen;
                }

                /**
                 * Sets the value of the vrCRMen property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrCRMen(BigDecimal value) {
                    this.vrCRMen = value;
                }

            }

        }

    }

}
