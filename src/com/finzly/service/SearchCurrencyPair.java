package com.finzly.service;

import java.util.HashMap;

import com.finzly.model.CurrencyData;

public class SearchCurrencyPair {

	public static void searchPair(String cur1, String cur2, HashMap<String, CurrencyData> list) {
		String currencyPair = cur1 + cur2;
		System.out.println(list.containsKey(currencyPair) ? list.get(currencyPair) : " Sorry No data...");
	}
}
