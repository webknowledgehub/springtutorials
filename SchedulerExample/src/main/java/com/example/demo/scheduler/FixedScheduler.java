package com.example.demo.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FixedScheduler 
{

    private static final Logger log = LoggerFactory.getLogger(FixedScheduler.class);
	
	@Scheduled(fixedRate=15000)
	public void fixedRateScheduler() throws InterruptedException
	{
		log.info("fixedratescheduler started");
		Thread.sleep(5000);
		log.info("fixedratescheduler ended");
	}

}
