package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class ManufacturerUl {

    @XmlElement(name = "OrganForm", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String organForm;

    @XmlElement(name = "FullName", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String fullName;

    @XmlElement(name = "Address", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Address address;

    @XmlElement(name = "AddressActual", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String addressActual;

    @XmlElement(name = "Phone", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String phone;

    @XmlElement(name = "Fax", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String fax;

    @XmlElement(name = "Email", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String email;

    @XmlElement(name = "Organ", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil organ;

    @XmlElement(name = "Date", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil date;

    @XmlElement(name = "Ogrn", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private int ogrn;

    @XmlElement(name = "Inn", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private int inn;

    public String getOrganForm() {
        return organForm;
    }

    public void setOrganForm(String organForm) {
        this.organForm = organForm;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAddressActual() {
        return addressActual;
    }

    public void setAddressActual(String addressActual) {
        this.addressActual = addressActual;
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

    public Nil getOrgan() {
        return organ;
    }

    public void setOrgan(Nil organ) {
        this.organ = organ;
    }

    public Nil getDate() {
        return date;
    }

    public void setDate(Nil date) {
        this.date = date;
    }

    public int getOgrn() {
        return ogrn;
    }

    public void setOgrn(int ogrn) {
        this.ogrn = ogrn;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }
}
