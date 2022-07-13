package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class BaseDeclaration {
    @XmlElement(name = "Documents", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String documents;

    @XmlElement(name = "Schema", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String schema;

    @XmlElement(name = "Base", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Base base;

    @XmlElement(name = "Laboratory", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Laboratory laboratory;

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Laboratory getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(Laboratory laboratory) {
        this.laboratory = laboratory;
    }
}
