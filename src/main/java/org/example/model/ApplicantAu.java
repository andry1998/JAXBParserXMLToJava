package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicantAu {
    @XmlElement(name = "nil", namespace = "http://www.w3.org/2001/XMLSchema-instance")
    private Nil applicantAu;

    public Nil getApplicantAu() {
        return applicantAu;
    }

    public void setApplicantAu(Nil applicantAu) {
        this.applicantAu = applicantAu;
    }
}
