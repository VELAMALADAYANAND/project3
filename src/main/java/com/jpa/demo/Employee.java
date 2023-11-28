package com.jpa.demo;

import javax.persistence.*;

@Entity
@Table(name="employee_tab")
public class Employee {
	@Id
	@Column(name="emp_id")
	//@GeneratedValue(strategy =GenerationType.AUTO)
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int eid;
	
	@Column(name="emp_name",length=26)
	private String ename;
	
	@Column(name="emp_salary",precision=5,scale=2)
	private float salary;
	
	
	
	/**
	 * @param eid
	 * @param ename
	 * @param salary
	 */
	public Employee(int eid, String ename, float salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public Employee( String ename, float salary) {
		super();
		//this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
	
	
	public Employee() {
		
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}



}
