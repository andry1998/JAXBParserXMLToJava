package org.example.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {

    @XmlElement(name = "DeclareType", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String declareType;

    @XmlElement(name = "DcOriginType", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String dcOriginType;

    @XmlElement(name = "Name", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String name;

    @XmlElement(name = "ProductInfo", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String productInfo;

    @XmlElement(name = "Okp", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private int okp;

    @XmlElement(name = "OkpdText", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil okpdText;

    @XmlElement(name = "Standart", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil standart;

    @XmlElement(name = "SizeNumber", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String sizeNumber;

    @XmlElement(name = "DetailsShippingDocumentation", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil detailsShippingDocumentation;

    @XmlElement(name = "ContractInfo", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil contractInfo;

    @XmlElement(name = "Info", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String info;

    @XmlElement(name = "PlaceMark", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Nil placeMark;

    @XmlElement(name = "TechRegs", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private TechRegs techRegs;

    public void setDeclareType(String declareType) {
        this.declareType = declareType;
    }

    public void setDcOriginType(String dcOriginType) {
        this.dcOriginType = dcOriginType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public void setOkp(int okp) {
        this.okp = okp;
    }

    public void setOkpdText(Nil okpdText) {
        this.okpdText = okpdText;
    }

    public void setStandart(Nil standart) {
        this.standart = standart;
    }

    public void setSizeNumber(String sizeNumber) {
        this.sizeNumber = sizeNumber;
    }

    public void setDetailsShippingDocumentation(Nil detailsShippingDocumentation) {
        this.detailsShippingDocumentation = detailsShippingDocumentation;
    }

    public void setContractInfo(Nil contractInfo) {
        this.contractInfo = contractInfo;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setPlaceMark(Nil placeMark) {
        this.placeMark = placeMark;
    }
}
