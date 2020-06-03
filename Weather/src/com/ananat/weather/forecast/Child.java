package com.ananat.weather.forecast;

 class Base {
	 Base show()
	 {
		 System.out.println("base");
		 return new Base();
	 }
}
public class Child {
	
	Child show()
	{
		System.out.println("child");
		return new Child();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child();
		c1.show();
	}

}
