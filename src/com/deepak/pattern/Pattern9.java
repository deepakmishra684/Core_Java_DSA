package com.deepak.pattern;

public class Pattern9 {
public static void main(String[] args) {
	/*Result on console in this pattern
        1
       212
      32123
     4321234
    543212345
   65432123456
  7654321234567
 876543212345678
98765432123456789*/
	
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
		for(int l=2;l<=i;l++)
		{
			System.out.print(l);
		}
		System.out.println();
	}
}
}
