package com.test;

public class Employee {
	int employeeid;
	String empname;
	
	Employee(int employeeid, String empname)
	{
		this.employeeid = employeeid;
		this.empname = empname;
	}
	
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	/*@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return employeeid;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(this.hashCode() == ((Employee)obj).hashCode())
			return true;
		else 
			return false;
	}*/
}
