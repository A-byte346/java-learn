package com.ananat.weather.forecast;

public class CopyConstruct {
	
	int x;
	int y;
	CopyConstruct(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	void show()
	{
		System.out.println(x+","+y);
		//System.out.println(y);
	}
	CopyConstruct (CopyConstruct z)
	{
		this.x = z.x;
		this.y = z.y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstruct c1 = new CopyConstruct(10, 30);
				c1.show();
		CopyConstruct c2 = new CopyConstruct(c1);
				c2.show();
	}

}
