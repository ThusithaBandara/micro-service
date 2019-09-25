package com.example.mcroservice.currencyconversionservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.mcroservice.currencyconversionservice.model.CurrencyConversionBean;

//@FeignClient(value = "currency-exchange-service",url = "localhost:8008")
@FeignClient("currency-exchange-service")
@RibbonClient("currency-exchange-service")
public interface CurrencyConversionProxy {
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean exchange(@PathVariable String from,@PathVariable String to);
	
}
