package com.wps.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeConnectedController {

	@RequestMapping("/hello")
	public String sayHello(){
		return "hello";
	}
}
