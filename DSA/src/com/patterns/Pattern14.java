package com.patterns;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++) {
			if(i<5) {
			for (int j = 1; j <=5-i ; j++) {
				System.out.print("_ ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
				
			}System.out.println("");
			}else {
				for (int j = i-6+1; j >0; j--) {
					System.out.print("_ ");
					
				}
				for (int j = 6-(i-6+2); j>0 ; j--) {
					System.out.print("* ");
				}
				System.out.println("");
			}
			
		}

	}

}
