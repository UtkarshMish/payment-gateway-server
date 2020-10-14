package com.gateway.payment.recipe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

@RequestMapping(value = "/{name}")
@GetMapping("/")
public String index(@PathVariable String name) {
	return "index";
}
}

