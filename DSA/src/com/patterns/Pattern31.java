package com.patterns;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 5; i >=1 ; i--) {
			for (int j = 5; j >=1; j--) {
				if(j+i==6) {
					System.out.print("* ");
				}
				else {
					System.out.print(j+" ");
				}
				
			}
			System.out.println("");
		}

	}

}
