package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicantFl {
    @XmlElement(name = "ApplicantFl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil applicantFl;

    public Nil getApplicantFl() {
        return applicantFl;
    }

    public void setApplicantFl(Nil applicantFl) {
        this.applicantFl = applicantFl;
    }
}
