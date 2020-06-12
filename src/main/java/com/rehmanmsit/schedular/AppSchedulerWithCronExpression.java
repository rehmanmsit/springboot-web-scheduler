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
public class AppSchedulerWithCronExpression {
	
	@Scheduled(cron = "0 0 1 ? * SUN")
	public void cron1() {
		//Runs At 01:00:00am, on every Sunday, every month
		final LocalDateTime start = LocalDateTime.now();
		log.info("cron1() time : {}", start);
	}
	
	@Scheduled(cron = "0/20 * * * * ?")
	public void cron2() {
		//Runs every 20 seconds
		final LocalDateTime start = LocalDateTime.now();
		log.info("cron2() time : {}", start);
	}

}
