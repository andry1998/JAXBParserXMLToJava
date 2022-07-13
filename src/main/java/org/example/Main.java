package org.example;

import org.example.model.ResponseFsaType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try{
            File file = new File("sample.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(ResponseFsaType.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            ResponseFsaType responseFsaType = (ResponseFsaType) unmarshaller.unmarshal(file);
            System.out.println(responseFsaType.getRdcTr().getApplicantUl().getDate().isNil());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}