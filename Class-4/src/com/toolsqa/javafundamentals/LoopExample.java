package com.toolsqa.javafundamentals;

import java.util.ArrayList;


public class LoopExample {

	public static void forLoopExample()
	{
		int i;
				
		// For Loop
		// FOR(INITIALIZATION ; CONDITION ; INCR/DECR)
		for(i = 0; i < 10; i++)
		{
			System.out.println(i);
			
			// Any number of statements
		}

		// Next Statements after loop
	}
	
	public static void whileLoopExample()
	{
		int i;
		
		// INITIALIZATION
		i=0;
		
		// CONDITION
		while(i<10)
		{
			
			System.out.println(i);
			
			
			// INC/DEC
			i++;
		}
	}
	
	public static void arrayExample()
	{
		String a = "toolsqa";
		a = "google";
		
		String arr[] = new String[5];
		
		arr[0] = "toolsqa";
		arr[1] = "google";
		arr[2] = "oracle2";
		arr[3] = "oracle3";
		arr[4] = "oracle4";
				
		
		for(int i=arr.length-1;i>=0;i--)
			System.out.println(arr[i]);
		
		// Enhanced For Loop
		for(String s : arr)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		//forLoopExample();
		//whileLoopExample();
		
		//arrayExample();
		
		arrayListExample();
		
	}

	public static void arrayListExample() {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("toolsqa");
		list.add(0, "google");
		list.add("oracle1");
		
		for (String abc : list) {
			
			System.out.println(abc);
		}
		
		
		for (int i = 0; i < list.size(); i++) {
			
			// list[i] - Array Elements
			
			System.out.println(list.get(i));
		}
	}

}
