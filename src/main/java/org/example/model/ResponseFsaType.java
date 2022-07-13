package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ResponseFsaType", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/1.0.2")

public class ResponseFsaType {
    @XmlElement(name = "RdcTr")
    private RdcTr rdcTr;

    public RdcTr getRdcTr() {
        return rdcTr;
    }

    public void setRdcTr(RdcTr rdcTr) {
        this.rdcTr = rdcTr;
    }
}
