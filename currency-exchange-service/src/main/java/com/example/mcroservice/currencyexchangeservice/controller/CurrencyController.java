package com.example.mcroservice.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mcroservice.currencyexchangeservice.model.ExchangeValue;
import com.example.mcroservice.currencyexchangeservice.service.CurrencyService;


import ch.qos.logback.classic.Logger;

@RestController
public class CurrencyController {
	
	Logger logger=(Logger) org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CurrencyService currencyService;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue exchange(@PathVariable String from,@PathVariable String to) {
		ExchangeValue find = currencyService.find(from,to);
		
		logger.info("{}",find);
		
		return find;
	}
	
	@PostMapping("/currency-exchange/add")
	public String addExchangeValue(@RequestBody ExchangeValue value) {
		currencyService.addCurrencyValue(value);
		return "Add new exchange value";
	}

}
