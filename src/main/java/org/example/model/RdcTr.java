package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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

    public Requisites getRequisites() {
        return requisites;
    }

    public void setRequisites(Requisites requisites) {
        this.requisites = requisites;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public ApplicantUl getApplicantUl() {
        return applicantUl;
    }

    public void setApplicantUl(ApplicantUl applicantUl) {
        this.applicantUl = applicantUl;
    }

    public Nil getApplicantFl() {
        return applicantFl;
    }

    public void setApplicantFl(Nil applicantFl) {
        this.applicantFl = applicantFl;
    }

    public Nil getApplicantAl() {
        return applicantAl;
    }

    public void setApplicantAl(Nil applicantAl) {
        this.applicantAl = applicantAl;
    }

    public Nil getApplicantAu() {
        return applicantAu;
    }

    public void setApplicantAu(Nil applicantAu) {
        this.applicantAu = applicantAu;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Nil getDeclareAddInfo() {
        return declareAddInfo;
    }

    public void setDeclareAddInfo(Nil declareAddInfo) {
        this.declareAddInfo = declareAddInfo;
    }

    public CertificationOrgan getCertificationOrgan() {
        return certificationOrgan;
    }

    public void setCertificationOrgan(CertificationOrgan certificationOrgan) {
        this.certificationOrgan = certificationOrgan;
    }
}
