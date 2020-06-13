package com.rehmanmsit.schedular;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author Rehman
 *
 */

@Slf4j
@Component
public class AppSchedulerWithFixedRate {

	@Scheduled(fixedRate = 2000L)
	public void cron1() {
		//Runs At a specific time interval irrespective of last invocation still executes 
		final LocalDateTime start = LocalDateTime.now();
		log.info("FixedRate1() time : {}", start);
	}

	@Scheduled(fixedRateString = "${myapp.fixedTimeRate}")
	public void cron2() {
		//Same as above but here we are passing value from application properties file. 
		final LocalDateTime start = LocalDateTime.now();
		log.info("FixedRate2() time : {}", start);
	}

}
