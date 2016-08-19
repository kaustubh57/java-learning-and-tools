package com.javatools;

import com.javatools.json.read.JSONReadFromFile;
import com.javatools.xml.util.JSONToXMLParser;

import java.io.File;

public class App {
    public static void main(String[] args) throws Exception{

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        final File sampleJSONFile = new File(classLoader.getResource("sample.json").getFile());

//        JSONReadFromFile.printJSONData(sampleJSONFile);

        JSONToXMLParser.convertJSONToXML(sampleJSONFile);
    }
}
