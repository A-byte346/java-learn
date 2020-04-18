package com.ananat.weather.forecast;

public class Exbuffer implements Runnable {
	
	String str = "Anant";
	StringBuilder sb = new StringBuilder(str);

	public static void main(String[] args) {
		
		Exbuffer buffer = new Exbuffer();
		Thread t1 = new Thread(buffer);
		//Thread t2 = new Thread(buffer);
		Thread t3 = new Thread(buffer);
		t1.start();
		t3.start();
		
	}
	public void run() {
		abc();
		def();
		System.out.println(sb);
		
	}
	public  void abc()
	{
		for(int i=0;i<2;i++)
		{
			try {
				Thread.sleep(500);
				sb.append("jain");
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		//System.out.println(sb);
		
	}
	public void def()
	{
		for(int i=0;i<2;i++)
		{
			try {
				Thread.sleep(500);
				sb.append("Anant");
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			//System.out.println(sb);
			
		}
	}

}
