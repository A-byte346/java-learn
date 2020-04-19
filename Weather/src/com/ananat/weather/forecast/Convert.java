package com.ananat.weather.forecast;

public class Convert {
	
	String name;
	int rollno;
	static String cllgname;
	static int count = 0;
	
	static{
		cllgname = "BITS,pilani";
	}
	
	public Convert(String str)
	{
		this.name = str;
		this.rollno = rolno();
	}
	 static int rolno()
	{
		count++;
		return count;
	}
	void printinfo()
	{
		System.out.println(name+" "+rollno+" "+cllgname);
	}
	
	public static void main(String[] args) {
		
		Convert c1 = new Convert("Anant jain");
		Convert c2 = new Convert("sujal jain");
		Convert c3 = new Convert("shreyansh jain");
		
		c1.printinfo();
		c2.printinfo();
		c3.printinfo();
		
		
		
		
		
		
		
	}
}