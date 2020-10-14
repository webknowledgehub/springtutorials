package com.example.demo.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FixedDelayScheduler 
{
	
    private static final Logger log = LoggerFactory.getLogger(FixedDelayScheduler.class);
    
    @Scheduled(fixedDelay=15000)
    public void fixedRateScheduler() throws InterruptedException
    {
    	log.info("fixedDelayScheduler started");
    	Thread.sleep(15000);
    	log.info("fixedDelayScheduler ended");
    }
}
