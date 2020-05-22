package com.ananat.weather.forecast;
import java.util.Scanner;
public class StaticTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main from staticTest1");
		System.out.println(StaticB.x);
		System.out.println("after static block from staticTest1");
	}

}
class StaticB {

	 static int x;
	 
	 static
	 {
		 System.out.println("static block");
		 Scanner s = new Scanner(System.in);
		 x = s.nextInt();
	 }
	 

	}
/*
 * class StaticTest1{ public static void main(String... s) {
 * System.out.println("main from staticTest1"); System.out.println(StaticB.x);
 * System.out.println("after static block from staticTest1");
 * 
 * } } class StaticTest2{ public static void main(String... s) {
 * 
 * System.out.println("main from staticTest2"); System.out.println(StaticB.x);
 * System.out.println("after static block from staticTest2");
 * 
 * } }
 */
