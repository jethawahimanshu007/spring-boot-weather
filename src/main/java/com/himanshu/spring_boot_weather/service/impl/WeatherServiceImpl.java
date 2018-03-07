package com.himanshu.spring_boot_weather.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.himanshu.spring_boot_weather.entity.Weather;
import com.himanshu.spring_boot_weather.repository.CitiesOnly;
import com.himanshu.spring_boot_weather.repository.WeatherRepository;
import com.himanshu.spring_boot_weather.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {
	private WeatherRepository repo;

	WeatherServiceImpl(WeatherRepository repo) {
		this.repo = repo;
	}


	@Override
	public Weather createWeather(Weather weather) {
		// Find if the user exists
		//Weather existingUser = repo.findByEmail(user.getEmail());
		
	/*	if (existingUser != null) {
			// throw a runtime exception which should be returned, like return 400- which
			// says Bad Request
			throw new BadRequestException("User with user email " + user.getEmail() + " already exists");
		}*/
		return repo.insert(weather);
		//return repo.createWeather(weather);
	}

	/*@Override
	public List<String> findAllCities() {
		//return repo.findDistinctWeather();
		
		return repo.findAllCities();
	}*/
	
	public Weather getLatestWeather(String city) {
		return repo.findFirstByCityOrderByTimestampDesc(city);
		//return repo.getLatestWeather(city);
	}
	public List<Weather> findByCity(String city){
		return repo.findByCity(city);
	}
}
