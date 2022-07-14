package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicantAl {
    @XmlElement(name = "nil", namespace = "http://www.w3.org/2001/XMLSchema-instance")
    private Nil applicantAl;

    public Nil getApplicantAl() {
        return applicantAl;
    }

    public void setApplicantAl(Nil applicantAl) {
        this.applicantAl = applicantAl;
    }
}
