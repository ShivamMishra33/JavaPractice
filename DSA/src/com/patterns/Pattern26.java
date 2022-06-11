package com.patterns;

public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 5-i-1; j >0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j<=2*i+1; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
