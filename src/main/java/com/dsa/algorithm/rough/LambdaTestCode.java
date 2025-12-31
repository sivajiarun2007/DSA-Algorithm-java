package com.dsa.algorithm.rough;

import java.util.Arrays;
import java.util.List;

public class LambdaTestCode {

	public static void main(String[] args) {

		List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

		System.out.println("Original List: " + products);

		List<String> filteredProducts = products.stream().filter(prod -> prod.length() > 5)
				.sorted((a, b) -> a.compareTo(b)).map(x -> x.toUpperCase()).toList();

		System.out.println(filteredProducts);


	}

}
