package com.ananat.weather.forecast;

public class Demonstration {
	
	
	public static void string(String str)
	{
		str = str + " Anant jain";
		//System.out.println(str);
	}
	
	public static void stringbuilder(StringBuilder str1)
	{
		str1.append(" Anant jain");
	}
	public static void stringbuffer(StringBuffer str2)
	{
		str2.append(" Anant jain");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Myself";
		string(str);
		System.out.println(str);
		StringBuilder str1 = new StringBuilder("Myself");
		stringbuilder(str1);
		System.out.println(str1);
		StringBuffer str2 = new StringBuffer("Myself");
		stringbuffer(str2);
		System.out.println(str2);

	}

}
