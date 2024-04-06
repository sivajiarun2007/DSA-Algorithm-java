package com.dsa.algorithm.hashtable;

import static com.dsa.algorithm.rough.RoughMain.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class HashTable {

	private int size = 7;
	private Node[] dataMap;

	class Node {
		String key;
		int value;
		Node next;

		Node(String key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	HashTable() {
		dataMap = new Node[size];
	}

	public void set(String key, int value) {
		int index = hash(key);
		Node newNode = new Node(key, value);
		if (dataMap[index] == null) {
			dataMap[index] = newNode;
		} else {
			Node temp = dataMap[index];
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public int get(String key) {
		int index = hash(key);
		if (dataMap[index] == null)
			return 0;
		Node temp = dataMap[index];
		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value;
			} else {
				temp = temp.next;
			}
		}

		return 0;

	}

	public List<String> keys() {
		ArrayList<String> result = new ArrayList<>();

		for (int i = 0; i < dataMap.length; i++) {
			Node temp = dataMap[i];
			while (temp != null) {
				result.add(temp.key);
				temp = temp.next;

			}
		}

		return result;

	}

	public boolean itemInCommon(int[] array1, int[] array2) {

		HashMap<Integer, Boolean> arr1 = new HashMap<>();

		for (int i = 0; i < array1.length; i++) {
			arr1.put(array1[i], true);
		}

		for (int i = 0; i < array2.length; i++) {
			if (arr1.get(array2[i]) != null)
				return true;
		}

		return false;
	}

	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> result = new ArrayList<>();
		HashMap<Integer, Integer> dupArr = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (dupArr.get(nums[i]) != null) {
				if (dupArr.get(nums[i]) == 1)
					result.add(nums[i]);
				dupArr.put(nums[i], dupArr.get(nums[i]) + 1);
			} else {
				int count = 1;
				dupArr.put(nums[i], count);
			}
		}

		return result;
	}

	public static Character firstNonRepeatingChar(String input) {
		Character result = null;
		char[] inputArr = input.toCharArray();

		HashMap<Character, Integer> inputMap = new HashMap<>();

		for (int i = 0; i < inputArr.length; i++) {
			if (inputMap.get(inputArr[i]) == null) {
				if (result == null)
					result = inputArr[i];

				inputMap.put(inputArr[i], 1);

			} else {
				if (result != null && inputArr[i] == result)
					result = null;
				inputMap.put(inputArr[i], inputMap.get(inputArr[i]) + 1);
			}
		}

		return result;
	}

	public static List<List<String>> groupAnagrams(String[] strings) {
		HashMap<Integer, List<String>> resultMap = new LinkedHashMap<>();

		for (int i = 0; i < strings.length; i++) {

			char[] inputArr = strings[i].toLowerCase().toCharArray();
			int hash = 0;
			for (int j = 0; j < inputArr.length; j++) {
				hash = hash + inputArr[j];
			}

			if (resultMap.get(hash) == null) {
				ArrayList<String> newArrList = new ArrayList<>();
				newArrList.add(strings[i]);
				resultMap.put(hash, newArrList);
			} else {
				resultMap.get(hash).add(strings[i]);
			}
		}

		return resultMap.values().stream().collect(Collectors.toList());

	}

	public static int[] twoSum(int[] input, int target) {
		int[] result = {} ;
		HashMap<Integer, Integer> inpMap = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			inpMap.put(input[i], i);
		}

		for (int i = 0; i < input.length; i++) {
			int current = input[i];
			int expectedSumVar = target - current;
			System.out.println("currentVal: "+ current + "ActualVal: " + expectedSumVar + "Target: " + target);
			if (inpMap.get(expectedSumVar) != null) {
				result = new int[2];
				result[0] = i;
				result[1] = inpMap.get(expectedSumVar);
				break;
			}

		}

		return result;

	}

}
