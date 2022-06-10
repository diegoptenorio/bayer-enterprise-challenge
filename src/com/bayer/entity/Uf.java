package com.bayer.entity;

public class Uf {

	/**
	 * Uf code
	 */
	private int code;

	/**
	 * Name
	 */
	private String name;
	
	/**
	 * Default constructor
	 */
	public Uf () {
	}

	/**
	 * @param code - Uf code
	 * @param name - Uf name
	 */
	public Uf(
		int code,
		String name
	) {
		this.code = code;
		this.name = name;
	}

	/**
	 * @return Return Uf code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code - Uf code
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
	 * @param name - Uf name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
