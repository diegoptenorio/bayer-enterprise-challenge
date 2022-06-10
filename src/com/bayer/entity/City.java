package com.bayer.entity;

public class City {

	/**
	 * City code
	 */
	private int code;

	/**
	 * Name
	 */
	private String name;
	
	/**
	 * Default constructor
	 */
	public City () {
	}

	/**
	 * @param code - City code
	 * @param name - City name
	 */
	public City(
		int code,
		String name
	) {
		this.code = code;
		this.name = name;
	}

	/**
	 * @return Return City code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code - City code
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
	 * @param name - City name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
