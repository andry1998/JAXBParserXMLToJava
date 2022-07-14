package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class CertificationOrgan {

    @XmlElement(name = "FullName", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String fullName;

    @XmlElement(name = "Number", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String number;

    @XmlElement(name = "DateReg", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String dateReg;

    @XmlElement(name = "Organ", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String organ;

    @XmlElement(name = "Head", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String head;

    @XmlElement(name = "AddressLegal", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String addressLegal;

    @XmlElement(name = "Address", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String address;

    @XmlElement(name = "Phone", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String phone;

    @XmlElement(name = "Fax", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String fax;

    @XmlElement(name = "Email", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String email;

    @XmlElement(name = "Ogrn", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil ogrn;

    @XmlElement(name = "Experts", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Experts experts;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDateReg() {
        return dateReg;
    }

    public void setDateReg(String dateReg) {
        this.dateReg = dateReg;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getAddressLegal() {
        return addressLegal;
    }

    public void setAddressLegal(String addressLegal) {
        this.addressLegal = addressLegal;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Nil getOgrn() {
        return ogrn;
    }

    public void setOgrn(Nil ogrn) {
        this.ogrn = ogrn;
    }

    public Experts getExperts() {
        return experts;
    }

    public void setExperts(Experts experts) {
        this.experts = experts;
    }
}
