package com.example.bookstore_bff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BookstoreBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreBffApplication.class, args);
	}

}
