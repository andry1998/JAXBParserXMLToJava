package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Applicant {
    @XmlElement(name = "ApplicantType", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String applicantType;

    @XmlElement(name = "DeclarantType", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String declarantType;

    public String getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(String applicantType) {
        this.applicantType = applicantType;
    }

    public String getDeclarantType() {
        return declarantType;
    }

    public void setDeclarantType(String declarantType) {
        this.declarantType = declarantType;
    }
}
