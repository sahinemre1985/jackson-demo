package com.emre.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

	public static void main(String[] args) {
		
		try {
			//create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			//read JSOn file and convert to Java POJO
			Mukellef mukellef = mapper.readValue(new File("data/sample-full.json"), Mukellef.class);
			
			//print some value
			System.out.println("Values from selected file");
			System.out.println("First Name = "+mukellef.getFirstName());
			System.out.println("Last Name = "+mukellef.getLastName());
			System.out.println("City = "+mukellef.getAddress().getCity());
			
			for( String tempLanguage : mukellef.getLanguages()) {
				System.out.println(tempLanguage);
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
