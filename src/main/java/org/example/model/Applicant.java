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
public class Applicant {
    @XmlElement(name = "ApplicantType", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String applicantType;

    @XmlElement(name = "DeclarantType", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String declarantType;
}
