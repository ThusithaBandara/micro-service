package com.example.mcroservice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limitconfig")
	public LimitConfiguration lim() {
		return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}
}
