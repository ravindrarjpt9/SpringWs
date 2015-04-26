package com.jackson.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.RootNameLookup;

public class ReadSpecificEntries {

	public static void main(String[] args) {
		
		//Read json data
		try {
			byte[] myData = Files.readAllBytes(Paths.get("Employee.txt"));
			ObjectMapper mapper = new ObjectMapper();
			JsonNode jsonNode = mapper.readTree(myData);
			JsonNode jsonNode2 = jsonNode.path("id");
			System.out.println("ID "+ jsonNode2.asInt());
			JsonNode phoneNumber = jsonNode.path("phoneNumbers");
			Iterator<JsonNode> it = phoneNumber.elements();
			while(it.hasNext())
			{
				JsonNode jsonNode3 = it.next();
				System.out.println("Number : " + jsonNode3.asLong());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
