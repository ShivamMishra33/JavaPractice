package com.patterns;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for(int j = 0;j<5;j++) {
				if(i==0||i==4||j==0||j==4) {
					System.out.print("* ");
				}else {
					System.out.print("_ ");
				}
				
			}
			System.out.println(" ");
		}

	}

}
