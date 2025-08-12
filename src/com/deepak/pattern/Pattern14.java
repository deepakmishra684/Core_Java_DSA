package com.deepak.pattern;

public class Pattern14 {
	/*1 3 5 6 7 9 11 12 13 15 17 18 19 21 23 24 25 27 29 30 */
	public static void main(String[] args) {
		int i=0;
		while(i<30)
		{ i+=1;
			if(i%2==0 && i%3!=0)
			{
				i+=1;
			}
			System.out.print(i+" ");
		}
	}
}
