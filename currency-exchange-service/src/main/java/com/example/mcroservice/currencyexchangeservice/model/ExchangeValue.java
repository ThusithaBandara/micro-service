package com.example.mcroservice.currencyexchangeservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	private int value;
	/**
	 * @param id
	 * @param from
	 * @param to
	 * @param value
	 */
	public ExchangeValue() {
		}
	
	public ExchangeValue(int id, String from, String to, int value) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.value = value;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	

}
