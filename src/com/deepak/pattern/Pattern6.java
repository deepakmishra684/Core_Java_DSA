package com.deepak.pattern;

public class Pattern6 {
	public static void main(String[] args) {
		/*Result on console in this pattern
        1
       21
      321
     4321
    54321
   654321
  7654321
 87654321
987654321
*/
	for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=9-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=i;k>=1;k--)
		{
			System.out.print(k);
		}
		System.out.println();
	}
}
}