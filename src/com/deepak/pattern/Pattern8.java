package com.deepak.pattern;

public class Pattern8 {
		  public static void main(String[] args)
		  { 
			/*Result on console in this pattern
			 987654321
			  87654321
			   7654321
			    654321
			     54321
			      4321
			       321
			        21
			         1
		*/
				int k = 10;
				for (int i = 1; i <= 9; i++) {
					for (int j = 1; j < i; j++) {
						System.out.print(" ");
					}
					for (int j = k - i; j >= 1; j--) {
						System.out.print(j);
					}
					System.out.println();
				}
		  }
}
