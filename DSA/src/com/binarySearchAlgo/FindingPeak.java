package com.binarySearchAlgo;

public class FindingPeak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6,5,4,3,2};
		System.out.println(findPeak(arr));
	}

	public static int findPeak(int[] arr) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length;
		
		while(start<end) {
			int mid = start+(end-start)/2;			
			if(arr[mid]>arr[mid+1]) {
				end=mid;
			}else {
				start = mid+1;
			}
		}
		
		return arr[start];
	}
	
	

}
