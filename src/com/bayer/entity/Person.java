package com.bayer.entity;

import java.util.Date;

public class Person {

	/**
	 * Person cpf
	 */
	private int cpf;

	/**
	 * First name
	 */
	private String first_name;

	/**
	 * Last name
	 */
	private String last_name;

	/**
	 * gender
	 */
	private String gender;

	/**
	 * Social class
	 */
	private String social_class;

	/**
	 * Birthday
	 */
	private Date birthday;
	
	/**
	 * Default constructor
	 */
	public Person () {
	}

	/**
	 * @param cpf - Person cpf
	 * @param first_name - Person first name
	 * @param last_name - Person last name
	 * @param gender - Person gender
	 * @param social_class - Person social class
	 * @param birthday - Person birthday
	 */
	public Person(
		int cpf,
		String first_name,
		String last_name,
		String gender,
		String social_class,
		Date birthday
	) {
		this.cpf = cpf;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.social_class = social_class;
		this.birthday = birthday;
	}

	/**
	 * @return Return Person cpf
	 */
	public int getCpf() {
		return cpf;
	}

	/**
	 * @param cpf - Person cpf
	 */
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return Return first name
	 */
	public String getFirstName() {
		return first_name;
	}

	/**
	 * @param first_name - Person first name
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
	 * @param last_name - Person last name
	 */
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * @return Return gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender - Person gender
	 */
	public void setgGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return Return social_class
	 */
	public String getSocialClass() {
		return social_class;
	}

	/**
	 * @param social_class - Person social class
	 */
	public void setSocialClass(String social_class) {
		this.social_class = social_class;
	}

	/**
	 * @return Return birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday - Person birthday
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
