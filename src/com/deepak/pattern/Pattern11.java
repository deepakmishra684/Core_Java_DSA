package com.deepak.pattern;

public class Pattern11 {
	public static void main(String[] args) {
		
/*  *********
	********
	*******
	******
	*****
	****
	***
	**
	*
	  */
	int  numberOfStars=10;
	 
	 for(int i=1; i<= numberOfStars ;i++){
	 
	for(int j=0; j < i; j++){
	 
	  System.out.print("*");
	 
	}
	 
	System.out.println("");
	 
	}
	 
	for(int i=numberOfStars; i>0 ;i--){
	 
	for(int j=0; j < i; j++){
	  System.out.print("*");
	}
	 
	System.out.println("");}
	 
	}

}
