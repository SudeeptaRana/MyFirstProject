package com.rana.demoCompanyService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/App")
public class AppController {

	@GetMapping("/getName")
	public ResponseEntity<String> getName()
	{
		return new ResponseEntity<String>("My Name is Rahul", HttpStatus.OK);
	}
}
