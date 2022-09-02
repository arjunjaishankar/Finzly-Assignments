package com.finzly.model;

import java.time.LocalDateTime;

public class CurrencyData {

	private String currency1;
	private String currency2;
	private int spotDays;
	private String weekDays;
	private int Precision;
	private LocalDateTime lastUpdatedTime;

	public CurrencyData(String currency1, String currency2, int spotDays, String weekDays, int precision,
			LocalDateTime lastUpdatedTime) {
		this.currency1 = currency1;
		this.currency2 = currency2;
		this.spotDays = spotDays;
		this.weekDays = weekDays;
		Precision = precision;
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public CurrencyData() {
		// XXX Auto-generated constructor stub
	}

	public String getCurrency1() {
		return currency1;
	}

	public void setCurrency1(String currency1) {
		this.currency1 = currency1;
	}

	public String getCurrency2() {
		return currency2;
	}

	public void setCurrency2(String currency2) {
		this.currency2 = currency2;
	}

	public int getSpotDays() {
		return spotDays;
	}

	public void setSpotDays(int spotDays) {
		this.spotDays = spotDays;
	}

	public String getWeekDays() {
		return weekDays;
	}

	public void setWeekDays(String weekDays) {
		this.weekDays = weekDays;
	}

	public int getPrecision() {
		return Precision;
	}

	public void setPrecision(int precision) {
		Precision = precision;
	}

	public LocalDateTime getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(LocalDateTime lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	@Override
	public String toString() {
		return "CurrencyData [currency1=" + currency1 + ", currency2=" + currency2 + ", spotDays=" + spotDays
				+ ", weekDays=" + weekDays + ", Precision=" + Precision + ", lastUpdatedTime=" + lastUpdatedTime + "]";
	}

}
