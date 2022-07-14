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
public class Manufacturer {

    @XmlElement(name = "Type", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String type;

    @XmlElement(name = "ManufacturerUl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private ManufacturerUl manufacturerUl;

    @XmlElement(name = "ManufacturerAl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil manufacturerAl;

    @XmlElement(name = "ManufacturerFl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil manufacturerFl;
}
