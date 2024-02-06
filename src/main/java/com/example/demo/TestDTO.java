package com.example.demo;

public class TestDTO {
	String id; // ID
	String name; // 名前
	int age; // 年齢
	String mail; // メールアドレス

	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *          セットする id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *          セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *          セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail
	 *          セットする mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	public void consoleOut() {
		System.out.println("id:" + this.id);
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);
		System.out.println("mail:" + this.mail);
	}

}
