package com.patterns;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 5-i-1; j >0; j--) {
				System.out.print(" ");
			}
			for (int j = 2*i+1; j >0; j--) {
				System.out.print("1");
			}
			System.out.println("");
		}
	}

}
