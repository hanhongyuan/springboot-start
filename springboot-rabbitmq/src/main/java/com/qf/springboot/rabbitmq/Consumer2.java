package com.qf.springboot.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.qf.springboot.config.AmqpConfig;

@Component
@RabbitListener(queues ="hello")
public class Consumer2 {

	@RabbitHandler
	public void process(String value) {
		System.out.println("==============consumer2 print value: " + value);
	}

}
