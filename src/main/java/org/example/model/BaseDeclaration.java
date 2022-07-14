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
public class BaseDeclaration {
    @XmlElement(name = "Documents", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String documents;

    @XmlElement(name = "Schema", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String schema;

    @XmlElement(name = "Base", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Base base;

    @XmlElement(name = "Laboratory", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Laboratory laboratory;
}
