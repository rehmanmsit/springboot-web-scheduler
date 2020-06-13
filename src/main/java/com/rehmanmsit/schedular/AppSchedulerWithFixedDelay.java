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
public class AppSchedulerWithFixedDelay {
	
	@Scheduled(fixedDelay = 5000L)
	public void cron1() {
		//Unlike FixedRate, FixedDelay waits until it's last invocation complete it's task.
		final LocalDateTime start = LocalDateTime.now();
		log.info("FixedDelay1() time : {}", start);
	}

	@Scheduled(fixedDelayString = "${myapp.fixedTimeWithDelay}")
	public void cron2() {
		//Same as above but here we are passing value from application properties file. 
		final LocalDateTime start = LocalDateTime.now();
		log.info("FixedDelay2() time : {}", start);
	}

}
