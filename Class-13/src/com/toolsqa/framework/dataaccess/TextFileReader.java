package com.toolsqa.framework.dataaccess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.toolsqa.framework.logger.Logger;

public class TextFileReader {

	public static ArrayList<String> getTextFileData(String filePath)
	{
		try{
		ArrayList<String> lines = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		
		String line;
		while((line = br.readLine())!=null)
		{
			lines.add(line);
		}
		
		br.close();
		return lines;
		}
		catch(Exception ex)
		{
			Logger.logFail("Failed to load file " + filePath);
		}
		return null;
	}
}
