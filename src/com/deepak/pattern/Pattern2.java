package com.deepak.pattern;

public class Pattern2 {
public static void main(String[] args) {
	/*Result in console in this pattern
	1
	12
	123
	1234
	12345
	123456
	1234567
	12345678
	123456789*/
	for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
}
