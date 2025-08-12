package com.deepak.pattern;

public class Pattern3 {
public static void main(String[] args) {
	/*Result on console in this pattern
	123456789
	12345678
	1234567
	123456
	12345
	1234
	123
	12
	1*/
	

	for(int i=0;i<=9;i++)
	{
		for(int j=1;j<=9-i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
}
