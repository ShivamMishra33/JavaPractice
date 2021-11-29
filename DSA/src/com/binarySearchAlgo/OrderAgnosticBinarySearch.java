package com.binarySearchAlgo;

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,7,6,5,4,3,2,1};
		int target = 9;
		System.out.println(oabs(arr,target));

	}
	
	static int oabs(int[] arr,int target) {
		int start = 0;
		int end = arr.length -1;
		
		boolean isAscending = arr[start]<arr[end];
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			if(isAscending) {
				if(target < arr[mid]) {
					 end = mid -1;
				 }else{
					  start = mid+1;
				 }
			}else {
				if(target > arr[mid]) {
					 end = mid -1;
				 }else {
					start = mid +1;
			}
		}
	}
		return -1;

}
	}
