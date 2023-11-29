//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.04 at 05:31:18 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tablotacao;

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
 *         &lt;element name="evtTabLotacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideEvento_evtTab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideEmpregador"/>
 *                   &lt;element name="infoLotacao">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="inclusao">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideLotacao"/>
 *                                         &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_dadosLotacao"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="alteracao">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideLotacao"/>
 *                                         &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_dadosLotacao"/>
 *                                         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_novaValidade" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="exclusao">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideLotacao"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}TS_Id" />
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
    "evtTabLotacao",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtTabLotacao evtTabLotacao;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtTabLotacao property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTabLotacao }
     *     
     */
    public ESocial.EvtTabLotacao getEvtTabLotacao() {
        return evtTabLotacao;
    }

    /**
     * Sets the value of the evtTabLotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTabLotacao }
     *     
     */
    public void setEvtTabLotacao(ESocial.EvtTabLotacao value) {
        this.evtTabLotacao = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideEvento_evtTab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideEmpregador"/>
     *         &lt;element name="infoLotacao">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="inclusao">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideLotacao"/>
     *                               &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_dadosLotacao"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="alteracao">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideLotacao"/>
     *                               &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_dadosLotacao"/>
     *                               &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_novaValidade" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="exclusao">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideLotacao"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}TS_Id" />
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
        "infoLotacao"
    })
    public static class EvtTabLotacao {

        @XmlElement(required = true)
        protected TIdeEventoEvtTab ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtTabLotacao.InfoLotacao infoLotacao;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the ideEvento property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoEvtTab }
         *     
         */
        public TIdeEventoEvtTab getIdeEvento() {
            return ideEvento;
        }

        /**
         * Sets the value of the ideEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoEvtTab }
         *     
         */
        public void setIdeEvento(TIdeEventoEvtTab value) {
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
         * Gets the value of the infoLotacao property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTabLotacao.InfoLotacao }
         *     
         */
        public ESocial.EvtTabLotacao.InfoLotacao getInfoLotacao() {
            return infoLotacao;
        }

        /**
         * Sets the value of the infoLotacao property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTabLotacao.InfoLotacao }
         *     
         */
        public void setInfoLotacao(ESocial.EvtTabLotacao.InfoLotacao value) {
            this.infoLotacao = value;
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
         *         &lt;choice>
         *           &lt;element name="inclusao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideLotacao"/>
         *                     &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_dadosLotacao"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="alteracao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideLotacao"/>
         *                     &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_dadosLotacao"/>
         *                     &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_novaValidade" minOccurs="0"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="exclusao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideLotacao"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/choice>
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
            "inclusao",
            "alteracao",
            "exclusao"
        })
        public static class InfoLotacao {

            protected ESocial.EvtTabLotacao.InfoLotacao.Inclusao inclusao;
            protected ESocial.EvtTabLotacao.InfoLotacao.Alteracao alteracao;
            protected ESocial.EvtTabLotacao.InfoLotacao.Exclusao exclusao;

            /**
             * Gets the value of the inclusao property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabLotacao.InfoLotacao.Inclusao }
             *     
             */
            public ESocial.EvtTabLotacao.InfoLotacao.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Sets the value of the inclusao property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabLotacao.InfoLotacao.Inclusao }
             *     
             */
            public void setInclusao(ESocial.EvtTabLotacao.InfoLotacao.Inclusao value) {
                this.inclusao = value;
            }

            /**
             * Gets the value of the alteracao property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabLotacao.InfoLotacao.Alteracao }
             *     
             */
            public ESocial.EvtTabLotacao.InfoLotacao.Alteracao getAlteracao() {
                return alteracao;
            }

            /**
             * Sets the value of the alteracao property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabLotacao.InfoLotacao.Alteracao }
             *     
             */
            public void setAlteracao(ESocial.EvtTabLotacao.InfoLotacao.Alteracao value) {
                this.alteracao = value;
            }

            /**
             * Gets the value of the exclusao property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabLotacao.InfoLotacao.Exclusao }
             *     
             */
            public ESocial.EvtTabLotacao.InfoLotacao.Exclusao getExclusao() {
                return exclusao;
            }

            /**
             * Sets the value of the exclusao property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabLotacao.InfoLotacao.Exclusao }
             *     
             */
            public void setExclusao(ESocial.EvtTabLotacao.InfoLotacao.Exclusao value) {
                this.exclusao = value;
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
             *         &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideLotacao"/>
             *         &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_dadosLotacao"/>
             *         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_novaValidade" minOccurs="0"/>
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
                "ideLotacao",
                "dadosLotacao",
                "novaValidade"
            })
            public static class Alteracao {

                @XmlElement(required = true)
                protected TIdeLotacao ideLotacao;
                @XmlElement(required = true)
                protected TDadosLotacao dadosLotacao;
                protected TNovaValidade novaValidade;

                /**
                 * Gets the value of the ideLotacao property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeLotacao }
                 *     
                 */
                public TIdeLotacao getIdeLotacao() {
                    return ideLotacao;
                }

                /**
                 * Sets the value of the ideLotacao property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeLotacao }
                 *     
                 */
                public void setIdeLotacao(TIdeLotacao value) {
                    this.ideLotacao = value;
                }

                /**
                 * Gets the value of the dadosLotacao property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosLotacao }
                 *     
                 */
                public TDadosLotacao getDadosLotacao() {
                    return dadosLotacao;
                }

                /**
                 * Sets the value of the dadosLotacao property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosLotacao }
                 *     
                 */
                public void setDadosLotacao(TDadosLotacao value) {
                    this.dadosLotacao = value;
                }

                /**
                 * Gets the value of the novaValidade property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TNovaValidade }
                 *     
                 */
                public TNovaValidade getNovaValidade() {
                    return novaValidade;
                }

                /**
                 * Sets the value of the novaValidade property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TNovaValidade }
                 *     
                 */
                public void setNovaValidade(TNovaValidade value) {
                    this.novaValidade = value;
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
             *         &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideLotacao"/>
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
                "ideLotacao"
            })
            public static class Exclusao {

                @XmlElement(required = true)
                protected TIdeLotacao ideLotacao;

                /**
                 * Gets the value of the ideLotacao property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeLotacao }
                 *     
                 */
                public TIdeLotacao getIdeLotacao() {
                    return ideLotacao;
                }

                /**
                 * Sets the value of the ideLotacao property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeLotacao }
                 *     
                 */
                public void setIdeLotacao(TIdeLotacao value) {
                    this.ideLotacao = value;
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
             *         &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_ideLotacao"/>
             *         &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_02_00}T_dadosLotacao"/>
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
                "ideLotacao",
                "dadosLotacao"
            })
            public static class Inclusao {

                @XmlElement(required = true)
                protected TIdeLotacao ideLotacao;
                @XmlElement(required = true)
                protected TDadosLotacao dadosLotacao;

                /**
                 * Gets the value of the ideLotacao property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeLotacao }
                 *     
                 */
                public TIdeLotacao getIdeLotacao() {
                    return ideLotacao;
                }

                /**
                 * Sets the value of the ideLotacao property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeLotacao }
                 *     
                 */
                public void setIdeLotacao(TIdeLotacao value) {
                    this.ideLotacao = value;
                }

                /**
                 * Gets the value of the dadosLotacao property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosLotacao }
                 *     
                 */
                public TDadosLotacao getDadosLotacao() {
                    return dadosLotacao;
                }

                /**
                 * Sets the value of the dadosLotacao property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosLotacao }
                 *     
                 */
                public void setDadosLotacao(TDadosLotacao value) {
                    this.dadosLotacao = value;
                }

            }

        }

    }

}
