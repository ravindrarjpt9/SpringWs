package com.jackson.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToMap {

	public static void main(String[] args) {
		
		try {
			byte[] myData = Files.readAllBytes(Paths.get("data.txt"));
			Map<String, String> myMap = new HashMap<>();
			ObjectMapper mapper = new ObjectMapper();
			myMap = mapper.readValue(myData, Map.class);
			System.out.println(myMap);
			
			//another way
			myMap = mapper.readValue(myData, new TypeReference<HashMap<String,String>>() {});
			System.out.println("Map using TypeReference: "+myMap);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
