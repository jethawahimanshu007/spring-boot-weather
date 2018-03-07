package com.himanshu.spring_boot_weather.repository;
	    
import java.util.Collection;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.himanshu.spring_boot_weather.entity.Weather;

public interface WeatherRepository extends MongoRepository<Weather, String>, WeatherRepositoryCustom{
	
	//public Weather createWeather(Weather user);
	public List<Weather> findByCity(String city);
	public List<String> findDistinctCityByCity();
	
	//getLatestWeather
	public Weather findFirstByCityOrderByTimestampDesc(String city);

}
