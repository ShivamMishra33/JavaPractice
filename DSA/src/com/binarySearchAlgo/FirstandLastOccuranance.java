package com.binarySearchAlgo;

public class FirstandLastOccuranance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,4,4,4,5,6,7};
		int target = 4;
		System.out.println(searchRange(arr,target));

	}
	 static int[] searchRange(int[] arr, int target) {
			// TODO Auto-generated method stub
		 int[] ans = {-1,-1};
		 int start = search(arr,target,true);
		 int end = search(arr,target,false);
		 ans[0]=start;
		 ans[1]=end;
			 
			 
			 System.out.println(start);
			 System.out.println(end);
			return ans;
		}
	 
	 
	
	static int search(int[] arr ,int target,boolean findStartIndex) {
		 int ans = -1;
		 
		 
		 int start = 0;
		 int end = arr.length -1;
		 while(start<=end) {
			 int mid = start+(end-start)/2;///(end - start) to reduce the int scope
			 if(target < arr[mid]) {
				 end = mid -1;
			 }else if(target > arr[mid]) {
				 start = mid+1;
			 }else {
				 ans=mid;
				 if(findStartIndex) {
					 end=mid-1;
				 }else {
					 start=mid+1;
				 }
			 }
		 }
		 return ans;
	 }

}
