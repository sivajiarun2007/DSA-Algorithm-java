package com.dsa.algorithm.max.profit;

import java.util.Iterator;
import java.util.List;

public class TestSpace {

	public static void main(String[] args) {
		
		List<Integer> prices = List.of(4,4,6, 1,1,4,2,6);
//		List<Integer> prices = List.of(1,2,3,4,5);
//		List<Integer> prices = List.of(8,7,5,2,1);
		int maxProfit = calculateHighestProfit(prices);
		
	}

	private static  int calculateHighestProfit(List<Integer> prices) {
		
		if(prices.size() == 0 )
			return 0;
		
		int size = prices.size();
		
		
		int maxProfit =0;
		int minPrice = prices.get(0);
		int maxPrice =0;
		
		for(int i=1; i<size; i++ ) {
			maxPrice = prices.get(i);
			int profitDiff = maxPrice - minPrice;
			
			if(profitDiff> maxProfit) {
				maxProfit = profitDiff;
			}
			
			if(maxPrice < minPrice) {
				minPrice = maxPrice;
			}
			
			
		}
		System.out.println(maxProfit); //
			
			
			
		
		
		return 0;
	}

}
