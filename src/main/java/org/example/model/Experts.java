package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Experts {

    @XmlElement(name = "Surname", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String surname;

    @XmlElement(name = "Name", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String name;

    @XmlElement(name = "Patronymic", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String patronymic;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
