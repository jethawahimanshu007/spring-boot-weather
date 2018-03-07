package com.himanshu.spring_boot_weather.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.himanshu.spring_boot_weather.entity.Weather;
import com.himanshu.spring_boot_weather.repository.CitiesOnly;


public interface WeatherService {

	public Weather createWeather(Weather weather);
//	public List<String> findAllCities();
	public Weather getLatestWeather(String city);
	public List<Weather> findByCity(String city);
}
