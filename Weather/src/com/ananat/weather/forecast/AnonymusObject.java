package com.ananat.weather.forecast;

public class AnonymusObject {

	int x = getx();
	
	int getx()
	{
		System.out.println(x);
		return 30;
	}
	AnonymusObject ()
	{
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonymusObject();
		
	}

}
