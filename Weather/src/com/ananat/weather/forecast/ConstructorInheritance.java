package com.ananat.weather.forecast;

class Base2{
	Base2()
	{
		System.out.println("base class");
	}
}

class child2 extends Base2{
	child2()
	{
		System.out.println("child class");
	}
	child2(int x){
		System.out.println(x);
	}
}
public class ConstructorInheritance extends child2 {

	public ConstructorInheritance() {
		// TODO Auto-generated constructor stub
	super(10);
	System.out.println("main class");
	
	}
	ConstructorInheritance(int x)
	{
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorInheritance();
		new ConstructorInheritance(10);

	}

}
