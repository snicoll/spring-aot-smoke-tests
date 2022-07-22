package com.example.commandlinerunner;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component
public class CLR implements CommandLineRunner {

	private static final Log logger = LogFactory.getLog(SpringApplication.class);

	private final SimpleBean simpleBean;

	public CLR(SimpleBean simpleBean) {
		this.simpleBean = simpleBean;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("commandlinerunner running!");
		System.out.println("Simple Bean with name " + this.simpleBean.getName() + " and types "
				+ Arrays.toString(this.simpleBean.getTypes()));
		logger.trace("TRACE log message");
		logger.debug("DEBUG log message");
		logger.info("INFO log message");
		logger.warn("WARNING log message");
		logger.error("ERROR log message");
	}

}
