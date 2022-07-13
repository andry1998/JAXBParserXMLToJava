package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class Laboratory {
    @XmlElement(name = "NumberReg", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private  String numberReg;

    @XmlElement(name = "Name", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private  String name;

    @XmlElement(name = "DateReg", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private  String dateReg;

    @XmlElement(name = "DateExpiry", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private  String dateExpiry;

    @XmlElement(name = "Document", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private  Nil document;

    @XmlElement(name = "Info", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private  Nil info;

    public String getNumberReg() {
        return numberReg;
    }

    public void setNumberReg(String numberReg) {
        this.numberReg = numberReg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateReg() {
        return dateReg;
    }

    public void setDateReg(String dateReg) {
        this.dateReg = dateReg;
    }

    public String getDateExpiry() {
        return dateExpiry;
    }

    public void setDateExpiry(String dateExpiry) {
        this.dateExpiry = dateExpiry;
    }

    public Nil getDocument() {
        return document;
    }

    public void setDocument(Nil document) {
        this.document = document;
    }

    public Nil getInfo() {
        return info;
    }

    public void setInfo(Nil info) {
        this.info = info;
    }
}
