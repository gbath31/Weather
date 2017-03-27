package com.weather.channel.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
@ComponentScan
public class HomeController {

	
	public String home(){
		
		return "home";
	}
}
