package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Manufacturer {

    @XmlElement(name = "Type", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String type;

    @XmlElement(name = "ManufacturerUl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private ManufacturerUl manufacturerUl;

    @XmlElement(name = "ManufacturerAl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil manufacturerAl;

    @XmlElement(name = "ManufacturerFl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil manufacturerFl;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ManufacturerUl getManufacturerUl() {
        return manufacturerUl;
    }

    public void setManufacturerUl(ManufacturerUl manufacturerUl) {
        this.manufacturerUl = manufacturerUl;
    }

    public Nil getManufacturerAl() {
        return manufacturerAl;
    }

    public void setManufacturerAl(Nil manufacturerAl) {
        this.manufacturerAl = manufacturerAl;
    }

    public Nil getManufacturerFl() {
        return manufacturerFl;
    }

    public void setManufacturerFl(Nil manufacturerFl) {
        this.manufacturerFl = manufacturerFl;
    }
}
