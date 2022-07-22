package com.example.commandlinerunner;

/**
 * @author Stephane Nicoll
 */
public class SimpleBean {

	private final String name;

	private final Class[] types;

	public SimpleBean(String name, Class[] types) {
		this.name = name;
		this.types = types;
	}

	public String getName() {
		return this.name;
	}

	public Class[] getTypes() {
		return this.types;
	}

}
