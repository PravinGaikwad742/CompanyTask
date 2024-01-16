package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentTask")
public class Student {
    @Id
	private int roll_no;
	private String name;
	private String address;
	private int marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll_no, String name, String address, int marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [address=" + address + ", marks=" + marks + ", name=" + name + ", roll_no=" + roll_no + "]";
	}
	
	
	
}
