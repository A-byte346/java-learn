package com.ananat.weather.forecast;

public class StaticDemo {
 
	static String cname="tcs";
	String name;
	int salary;
	void get(String s1,int s2)
	{
		name=s1;
		salary=s2;
				
	}
	void show()
	{
		System.out.println(cname);
		System.out.println(name);
		System.out.println(salary);
	}
	static int add(int a,int b)
	{
		return a+b;
	}
	public static void main(String...   s) {
		StaticDemo s1 = new StaticDemo();
		System.out.println(s1);
		s1.name="lalu";
		System.out.println(s1.name);
		StaticDemo s2=s1;
		System.out.println(s2);
		s2.name="bhalu";
		System.out.println(s1.name);
		/*
		 * s1.get("lalu", 1001); s1.show(); System.out.println(cname);
		 * System.out.println(StaticDemo.cname);
		 * 
		 * int z = StaticDemo.add(10, 20); System.out.println(z);
		 * 
		 * int x = add(10, 25); System.out.println(x);
		 */
		

	}

}
