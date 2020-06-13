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
public class AppSchedulerWithInitialDelay {

	@Scheduled(fixedRate = 2000L, initialDelay = 1000L)
	public void cron1() {
		//Runs At a specific time interval after an initial delay, irrespective of last invocation still executes
		final LocalDateTime start = LocalDateTime.now();
		log.info("FixedRate1() time : {}", start);
	}

	@Scheduled(fixedRateString = "${myapp.fixedTimeRate}", initialDelayString = "${myapp.fixedInitialDelay}")
	public void cron2() {
		//Same as above but here we are passing value from application properties file. 
		final LocalDateTime start = LocalDateTime.now();
		log.info("FixedRate2() time : {}", start);
	}

	@Scheduled(fixedDelay = 5000L, initialDelay = 1000L)
	public void cron3() {
		//FixedDelay waits until it's last invocation completes it's task and initalDelay helps this invocation
		//to start with a delay after application start.
		final LocalDateTime start = LocalDateTime.now();
		log.info("FixedDelay3() time : {}", start);
	}

	@Scheduled(fixedDelayString = "${myapp.fixedTimeWithDelay}", initialDelayString = "${myapp.fixedInitialDelay}")
	public void cron4() {
		//Same as above but here we are passing value from application properties file. 
		final LocalDateTime start = LocalDateTime.now();
		log.info("FixedDelay4() time : {}", start);
	}

}
