package com.hib.pro.SpringDemo;


import java.util.Map;

public class Student {
private int roll;
private String name;
private Map marks;
public Student() {
	super();
	System.out.println("no arg constructor in student");
	// TODO Auto-generated constructor stub
}
public Student(int roll, String name, Map marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Map getMarks() {
	return marks;
}
public void setMarks(Map marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
}

}

