package com.bayer.entity;

public class Region {

	/**
	 * Region code
	 */
	private int code;

	/**
	 * Name
	 */
	private String name;
	
	/**
	 * Default constructor
	 */
	public Region () {
	}

	/**
	 * @param code - Region code
	 * @param name - Region name
	 */
	public Region(
		int code,
		String name
	) {
		this.code = code;
		this.name = name;
	}

	/**
	 * @return Return Region code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code - Region code
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
	 * @param name - Region name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
