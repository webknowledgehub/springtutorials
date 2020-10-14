package com.example.demo.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronSampleScheduler 
{
	
    private static final Logger log = LoggerFactory.getLogger(CronSampleScheduler.class);

	@Scheduled(cron="*/10 * * * * *")
	public void cronscheduler()
	{
		log.info("cron scheduler invoked");
	}

}
