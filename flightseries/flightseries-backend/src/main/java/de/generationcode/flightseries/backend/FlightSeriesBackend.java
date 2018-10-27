package de.generationcode.flightseries.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages= {"de.generationcode.flightseries.backend"})
public class FlightSeriesBackend {
	public static void main(String[] args) {
		SpringApplication.run(FlightSeriesBackend.class);
	}
}
