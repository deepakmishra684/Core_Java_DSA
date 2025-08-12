package com.deepak.pattern;

public class Pattern12 {
	public static void main(String[] args) {
		  
		 /*  1 2 3 4 5 6 7 8 
			  1 2 3 4 5 6 7 
			   1 2 3 4 5 6 
			    1 2 3 4 5 
			     1 2 3 4 
			      1 2 3 
			       1 2 
			        1 */
			
			for(int i=0;i<=8;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=8-i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			 
	}
}
