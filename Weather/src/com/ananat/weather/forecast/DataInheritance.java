package com.ananat.weather.forecast;

class Base1 {
	int x = 80;
}

class Child1 extends Base1{
	int x = 50;//data hiding
}

public class DataInheritance extends Child1 {
 int x = 20;//data hiding
 void show()
 {
	 System.out.println(x);//its own data member
	 System.out.println(super.x);//parent class data member
	 System.out.println(((Base1)this).x);//data member of parent class of parent class
	 
	 
 }
	public static void main(String[] args) {
	DataInheritance d1 = new DataInheritance();
	d1.show();

	}

}
