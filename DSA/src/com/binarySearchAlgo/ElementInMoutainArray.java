package com.binarySearchAlgo;

public class ElementInMoutainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6,5,4,3,2};
		int target = 4;
		System.out.println(findElement(arr,target));
	}

	public static int findElement(int[] arr,int target) {
		// TODO Auto-generated method stub
		int peak = findPeak(arr);
		int firstTry = oabs(arr, target,0,peak);
		if(firstTry!=-1) {
			return firstTry;
		}
		return oabs(arr, target, peak+1, arr.length-1);
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
	
	static int oabs(int[] arr,int target,int start,int end) {
		
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
