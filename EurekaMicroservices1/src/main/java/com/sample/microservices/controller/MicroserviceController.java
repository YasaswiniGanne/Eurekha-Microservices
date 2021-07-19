package com.sample.microservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceController {

	@GetMapping(value="/getAll")
	public ResponseEntity<List<String>> getAllValues() {
		List<String> values = new ArrayList<>();
		values.add("test1");
		values.add("test2");
		return new ResponseEntity<>(values,HttpStatus.OK);
	}
}
