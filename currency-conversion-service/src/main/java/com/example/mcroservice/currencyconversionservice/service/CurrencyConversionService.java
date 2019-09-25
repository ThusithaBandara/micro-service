package com.example.mcroservice.currencyconversionservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.mcroservice.currencyconversionservice.model.CurrencyConversionBean;
import com.example.mcroservice.currencyconversionservice.proxy.CurrencyConversionProxy;

@Component
public class CurrencyConversionService {

	@Autowired
	CurrencyConversionProxy proxy;
	

	public CurrencyConversionBean getValue(String from, String to, int quantity) {
		// TODO Auto-generated method stub
		CurrencyConversionBean exchange = proxy.exchange(from, to);
		return new CurrencyConversionBean(from,to,exchange.getValue(),quantity,Math.multiplyExact(quantity, exchange.getValue()),exchange.getPort());
	}
}
