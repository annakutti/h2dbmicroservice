/**
 * 
 */
package com.sanya.boot.h2dbmicroservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Sanya_s
 *
 */
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int empId;
	
	private String empName;
	
	private String role;
	
	/**
	 * 
	 */
	public Employee() {
		super();
	}

	/**
	 * @param empName
	 * @param role
	 */
	public Employee(String empName, String role) {
		super();
		this.empName = empName;
		this.role = role;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
}
