package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
//Redireccionar a index cada vez que encuentro solo un /
	@RequestMapping("/")
		public String getIndexPage() {
			return "Index";
		}
}
