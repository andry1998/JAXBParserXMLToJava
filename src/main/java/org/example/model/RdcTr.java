package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class RdcTr {

    @XmlElement(name = "Requisites")
    private Requisites requisites;

    @XmlElement(name = "Applicant")
    private Applicant applicant;

    @XmlElement(name = "ApplicantUl")
    private ApplicantUl applicantUl;

    @XmlElement(name = "ApplicantFl")
    private ApplicantFl applicantFl;

    @XmlElement(name = "ApplicantAl")
    private ApplicantAl applicantAl;

    @XmlElement(name = "ApplicantAu")
    private ApplicantAu applicantAu;

    @XmlElement(name = "Manufacturer")
    private Manufacturer manufacturer;

    @XmlElement(name = "Product")
    private Product product;

    @XmlElement(name = "DeclareAddInfo")
    private DeclareAddInfo declareAddInfo;

    @XmlElement(name = "CertificationOrgan")
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

    public ApplicantFl getApplicantFl() {
        return applicantFl;
    }

    public void setApplicantFl(ApplicantFl applicantFl) {
        this.applicantFl = applicantFl;
    }

    public ApplicantAl getApplicantAl() {
        return applicantAl;
    }

    public void setApplicantAl(ApplicantAl applicantAl) {
        this.applicantAl = applicantAl;
    }

    public ApplicantAu getApplicantAu() {
        return applicantAu;
    }

    public void setApplicantAu(ApplicantAu applicantAu) {
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

    public DeclareAddInfo getDeclareAddInfo() {
        return declareAddInfo;
    }

    public void setDeclareAddInfo(DeclareAddInfo declareAddInfo) {
        this.declareAddInfo = declareAddInfo;
    }

    public CertificationOrgan getCertificationOrgan() {
        return certificationOrgan;
    }

    public void setCertificationOrgan(CertificationOrgan certificationOrgan) {
        this.certificationOrgan = certificationOrgan;
    }
}
