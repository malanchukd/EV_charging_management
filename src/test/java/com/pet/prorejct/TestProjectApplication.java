package com.pet.prorejct;

import com.pet.project.ProjectApplication;
import org.springframework.boot.SpringApplication;

public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProjectApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
