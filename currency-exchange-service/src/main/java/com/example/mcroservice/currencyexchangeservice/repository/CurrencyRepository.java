package com.example.mcroservice.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mcroservice.currencyexchangeservice.model.ExchangeValue;

public interface CurrencyRepository extends JpaRepository<ExchangeValue, Integer>{

	ExchangeValue findByFromAndTo(String from, String to);

}
