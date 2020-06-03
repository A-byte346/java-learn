package com.ananat.weather.forecast;

class based{
	int x= 20;
	void show()
	{
		System.out.println("base");
	}
}

public class Upcasting extends based {
int x =30;//data hiding
void show()
{
	System.out.println("child");
}
void display()
{
	System.out.println("display");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		based b = new Upcasting();//upcasting
		b.show();
		Upcasting up = (Upcasting)b;
		up.display();

	}

}
