package com.dsa.algorithm.sort;

import java.util.Random;

public class QuickSortImpt {

	public static void main(String[] args) {

		int arrSize = 10;

		int[] arr = new int[arrSize];
		Random rand = new Random();

		System.out.println("---- Before Sort-----");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = rand.nextInt(10);

			System.out.println(arr[i]);
		}

		

		quickSort(arr, 0, arr.length - 1);
		
		System.out.println("---- After Sort-----");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// considering the last element as pivot
	private static void quickSort(int[] arr, int lowInx, int highInx) {

		if (lowInx >= highInx) {
			return;
		}

		int pivot = arr[highInx];
		int leftIndex = lowInx;
		int rightIndex = highInx;

		while (leftIndex < rightIndex) {

			while (arr[leftIndex] <= pivot && leftIndex < rightIndex) {
				leftIndex++;
			}

			while (arr[rightIndex] >= pivot && leftIndex < rightIndex) {
				rightIndex--;
			}
			swap(arr, leftIndex, rightIndex);

		}

		swap(arr, leftIndex, highInx);
		
		quickSort(arr, lowInx, leftIndex - 1);
		quickSort(arr, leftIndex + 1, highInx);

	}

	private static void swap(int[] arr, int leftIndex, int rightIndex) {

		int temp = arr[leftIndex];
		arr[leftIndex] = arr[rightIndex];
		arr[rightIndex] = temp;

	}

}
