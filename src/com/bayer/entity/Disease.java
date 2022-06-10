package com.bayer.entity;

public class Disease {

	/**
	 * Disease code
	 */
	private int code;

	/**
	 * Name
	 */
	private String name;
	
	/**
	 * Default constructor
	 */
	public Disease () {
	}

	/**
	 * @param code - Disease code
	 * @param name - Disease name
	 */
	public Disease(
		int code,
		String name
	) {
		this.code = code;
		this.name = name;
	}

	/**
	 * @return Return Disease code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code - Disease code
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return Return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name - Disease name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
