package com.himanshu.spring_boot_weather.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.himanshu.spring_boot_weather.constants.*;
import com.himanshu.spring_boot_weather.entity.Weather;
import com.himanshu.spring_boot_weather.repository.CitiesOnly;
import com.himanshu.spring_boot_weather.service.WeatherService;

@ResponseBody
//@Controller
@RestController   //@ResponseBody and @Controller are combined in this one annotation @RestController
//I can also write ResponseBody right here, so all the methods in this class can have that type
//If you write /users right here, it means you don't need to mention it in the method's Request Mapping 
@RequestMapping(value=URI.BASE_URI)  //-- Even the / is not required before the user, so user and /user are the same things here 
@Api("Weather")   //Any annotation name starting with @Api is Swagger specific annotations for renaming
public class WeatherController {
 
	WeatherService service;   //A @service is responsible for the business logic
	WeatherController(WeatherService service){
		this.service=service;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Weather createWeather(@RequestBody Weather weather) {
		return service.createWeather(weather);
	}
	
	/*
	@RequestMapping(method=RequestMethod.GET)
	public List<String> getWeather() {
		return service.findAllCities();
	}
	*/
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String getWeather() {
		return "Haha";
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value=URI.CITY_LATEST)
	public Weather getLatestWeather(@PathVariable("city") String city) {
		return service.getLatestWeather(city);
	}
	
	/*
	@RequestMapping(method=RequestMethod.GET, value=URI.CITY_HOUR_AVG)
	public Weather getHourAvg(String city) {
		return null;
	}
	
	@RequestMapping(method=RequestMethod.GET, value=URI.CITY_DAILY_AVG)
	public Weather getDayAvg(String city) {
		return null;
	}
	*/
	@RequestMapping(method=RequestMethod.GET, value="/{city}")
	public List<Weather> findByCity(@PathVariable("city") String city) {
		return service.findByCity(city);
	}
	

}
