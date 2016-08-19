package com.javatools.xml.util;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.json.XML;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by kaustubh on 8/19/16.
 */
public class JSONToXMLParser {

    public static void convertJSONToXML(final File jsonFile) throws Exception {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(jsonFile);
            String jsonString = IOUtils.toString(inputStream);
            System.out.println(jsonString);
            JSONObject json = new JSONObject(jsonString);
            String xml = "<root>"+XML.toString(json)+"</root>";
            System.out.println(xml);
            System.out.println(XmlFormatter.format(xml));
        } finally {
            inputStream.close();
        }
    }
}
