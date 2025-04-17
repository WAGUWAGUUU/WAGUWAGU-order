package com.example.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.kafka.support.converter.RecordMessageConverter;

import java.util.TimeZone;


@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+9:00"));
	}

	@Bean
	public RecordMessageConverter converter(){
		return new JsonMessageConverter();
	}
}
