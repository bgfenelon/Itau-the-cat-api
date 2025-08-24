package com.bianca.the_cat_api;

import org.springframework.boot.SpringApplication;

public class TestTheCatApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(TheCatApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
