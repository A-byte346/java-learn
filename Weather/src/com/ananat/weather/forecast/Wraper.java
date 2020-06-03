package com.ananat.weather.forecast;

public class Wraper {

	public static void main(String[] args) {
		
		byte a = 10;//default value is 0
		int b = 20;//default value is 0
		float c = 30.6f;//default value is 0.0f
		double d = 250.5;//default value 0
		char e = 'a';//default value is null
		//default value of boolean is false;
		//default value of short is 0;
		Byte byte1 = new Byte(a);
		Integer int1 = new Integer(b);//primitive to wrapper
		int val = int1.intValue();//wrapper to primitive conversion
		Float float1 = new Float(c);
		Double double1 = new Double(d);
		Character char1 = new Character(e);
		System.out.println("wrapped values");
		System.out.println(byte1);
		System.out.println(int1);
		System.out.println(val);
		System.out.println(float1);
		System.out.println(double1);
		System.out.println(char1);
		
		byte v = byte1;
		int w = int1;
		float x = float1;
		double y = double1;
		char z = char1;
		
		System.out.println("unwrapped values");
		System.out.println(v);
		System.out.println(w);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
