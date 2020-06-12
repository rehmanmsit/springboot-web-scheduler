package com.rehmanmsit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 *
 * @author Rehman
 *
 */

@EnableScheduling
@SpringBootApplication
public class SpringbootWebSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebSchedulerApplication.class, args);
	}

}
