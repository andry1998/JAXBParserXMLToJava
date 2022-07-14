package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

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

    public String getDeclareType() {
        return declareType;
    }

    public void setDeclareType(String declareType) {
        this.declareType = declareType;
    }

    public String getDcOriginType() {
        return dcOriginType;
    }

    public void setDcOriginType(String dcOriginType) {
        this.dcOriginType = dcOriginType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public int getOkp() {
        return okp;
    }

    public void setOkp(int okp) {
        this.okp = okp;
    }

    public Nil getOkpdText() {
        return okpdText;
    }

    public void setOkpdText(Nil okpdText) {
        this.okpdText = okpdText;
    }

    public Nil getStandart() {
        return standart;
    }

    public void setStandart(Nil standart) {
        this.standart = standart;
    }

    public String getSizeNumber() {
        return sizeNumber;
    }

    public void setSizeNumber(String sizeNumber) {
        this.sizeNumber = sizeNumber;
    }

    public Nil getDetailsShippingDocumentation() {
        return detailsShippingDocumentation;
    }

    public void setDetailsShippingDocumentation(Nil detailsShippingDocumentation) {
        this.detailsShippingDocumentation = detailsShippingDocumentation;
    }

    public Nil getContractInfo() {
        return contractInfo;
    }

    public void setContractInfo(Nil contractInfo) {
        this.contractInfo = contractInfo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Nil getPlaceMark() {
        return placeMark;
    }

    public void setPlaceMark(Nil placeMark) {
        this.placeMark = placeMark;
    }

    public TechRegs getTechRegs() {
        return techRegs;
    }

//    public void setTechRegs(TechRegs techRegs) {
//        this.techRegs = techRegs;
//    }
}
