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
}
