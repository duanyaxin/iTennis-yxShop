package com.itennishy.yxShop.task;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskScheduled {
	
//	@Scheduled(fixedRate = 2000)
//	@Scheduled(cron = "*/2 * * * * *")
//	@Scheduled(fixedDelay = 2000)
	public void sum() {
		System.out.println(new Date());
	}
}
