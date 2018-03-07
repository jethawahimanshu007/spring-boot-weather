package com.himanshu.spring_boot_weather.repository_impl;

import java.util.List;
import java.util.Optional;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.himanshu.spring_boot_weather.entity.Person;
import com.himanshu.spring_boot_weather.entity.Weather;
import com.himanshu.spring_boot_weather.repository.WeatherRepository;
import com.himanshu.spring_boot_weather.repository.WeatherRepositoryCustom;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;

@Repository
public class WeatherRepositoryImpl implements WeatherRepositoryCustom {

	  @Autowired
	  MongoTemplate mongoTemplate;
	/*@Override
	public List<String> findAllCities() {
		
		//Query query = new Query(Criteria.where("domain").is(domain));
		List<String> cities = Lists.newArrayList(mongoTemplate.getCollection("weather").distinct("city",String.class));
		//BasicQuery query1 = new BasicQuery("{ city:'Rolla' }");
		//Weather userTest1 = mongoTemplate.findOne(query1, Weather.class);
		return cities;
	}*/
	
	//I could do findWeatherByCityOrderByTimestampDesc but I do not have a limit operator on that and if there are so many entries
	//I do not want to fetch all of them and then select just one from it!!
	//Found it, directly wrote it!! -- findFirstByCityOrderByTimestampDesc
	/*
	  @Override
	public Weather getLatestWeather(String city) {
		Weather weather=null;
		
		Query query = new Query();
		query.addCriteria(Criteria.where("city").is(city));
		query.with(new Sort(Sort.Direction.DESC,"timestamp"));
		weather = mongoTemplate.findOne(query, Weather.class);
		
		return weather;
	}*/
	
	  /*
	@Override
	public Weather getHourAvg(String city) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Weather getDayAvg(String city) {
		// TODO Auto-generated method stub
		return null;
	}*/

/*
	public Weather createWeather(Weather weather) {
		 MongoOperations mongoOps = new MongoTemplate(new MongoClient(), "weather");
		 mongoOps.insert(weather,"weather");
		 return weather;
	}

	@Override
	public List<Weather> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Weather> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Weather> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Weather> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Weather> S insert(S arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public <S extends Weather> List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Weather> List<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Weather> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Weather arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Weather> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existsById(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Weather> findAllById(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Weather> findById(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Weather> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Weather> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Weather> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Weather> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Weather> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

*/
}
