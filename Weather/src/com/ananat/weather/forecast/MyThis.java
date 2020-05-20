package com.ananat.weather.forecast;

public class MyThis {
	
	int x=10;
	void show(MyThis z,int x)
	{
		System.out.println(x);
		System.out.println(z.x);
		System.out.println(z);
		System.out.println(this.x);
		System.out.println(this);
		
	}

	public static void main(String[] args) {
	MyThis m1 = new MyThis();
	System.out.println(m1.x);
	m1.show(m1,20);
	System.out.println(m1);
	
	}

}

