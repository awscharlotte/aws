package com.service3.service3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
@RequestMapping("/service3")	
	public String getService1()
	{
		return "called Service3";
	}

}
