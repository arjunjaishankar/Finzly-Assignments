package com.finzly.service;

import java.util.ArrayList;
import java.util.Collections;

import com.finzly.model.CurrencyData;
import com.finzly.retirve.DataRetrivel;

public class SortLastUpdatedTime {

	public static void sortLastUpdatedTime(ArrayList<CurrencyData> list) {
		Collections.sort(list, (s1, s2) -> (s1.getLastUpdatedTime()).compareTo(s2.getLastUpdatedTime()));
		DataRetrivel.displayData(list);
	}
}
