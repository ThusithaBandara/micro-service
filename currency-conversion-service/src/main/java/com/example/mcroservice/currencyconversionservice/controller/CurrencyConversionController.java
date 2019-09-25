package com.example.mcroservice.currencyconversionservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.mcroservice.currencyconversionservice.model.CurrencyConversionBean;
import com.example.mcroservice.currencyconversionservice.service.CurrencyConversionService;

@RestController
public class CurrencyConversionController {
	@Autowired
	CurrencyConversionService service;
	
	@GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean getCurrencyValue(@PathVariable String from,@PathVariable String to,@PathVariable int quantity) {
		
		
		return service.getValue(from,to,quantity);
	}
	
}
