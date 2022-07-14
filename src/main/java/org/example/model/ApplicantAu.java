package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicantAu {
    @XmlElement(name = "ApplicantAu", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil applicantAu;

    public Nil getApplicantAu() {
        return applicantAu;
    }

    public void setApplicantAu(Nil applicantAu) {
        this.applicantAu = applicantAu;
    }
}
