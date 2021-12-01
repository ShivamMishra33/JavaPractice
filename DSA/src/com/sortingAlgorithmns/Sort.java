package com.sortingAlgorithmns;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,-23,56,18,4};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	 static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		 for(int i = 0;i<arr.length-1;i++) {
			 for(int j=i+1;j>0;j--) {
				 if(arr[j]<arr[j-1]) {
					 swap(arr,j,j-1);
				 }else {
					 break;
				 }
			 }
		 }
		
	}

	static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		 for(int i = 0;i<arr.length;i++) {
			 int last = arr.length - i - 1;
			 int maxIndex = getMaxIndex(arr,0,last);
			 swap(arr,maxIndex,last);
			 
		 }
		
	}
	 
	 
	 static void swap(int[] arr,int first,int second) {
		 int temp = arr[first];
		 arr[first] = arr[second];
		 arr[second] = temp;
	 }

	 static int getMaxIndex(int[] arr, int start, int last) {
		// TODO Auto-generated method stub
		 int max  = start;
		 for(int i = 0 ; i<=last;i++) {
			 if(arr[max]<arr[i]) {
				 max = i;
			 }
		 }
		return max;
	}

	static void bubblesort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			boolean flag = false;
			for(int j=1;j<arr.length-i;j++) {
				
				if(arr[j-1]>arr[j]) {
					swap(arr, j, j-1);
					flag=true;
				}
			}
			if(flag==false) {
				break;
			}
		}
	}

}
