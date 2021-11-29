package com.binarySearchAlgo;

public class InfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,23,45,67,78,99};
		int target = 99;
		System.out.println(ans(arr,target));

	}
	static int ans(int[] arr,int target) {
		
		int start = 0;
		int end = 1;
		
		while(target>arr[end]) {
			int newStart = end+1;
			int newEnd = end + (end-start+1)*2;
			start = newStart;
			end = newEnd;
		}
		
		return binarySearch(arr,target,start,end);
	}
	
	static  int binarySearch(int[] arr, int target,int start,int end) {
		// TODO Auto-generated method stub
		 
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
