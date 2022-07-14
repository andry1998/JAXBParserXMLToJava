package org.example.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class Nil {
    @XmlAttribute(name = "nil", namespace = "http://www.w3.org/2001/XMLSchema-instance")
    private boolean nil;
}
