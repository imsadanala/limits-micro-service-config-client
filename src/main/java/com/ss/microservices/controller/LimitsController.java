package com.ss.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.microservices.dto.Limits;

@RestController
public class LimitsController {

	@GetMapping(value = "/limits")
	public Limits limits() {
		return new Limits(Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
}
