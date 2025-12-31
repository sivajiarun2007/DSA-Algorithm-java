package com.dsa.algorithm.sort;

import java.util.Random;

public class MergeSortImpl {

	public static void main(String[] args) {
		int[] arr = new int[1_000];
		 Random rand = new Random();
		 
		 System.out.println("---- Before Sort-----");
		
		for (int i=0; i<arr.length; i++) {
			
			arr[i] = rand.nextInt(1_000);
			
			System.out.println(arr[i]);
		}
		
		System.out.println("---- After Sort-----");
		
		mergeSort(arr);
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void mergeSort(int[] arr) {
		
		if(arr.length <2) {
			return;
		}
		// assuming 1  3  5 
		int midIndex = arr.length / 2;
		
		var leftArr = new int[midIndex];
		var rightArr = new int[arr.length - midIndex];
		
		for (int i = midIndex; i < arr.length; i++) {
			rightArr[ i - midIndex] = arr[i];
		}
		
		for (int i = 0; i < leftArr.length; i++) {
			leftArr[i] = arr[i];
		}
		
		mergeSort(leftArr);
		mergeSort(rightArr);
		
		merge(arr,leftArr, rightArr);
		
	}

	private static void merge(int[] arr,int[] leftArr, int[] rightArr) {
		
		int i =0 , k = 0, j = 0;
		
		while(i< leftArr.length && j < rightArr.length) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i<leftArr.length) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		
		while(j<rightArr.length) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}


}
