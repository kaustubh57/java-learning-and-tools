package com.javatools.json.read;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

/**
 * Created by kaustubh on 8/19/16.
 */
public class JSONReadFromFile {

    public static void printJSONData(final File jsonFile) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader(jsonFile));
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("Name");
            String author = (String) jsonObject.get("Author");
            JSONArray companyList = (JSONArray) jsonObject.get("Company List");

            System.out.println("Name: " + name);
            System.out.println("Author: " + author);
            System.out.println("\nCompany List:");
            Iterator<String> iterator = companyList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
