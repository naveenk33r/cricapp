package jcg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main implementation class which serves two purpose in a spring boot application: Configuration and bootstrapping.
 * @author Naveen
 */
@SpringBootApplication
public class Myapplication {

	public static void main(String[] args) {
		SpringApplication.run(Myapplication.class, args);
	}
}