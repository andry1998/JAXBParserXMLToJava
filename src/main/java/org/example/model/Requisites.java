package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Requisites {
    @XmlElement(name = "Status", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String status;

    @XmlElement(name = "Section", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String section;

    @XmlElement(name = "Number", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String number;

    @XmlElement(name = "DateReg", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String dateReg;

    @XmlElement(name = "DateExpiry", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String dateExpiry;

    @XmlElement(name = "NoExpiry", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil noExpiry;

    @XmlElement(name = "BaseDeclaration", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private BaseDeclaration baseDeclaration;

    @XmlElement(name = "Discontinued", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil discontinued;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
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

    public String getDateExpiry() {
        return dateExpiry;
    }

    public void setDateExpiry(String dateExpiry) {
        this.dateExpiry = dateExpiry;
    }

    public Nil getNoExpiry() {
        return noExpiry;
    }

    public void setNoExpiry(Nil noExpiry) {
        this.noExpiry = noExpiry;
    }

    public BaseDeclaration getBaseDeclaration() {
        return baseDeclaration;
    }

    public void setBaseDeclaration(BaseDeclaration baseDeclaration) {
        this.baseDeclaration = baseDeclaration;
    }

    public Nil getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Nil discontinued) {
        this.discontinued = discontinued;
    }
}
