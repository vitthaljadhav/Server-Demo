package com.info.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	@RequestMapping(value = "/")
	public String sayHello() {
		return "Learn the jaytie Server And Undertrow Serevr";
	}
}
