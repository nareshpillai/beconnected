package com.wps.control;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeConnectedController {

	private static HashMap<String, Double> custBalances = new HashMap<String, Double>();
	
	static{
		custBalances.put("1111", new Double(250));
		custBalances.put("2222", new Double(550));
		custBalances.put("3333", new Double(650));
	}
	@RequestMapping("/hello")
	public String sayHello(){
		return "hello";
	}
	
	@RequestMapping("/getTotalBalance/{aggregatorId}")
	public Double getTotalBalance(@PathVariable String aggregatorId){
		/*RestTemplate rest = new RestTemplate();
		rest.
		rest.postForObject("https://developer.api.yodlee.com/ysl", request, responseType, uriVariables)
		Object data = rest.getForEntity("https://developer.api.yodlee.com/ysl", Object.class);
		System.out.println()*/
		if(aggregatorId != null){
			if(custBalances.get(aggregatorId) != null){
				return custBalances.get(aggregatorId);
			}
		}
		return null;
	}
}
