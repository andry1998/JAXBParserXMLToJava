package org.example.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ResponseFsaType", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/1.0.2")

public class ResponseFsaType {
    @XmlElement(name = "RdcTr", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/1.0.2")
    private RdcTr rdcTr;
}
