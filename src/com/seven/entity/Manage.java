package com.seven.entity;
/**
 * ����Աʵ����
 * @author Administrator
 *
 */
public class Manage {
	private Integer id;
	private String username;
	private String password;
	private int sex;
	private String truename;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getTruename() {
		return truename;
	}
	public void setTruename(String truename) {
		this.truename = truename;
	}
	
	@Override
	public String toString() {
		return "Manage [id=" + id + ", username=" + username + ", password="
				+ password + ", sex=" + sex + ", truename=" + truename + "]";
	}
	
	
}
