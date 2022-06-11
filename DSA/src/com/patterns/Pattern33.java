package com.patterns;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10; i >0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 10-(10-i); j<10; j++) {
				System.out.print(j);
			}
			System.out.print("0");
			for (int j =9; j>=i; j--) {
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}
