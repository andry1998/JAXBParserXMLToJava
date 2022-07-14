package org.example;

import org.example.model.ResponseFsaType;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Main {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {

            File outputFilename = new File("output.yml");
            File sampleFilename = new File("sample.xml");

            //method convert xml file to java object
            ResponseFsaType responseFsaType = ParsingFromXmlToJavaObject(sampleFilename);
            //method converts java object to yml file
            ParsingFromJavaObjectToYAML(outputFilename, responseFsaType);

    }

    public static ResponseFsaType ParsingFromXmlToJavaObject(File filename) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(ResponseFsaType.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        ResponseFsaType responseFsaType = (ResponseFsaType) unmarshaller.unmarshal(filename);
        return responseFsaType;
    }

    public static void ParsingFromJavaObjectToYAML(File outputFilename, ResponseFsaType responseFsaType) throws FileNotFoundException {
        DumperOptions options = new DumperOptions();
        options.setIndent(2);
        options.setPrettyFlow(true);
        options.setAllowReadOnlyProperties(false);
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);

        PrintWriter writer = new PrintWriter(outputFilename);
        Yaml yaml = new Yaml(options);
        yaml.dump(responseFsaType, writer);
    }
}