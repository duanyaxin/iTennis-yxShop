package com.itennishy.yxShop.controller;

import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itennishy.yxShop.domain.JsonData;
import com.itennishy.yxShop.task.TaskAsync;

@RestController
public class AsyncTask {

	@Autowired
	private TaskAsync task;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("asynctask")
	public JsonData exeTask() throws InterruptedException {
		
		long begin = System.currentTimeMillis();
		task.task1();
		task.task2();
		Future<String> getask3 = task.task3();
		Future<String> getask4 = task.task4();		
		for(;;) {
			if(getask3.isDone()&&getask4.isDone()) {
				break;
			}
		}
		long end = System.currentTimeMillis();
		long totoal = end-begin;
		System.out.println("程序总执行耗时："+ totoal);
		logger.info("程序总执行耗时："+ totoal);
		return JsonData.buildSuccess(totoal);
		
	}
}
