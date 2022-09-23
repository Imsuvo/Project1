package com.javabeans;

public class employee 
{
	int empId;
	String empName;
	String date_time;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDate_time() {
		return date_time;
	}
	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}
	public employee(int empId, String empName, String date_time) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.date_time = date_time;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", date_time=" + date_time + "]";
	}
	
	
	
	

}
