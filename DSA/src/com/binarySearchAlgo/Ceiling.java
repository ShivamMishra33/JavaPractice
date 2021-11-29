package com.binarySearchAlgo;

public class Ceiling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int target = 9;
		System.out.println(binarySearch(arr,target));

	}

	 static  int binarySearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		 if(target>arr[arr.length-1]) {
			 return -1;
		 }
		 int start = 0;
		 int end = arr.length -1;
		 while(start<=end) {
			 int mid = start+(end-start)/2;///(end - start) to reduce the int scope
			 if(target < arr[mid]) {
				 end = mid -1;
			 }else if(target > arr[mid]) {
				 start = mid+1;
			 }else {
				 return mid;
			 }
		 }
		 
		 
		 
		return -1;
	}


}
