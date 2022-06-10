package com.bayer.entity;

public class Address {

	/**
	 * Address code
	 */
	private int code;

	/**
	 * Region
	 */
	private int region;

	/**
	 * Last name
	 */
	private int uf;

	/**
	 * gender
	 */
	private int city;
	
	/**
	 * Default constructor
	 */
	public Address () {
	}

	/**
	 * @param code - Address code
	 * @param region - Address region
	 * @param uf - Address uf
	 * @param city - Address city
	 */
	public Address(
		int code,
		int region,
		int uf,
		int city
	) {
		this.code = code;
		this.region = region;
		this.uf = uf;
		this.city = city;
	}

	/**
	 * @return Return Address code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code - Address code
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return Return region
	 */
	public int getRegion() {
		return region;
	}

	/**
	 * @param region - Address region
	 */
	public void setRegion(int region) {
		this.region = region;
	}

	/**
	 * @return Return uf
	 */
	public int getUf() {
		return uf;
	}

	/**
	 * @param uf - Address uf
	 */
	public void setUf(int uf) {
		this.uf = uf;
	}

	/**
	 * @return Return city
	 */
	public int getCity() {
		return city;
	}

	/**
	 * @param city - Address city
	 */
	public void setCity(int city) {
		this.city = city;
	}

}
