package com.patterns;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 7; i++) {
			if(i<4) {
			for (int j = (7-(2*i+1))/2; j >0; j--) {
				System.out.print("* ");
			}
			for (int j = 0; j <2*i+1 ; j++) {
				System.out.print("_ ");
			}
			for (int j = (7-(2*i+1))/2; j >0; j--) {
				System.out.print("* ");
			}
			System.out.println();
			}
			else {
				for (int j = (7-((4-(i-4+2))*2+1))/2 ; j >0 ; j--) {
					System.out.print("* ");
				}
				for (int j =(4-(i-4+2))*2+1; j >0; j--) {
					System.out.print("_ ");					
				}
				for (int j = (7-((4-(i-4+2))*2+1))/2; j >0 ; j--) {
					System.out.print("* ");
				}
				System.out.println("");
			}
		}
		
	}

}
