package com.himanshu.spring_boot_weather.entity;

import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Document;

@Document   //Not really required but it can be used to change the name of the collection
public class Weather {

	String city, description,humidity,temperature,pressure, timestamp;
	Wind wind;
	String id;
	
	public Weather() {
		id=UUID.randomUUID().toString();
	}
	/*
	public void createWeather() {
		id=UUID.randomUUID().toString();
	}
	*/
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getPressure() {
		return pressure;
	}
	public void setPressure(String pressure) {
		this.pressure = pressure;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	@Override
	public String toString() {
		return "Weather [city=" + city + ", description=" + description + ", humidity=" + humidity + ", temperature="
				+ temperature + ", pressure=" + pressure + ", timestamp=" + timestamp + ", wind=" + wind + "]";
	}
	
}
