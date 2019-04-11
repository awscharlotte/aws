package com.service2.service2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
@RequestMapping("/service2")	
	public String getService1()
	{
		return "called Service2";
	}

}
