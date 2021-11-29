package com.binarySearchAlgo;

import java.util.Arrays;

public class SortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] arr = {
					{1,2,3},
					{4,5,6},
					{7,8,9}
			};
			System.out.println(Arrays.toString(search(arr,6)));
	}
	///searching in the row of a particular column
	static int[] binarySearch(int[][] matrix,int row,int colstart,int colend,int target) {
		while(colstart<=colend) {
			int mid = colstart+(colend-colstart)/2;
			if(matrix[row][mid]==target) {
				return new int[]{row,mid};
			}
			if(matrix[row][mid]<target) {
				colstart = mid+1;
			}else {
				colend = mid-1;
			}
		}
		
		return new int[] {-1,-1};
	}
	
	static int[] search(int matrix[][],int target) {
		int rows = matrix.length;
		int col = matrix[0].length;
		
		if(rows==1) {
			return binarySearch(matrix, 0, 0, col-1, target);
		}
		
		
		int rowStart = 0;
		int rowEnd = rows-1;
		int midCol = col/2;
		while(rowStart<rowEnd-1) {
			int midRow = rowStart+(rowEnd-rowStart)/2;
			if(matrix[midRow][midCol]==target) {
				return  new int[] {midRow,midCol};
			}
			if(matrix[midRow][midCol]<target) {
				rowStart = midRow;
			}else {
				rowEnd = midRow;
			}
		}
		if(matrix[rowStart][midCol]==target) {
			return new int[] {rowStart,midCol};
		}
		if(matrix[rowStart + 1][midCol]==target) {
			return new int[] {rowStart + 1,midCol};
		}
		
		
		if(target<=matrix[rowStart][midCol-1]) {
			return binarySearch(matrix, rowStart, 0, midCol-1, target);
		}
		if(target>=matrix[rowStart][midCol+1] && target<= matrix[rowStart][col-1]) {
			return binarySearch(matrix, rowStart, midCol, col-1, target);
		}
		if(target<=matrix[rowStart+1 ][midCol-1]) {
			return binarySearch(matrix, rowStart+1, 0, midCol-1, target);
		}else {
			return binarySearch(matrix, rowStart+1, midCol+1, col-1, target);
		}
		
		
		
		
				
	}

}
