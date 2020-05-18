package com.ananat.weather.forecast;


public class Overloaded {
	
	public static void get(int x)
	{
		System.out.println("you are "+x+" years old");
	}
	public static void get(int x,double y)
	{
		System.out.println("you are "+x+" years old and "+y+" meters tall");
	}
	public static void get(int x,double y,int z)
	{
		System.out.println("you are "+x+" years old and "+y+" meters tall and your weight is " +z+" kgs");	
	}

	public static void main(String[] args) {
			//Overloaded o1 = new Overloaded();
			get(12);
			get(12, 1.73);
			get(12, 1.73, 80);
		
}
}