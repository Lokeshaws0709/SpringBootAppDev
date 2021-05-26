package com.tcs.model;

public class Employee {

	private Integer empId;
	
	private String empNm;
	 
	private Double sal;
	
	private Address addr;

	
	
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpNm() {
		return empNm;
	}

	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNm=" + empNm + ", sal=" + sal + ", addr=" + addr + "]";
	}

}
