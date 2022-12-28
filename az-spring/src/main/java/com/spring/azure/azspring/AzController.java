package com.spring.azure.azspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class AzController {
	
	@RequestMapping("/test")
	public String TestString()
	{
		return "Hello";
	}

}
