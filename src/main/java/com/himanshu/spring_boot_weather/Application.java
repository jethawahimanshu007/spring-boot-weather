package com.himanshu.spring_boot_weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@ComponentScan({"com.himanshu.spring_boot_weather.repository","com.himanshu.spring_boot_weather.repository.impl",
	"com.himanshu.spring_boot_weather.controller","com.himanshu.spring_boot_weather.service"})
public class Application {

	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}	
}
