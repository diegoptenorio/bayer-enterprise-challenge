package com.bayer.entity;

import java.util.Date;

public class User {

	/**
	 * User code
	 */
	private int code;

	/**
	 * User email
	 */
	private String email;

	/**
	 * Password
	 */
	private String password;

	/**
	 * First name
	 */
	private String first_name;

	/**
	 * Last name
	 */
	private String last_name;

	/**
	 * User register date
	 */
	private Date register;
	
	/**
	 * Default constructor
	 */
	public User () {
	}

	/**
	 * @param code - user code
	 * @param email - user email
	 * @param password - user password
	 * @param first_name - user first name
	 * @param last_name - user last name
	 * @param register - user register
	 */
	public User(
		int code,
		String email,
		String password,
		String first_name,
		String last_name,
		Date register
	) {
		this.code = code;
		this.email = email;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.register = register;
	}

	/**
	 * @return Return user code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code - user code
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return Return user email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email - user email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return Return user password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password - user password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return Return first name
	 */
	public String getFirstName() {
		return first_name;
	}

	/**
	 * @param first_name - user first name
	 */
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return Return last name
	 */
	public String getLastName() {
		return last_name;
	}

	/**
	 * @param last_name - user last name
	 */
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * @return Return user date register
	 */
	public Date getRegister() {
		return register;
	}

	/**
	 * @param register - user date register
	 */
	public void setRegister(Date register) {
		this.register = register;
	}

}
