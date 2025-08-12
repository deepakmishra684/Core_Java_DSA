package com.deepak.pattern;

public class Pattern7 {
public static void main(String[] args) {
	/*Result on console in this pattern
	999999999
	 88888888
	  7777777
	   666666
	    55555
	     4444
	      333
	       22
	        1*/
	
	int l=9;
	for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=i;k<=9;k++)
		{
			System.out.print(l);
		}
		--l;
		System.out.println();
	}
}
}
