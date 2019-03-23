
package com.tzh.io;

public class Students {
	private String studentsId;
	private String name;
	private String sex;
	private String age;
	private String addr;
	private String tel;
	
	public Students(String studentsId, String name, String sex, String age, String addr, String tel) {
		// TODO Auto-generated constructor stub
		super();
		this.studentsId=studentsId;
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.addr=addr;
		this.tel=tel;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudentsId() {
		return studentsId;
	}
	public void setStudentsId(String studentsId) {
		this.studentsId = studentsId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Students [studentsId=" + studentsId + ", name=" + name + ", sex=" + sex + ", age=" + age + ", addr="
				+ addr + ", tel=" + tel + "]";
	}
	
	
}
