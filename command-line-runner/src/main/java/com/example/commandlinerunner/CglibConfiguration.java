package com.example.commandlinerunner;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Stephane Nicoll
 */
@Configuration
public class CglibConfiguration {

	private static final AtomicInteger counter = new AtomicInteger();

	@Bean
	public String prefix() {
		return "Hello" + counter.getAndIncrement();
	}

	@Bean
	public String text() {
		return prefix() + " World";
	}

}