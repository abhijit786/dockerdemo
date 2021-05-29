package com.example.dockerdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
@RequestMapping(value="/welcome",method = RequestMethod.GET)
@ResponseBody
private ResponseEntity<String> hello()
{
	return new ResponseEntity<String>("Hello Abhishek",HttpStatus.OK);
	
	
}

}
