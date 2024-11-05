package com.project.receiptCreator.model;
import java.util.Random;

public class Receipt {
    private String date;
    private String time;
    private String area;
    private double amount;
    private String billNo;
    private String transId;
    private String atndId;
    private String fuel = "Diesel";
    private double rate = 123.89;
    private double sale;
    private double volume;
    private int nozzleNo;
    public void generateRandomDetails() {
        Random random = new Random();
        this.billNo = String.valueOf(10000000 + random.nextInt(90000000));
        this.transId = String.valueOf(10000000 + random.nextInt(90000000));
        this.atndId = String.valueOf(10000000 + random.nextInt(90000000));
        this.sale = amount;
        this.volume = amount / rate;
        this.nozzleNo = random.nextInt(10) + 1;
    }
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getAtndId() {
		return atndId;
	}

	public void setAtndId(String atndId) {
		this.atndId = atndId;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getSale() {
		return sale;
	}

	public void setSale(double sale) {
		this.sale = sale;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public int getNozzleNo() {
		return nozzleNo;
	}

	public void setNozzleNo(int nozzleNo) {
		this.nozzleNo = nozzleNo;
	}

}

