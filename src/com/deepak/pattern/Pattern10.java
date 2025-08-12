package com.deepak.pattern;

public class Pattern10 {
	public static void main(String[] args)
	  {
	/*	    9
	       989
	      98789
	     9876789
	    987656789
	   98765456789
	  9876543456789
	 987654323456789
	98765432123456789*/
		  
		int n=9;
		for(int i=1;i<=n;i++)
		{   int  c=n;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				--c;
			}
			++c;
			for(int j=2;j<=i;j++)
			{
				System.out.print(++c);
			}
			System.out.println();
		}
		
	  }
}