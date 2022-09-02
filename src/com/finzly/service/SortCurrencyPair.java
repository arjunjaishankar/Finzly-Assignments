package com.finzly.service;

import java.util.ArrayList;
import java.util.Collections;

import com.finzly.model.CurrencyData;
import com.finzly.retirve.DataRetrivel;

public class SortCurrencyPair {

	public static void sortCurrencyPair(ArrayList<CurrencyData> list) {
		Collections.sort(list,
				(s1, s2) -> (s1.getCurrency1() + s1.getCurrency2()).compareTo(s2.getCurrency1() + s2.getCurrency2()));
		DataRetrivel.displayData(list);

	}
}
