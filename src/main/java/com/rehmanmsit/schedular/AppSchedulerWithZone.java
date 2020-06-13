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
public class AppSchedulerWithZone {
	
	@Scheduled(fixedRate = 2000L, zone = "GMT+5:30")
	public void cron1() {
		//If zone is specified, scheduler resolves to that specific Time Zone
		//In the above example, I have specified IST(Indian Standard Time)
		//If no time zone is included, it will use the server’s default Time zone.
		final LocalDateTime start = LocalDateTime.now();
		log.info("FixedRate with IST TimeZone() time : {}", start);
	}

}
