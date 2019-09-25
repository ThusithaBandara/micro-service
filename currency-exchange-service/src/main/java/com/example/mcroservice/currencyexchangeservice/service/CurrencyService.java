package com.example.mcroservice.currencyexchangeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.example.mcroservice.currencyexchangeservice.model.ExchangeValue;
import com.example.mcroservice.currencyexchangeservice.repository.CurrencyRepository;

@Component
public class CurrencyService {
	
	@Autowired
	CurrencyRepository repo;
	
	@Autowired
	Environment env;
	
	public void addCurrencyValue(ExchangeValue value) {
		repo.save(value);
	}

	public ExchangeValue find(String from, String to) {
		ExchangeValue findByFromAndTo = repo.findByFromAndTo(from,to);
		findByFromAndTo.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return findByFromAndTo;
	}

}
