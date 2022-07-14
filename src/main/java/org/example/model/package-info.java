@XmlSchema(
        xmlns = {@XmlNs(
                prefix = "fsa",
                namespaceURI = "urn://x-artefact-rosaccreditation-ru/rdc/1.0.2"
        ),
                @XmlNs(
                        prefix = "tns",
                        namespaceURI = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2"
                )
        }
//        namespace = "urn://x-artefact-rosaccreditation-ru/rdc/1.0.2",
//        elementFormDefault = XmlNsForm.QUALIFIED
)

package org.example.model;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;