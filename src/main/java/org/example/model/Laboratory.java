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
}
