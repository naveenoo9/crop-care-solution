package com.crop_care;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Crop Care API", version = "1.0", description = "API documentation for Crop Care Solutions"))
public class CropCareSolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropCareSolutionApplication.class, args);
	}

}
