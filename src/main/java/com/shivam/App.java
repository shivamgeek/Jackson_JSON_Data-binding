package com.shivam;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	try {
    		ObjectMapper mapper  = new ObjectMapper();
    		
    		Student s = mapper.readValue(new File("data/sample-full.json"), Student.class);
    		
    		System.out.println(s.getFirstName() + " "+s.getLastName()+" active status is : "+s.isActive());
    		System.out.println(s);
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
}
