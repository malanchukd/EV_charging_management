package com.pet.prorejct;

import org.springframework.boot.SpringApplication;

public class TestProrejctApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProrejctApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
