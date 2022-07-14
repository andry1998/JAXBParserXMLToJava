package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicantFl {
    @XmlElement(name = "nil", namespace = "http://www.w3.org/2001/XMLSchema-instance")
    private Nil applicantFl;

    public Nil getApplicantFl() {
        return applicantFl;
    }

    public void setApplicantFl(Nil applicantFl) {
        this.applicantFl = applicantFl;
    }
}
