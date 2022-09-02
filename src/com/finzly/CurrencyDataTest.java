package com.finzly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.finzly.model.CurrencyData;
import com.finzly.retirve.DataRetrivel;
import com.finzly.service.SearchCurrencyPair;
import com.finzly.service.SortCurrencyPair;
import com.finzly.service.SortLastUpdatedTime;

public class CurrencyDataTest {

	public static void main(String[] args) {

		DataRetrivel obj = new DataRetrivel();

		HashMap<String, CurrencyData> data = obj.dataRetrivel();
		ArrayList<CurrencyData> list = new ArrayList<>(data.values());
		int flag = 1;

		Scanner sc = new Scanner(System.in);
		int n;
		while (flag == 1) {
			System.out.println("Enter given number to do the listed tasks.\n" + "\tTo search Currency Pair Enter 1\n"
					+ "\tTo Sort Currency Pair Enter 2\n" + "\tTo Sort Last Updated Time Enter 3\n");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("\nEnter the Currency Pairs to search...\n" + "Enter Currency one : ");
				String cur1 = sc.next().toUpperCase();
				System.out.print("\nEnter Currency two : ");
				String cur2 = sc.next().toUpperCase();
				SearchCurrencyPair.searchPair(cur1, cur2, data);
				break;
			case 2:
				SortCurrencyPair.sortCurrencyPair(list);
				break;
			case 3:
				SortLastUpdatedTime.sortLastUpdatedTime(list);
				break;
			default:
				System.out.println("Enter above mentioned numbers to do the Tasks.");
			}
			System.out.println("\n\tTo Continue Enter  1\n" + "\tTo Abort Enter 0");
			flag = sc.nextInt();
		}
	}
}
