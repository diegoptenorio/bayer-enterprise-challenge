package com.bayer.entity;

import java.util.Date;

public class Ocurrency {

	/**
	 * Ocurrency code
	 */
	private int code;

	/**
	 * cpf
	 */
	private String cpf;

	/**
	 * disease
	 */
	private int disease;

	/**
	 * address
	 */
	private int address;

	/**
	 * is_confirmed
	 */
	private String is_confirmed;

	/**
	 * is_confirmed
	 */
	private String is_deceased;

	/**
	 * register
	 */
	private Date register;
	
	/**
	 * Default constructor
	 */
	public Ocurrency () {
	}

	/**
	 * @param code - Ocurrency code
	 * @param name - Ocurrency cpf
	 * @param disease - Ocurrency disease
	 * @param address - Ocurrency address
	 * @param is_confirmed - Ocurrency is_confirmed
	 * @param is_deceased - Ocurrency is_deceased
	 */
	public Ocurrency(
		int code,
		String cpf,
		int disease,
		int address,
		String is_confirmed,
		String is_deceased,
		Date register
	) {
		this.code = code;
		this.cpf = cpf;
		this.disease = disease;
		this.address = address;
		this.is_confirmed = is_confirmed;
		this.is_deceased = is_deceased;
		this.register = register;
	}

	/**
	 * @return Return Ocurrency code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code - Ocurrency code
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return Return cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param name - Ocurrency cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return Return disease
	 */
	public int getDisease() {
		return disease;
	}

	/**
	 * @param disease - Ocurrency disease
	 */
	public void setDisease(int disease) {
		this.disease = disease;
	}

	/**
	 * @return Return address
	 */
	public int getAddress() {
		return address;
	}

	/**
	 * @param address - Ocurrency address
	 */
	public void setAddress(int address) {
		this.address = address;
	}

	/**
	 * @return Return is_confirmed
	 */
	public String getIsConfirmed() {
		return is_confirmed;
	}

	/**
	 * @param is_confirmed - Ocurrency is_confirmed
	 */
	public void setIsConfirmed(String is_confirmed) {
		this.is_confirmed = is_confirmed;
	}

	/**
	 * @return Return is_deceased
	 */
	public String getIsDeceased() {
		return is_deceased;
	}

	/**
	 * @param is_deceased - Ocurrency is_deceased
	 */
	public void setIsDeceased(String is_deceased) {
		this.is_deceased = is_deceased;
	}

	/**
	 * @return Return register
	 */
	public Date getRegister() {
		return register;
	}

	/**
	 * @param register - Ocurrency register
	 */
	public void setRegister(Date register) {
		this.register = register;
	}

}