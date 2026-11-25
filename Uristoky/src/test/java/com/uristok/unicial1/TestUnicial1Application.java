package com.uristok.unicial1;

import org.springframework.boot.SpringApplication;

public class TestUnicial1Application {

	public static void main(String[] args) {
		SpringApplication.from(Unicial1Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
