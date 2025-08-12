package com.deepak.designPattern;

public class Brackest {



	public static boolean testChecks(String str) {

		char[] a = str.toCharArray();
		boolean status = false;
		int couneter=a.length-1;

		for (int i = 0; i < a.length/2 ; i++) {
			if ((a[i] == '{' && a[couneter] == '}') || (a[i] == '(' && a[couneter] == ')')
					|| (a[i] == '[' && a[couneter] == ']')) {
				status = true;
				--couneter;
			} else {
				status=false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		
		String str="{[(({[{{}}]}))]}";
		String str1="{[[())]}";
		System.out.println("Output :: "+testChecks(str));

	}

}
