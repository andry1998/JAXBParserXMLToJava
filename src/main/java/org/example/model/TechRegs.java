package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TechRegs {

    @XmlElement(name = "TechReg", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String techReg;

    @XmlElement(name = "TechRegInfo", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil techRegInfo;

    public String getTechReg() {
        return techReg;
    }

    public void setTechReg(String techReg) {
        this.techReg = techReg;
    }

    public Nil getTechRegInfo() {
        return techRegInfo;
    }

    public void setTechRegInfo(Nil techRegInfo) {
        this.techRegInfo = techRegInfo;
    }
}
