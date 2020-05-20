package com.ananat.weather.forecast;

public class constructorchaining {
		
	constructorchaining()
	{
		
		System.out.println("default constructor");
		
	}
	constructorchaining(int x)
	{
		this(10,20);
		System.out.println(x);
	}
	constructorchaining(int x,int y)
	{
		this();
		System.out.println(x+y);
	}
	public static void main(String...  s)
	{
		new constructorchaining(10);
	}
}
