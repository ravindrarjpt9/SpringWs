package com.jackson.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonObjectMapperExample {

	public static void main(String[] args) {
		try
		{
		//read json file data to String
		byte[] jsonData = Files.readAllBytes(Paths.get("employee.txt"));
		//Create ObjectMapper Class
		ObjectMapper mapper = new ObjectMapper();
		//Convert Josn String to Object
		Employee employee = mapper.readValue(jsonData, Employee.class);
		System.out.println(" Employee Object : " + employee);
		
		}catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
