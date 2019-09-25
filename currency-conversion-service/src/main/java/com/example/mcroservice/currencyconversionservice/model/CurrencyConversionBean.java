package com.example.mcroservice.currencyconversionservice.model;

public class CurrencyConversionBean {
	
	private String from;
	private String to;
	private int value;
	private int quantity;
	private int quantityValue;
	private int port;
	/**
	 * @param from
	 * @param to
	 * @param value
	 * @param quantity
	 * @param quantityValue
	 */
	
	public CurrencyConversionBean() {
		
	}
	
	public CurrencyConversionBean(String from, String to, int value, int quantity, int quantityValue,int port) {
		super();
		this.from = from;
		this.to = to;
		this.value = value;
		this.quantity = quantity;
		this.quantityValue = quantityValue;
		this.port=port;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(int quantityValue) {
		this.quantityValue = quantityValue;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

}
