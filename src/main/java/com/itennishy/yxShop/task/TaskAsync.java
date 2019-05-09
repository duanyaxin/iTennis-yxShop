package com.itennishy.yxShop.task;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

@Component
@Async
public class TaskAsync {
	
	public void task1() throws InterruptedException {
		long begin = System.currentTimeMillis();
		Thread.sleep(1000L);
		long end = System.currentTimeMillis();
		System.out.println("任务1耗时："+ (end-begin));
	}
	public void task2() throws InterruptedException {
		long begin = System.currentTimeMillis();
		Thread.sleep(6000L);
		long end = System.currentTimeMillis();
		System.out.println("任务2耗时："+ (end-begin));
	}
	public Future<String> task3() throws InterruptedException {
		long begin = System.currentTimeMillis();
		Thread.sleep(3000L);
		long end = System.currentTimeMillis();
		System.out.println("任务3耗时："+ (end-begin));		
		return new AsyncResult<String>("任务3");
	}
	public Future<String> task4() throws InterruptedException {
		long begin = System.currentTimeMillis();
		Thread.sleep(5000L);
		long end = System.currentTimeMillis();
		System.out.println("任务4耗时："+ (end-begin));		
		return new AsyncResult<String>("任务4");
	}
}
