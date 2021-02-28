package com.ss.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.microservices.configuration.Configuration;
import com.ss.microservices.dto.Limits;

@RestController
public class LimitsController {

	@Autowired
	private Configuration config;

	@GetMapping(value = "/limits")
	public Limits limits() {
		// return new Limits(Integer.MIN_VALUE, Integer.MAX_VALUE);
		return new Limits(config.getMin(), config.getMax());
	}
}
