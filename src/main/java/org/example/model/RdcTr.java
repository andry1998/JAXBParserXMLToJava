package org.example.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class RdcTr {

    @XmlElement(name = "Requisites", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Requisites requisites;

    @XmlElement(name = "Applicant", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Applicant applicant;

    @XmlElement(name = "ApplicantUl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private ApplicantUl applicantUl;

    @XmlElement(name = "ApplicantFl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil applicantFl;

    @XmlElement(name = "ApplicantAl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil applicantAl;

    @XmlElement(name = "ApplicantAu", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil applicantAu;

    @XmlElement(name = "Manufacturer", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Manufacturer manufacturer;

    @XmlElement(name = "Product", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Product product;

    @XmlElement(name = "DeclareAddInfo", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil declareAddInfo;

    @XmlElement(name = "CertificationOrgan", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private CertificationOrgan certificationOrgan;
}
