package com.patterns;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i+" ");
				if(j<i) {
					System.out.print("* ");
				}
					
			}
			System.out.println("");
		}
		for (int i = 4; i>=0; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i+" ");
				if(j<i) {
					System.out.print("* ");
				}
					
			}
			System.out.println("");
		}

	}

}
