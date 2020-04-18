package com.ananat.weather.forecast;
import java.util.ArrayList;
public class Excollection {
	
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("Anant");
		array.add("jain");
		
		StringBuilder sb = new StringBuilder();
		
		for(String a : array)
		{
			sb.append(a);
			sb.append(" ");
		}
		System.out.println(sb);
		
		/*
		 * int a = array.get(0); float b = array.get(1); System.out.println(a);
		 * System.out.println(b);
		 */
		
		
		
		//ArrayList<int> array1 = new ArrayList<int>();
		//we can't pass primitive data types here so we use wrapper classes
		
		
		String s = "43";
		Integer int1 = Integer.valueOf(s);
		System.out.println(int1);
		
	}

}
