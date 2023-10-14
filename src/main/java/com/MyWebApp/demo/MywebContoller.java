package com.MyWebApp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MywebContoller {
		@GetMapping(value="get")
		public String get() {
			return "Onnum illa close pannidunga"; 
		}


}
