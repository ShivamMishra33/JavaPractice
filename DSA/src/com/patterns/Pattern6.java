package com.patterns;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <=5; i++) {
			for(int j = 1;j<=2*i;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<=5-i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
