package com.example.mcroservice.currencyconversionservice.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.mcroservice.currencyconversionservice.model.CurrencyConversionBean;
import com.example.mcroservice.currencyconversionservice.service.CurrencyConversionService;

import ch.qos.logback.classic.Logger;

@RestController
public class CurrencyConversionController {
	
	Logger logger=(Logger) LoggerFactory.getLogger(this.getClass());
	@Autowired
	CurrencyConversionService service;
	
	@GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean getCurrencyValue(@PathVariable String from,@PathVariable String to,@PathVariable int quantity) {
		CurrencyConversionBean value = service.getValue(from,to,quantity);
		logger.info("{}",value);
		return value;
	}
	
}
