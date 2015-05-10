package com.toolsqa.selenium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.WebDriver;

public class JavaWayOfSanityTest {

	public void run(WebDriver driver) throws IOException
	{
		URL toolsQaUrl= new URL("http://www.toolsqa.com/");
        URLConnection yc = toolsQaUrl.openConnection();
        BufferedReader in = 
		new BufferedReader(
			new InputStreamReader(
                              	yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine); // Include your validation here
        
        
        in.close();
		
	}
	
}
