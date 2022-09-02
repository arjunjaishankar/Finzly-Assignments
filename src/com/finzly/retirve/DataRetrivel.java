package com.finzly.retirve;

import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

import com.finzly.model.CurrencyData;
import com.opencsv.CSVReader;

public class DataRetrivel {

	private HashMap<String, CurrencyData> list;

	public HashMap<String, CurrencyData> dataRetrivel() {

		list = new HashMap<>();

		CSVReader reader = null;

		try {
			reader = new CSVReader(new FileReader("src\\CurrencyPairs.csv"));
			String[] nextLine;
			reader.readNext();
			LocalDateTime date;
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyyhh:mm:ss a");
			// read one line at a time
			while ((nextLine = reader.readNext()) != null) {

				CurrencyData obj = new CurrencyData();
				obj.setCurrency1(nextLine[0]);
				obj.setCurrency2(nextLine[1]);
				obj.setSpotDays(Integer.parseInt(nextLine[2]));
				obj.setWeekDays(nextLine[3]);
				obj.setPrecision(Integer.parseInt(nextLine[4]));
				date = LocalDateTime.parse(nextLine[5], formatter);
				obj.setLastUpdatedTime(date);
				list.put(nextLine[0] + nextLine[1], obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void displayData(ArrayList<CurrencyData> list) {
		for (CurrencyData obj : list)
			System.out.println(obj);
	}

}
