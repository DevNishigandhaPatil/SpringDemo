package com.hib.pro.SpringDemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee{

	private int empid;
	private String name;
	private String departmentname;
	private int dob;
	private Address addr;

	public Employee() {
		super();
		System.out.println("constructor called");
	}

	public Employee(int empid, String name, String departmentname, int dob, Address addr) {
		super();
		System.out.println("parameterized constructor called");

		this.empid = empid;
		this.name = name;
		this.departmentname = departmentname;
		this.dob = dob;
		this.addr = addr;
	}
	

	public Employee(Address addr) {
		super();
		System.out.println("Employee Constructor of Address parameter ");
		this.addr = addr;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		System.out.println("departname setter called");
		this.departmentname = departmentname;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		System.out.println("dob setter called");
		this.dob = dob;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		System.out.println("id setter called");
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name setter called");
		this.name = name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		System.out.println(" address setter called");
		this.addr = addr;
	}
    @PostConstruct
	public void init() {
		System.out.println("init invoked");
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", departmentname=" + departmentname + ", dob=" + dob
				+ ", addr=" + addr + "]";
	}

		

}
