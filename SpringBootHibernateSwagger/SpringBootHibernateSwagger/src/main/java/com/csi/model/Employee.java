package com.csi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

//Sunil Ingole means Golya
@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue
	private int empId;
	private String empName;

	private String empEmailId;
	private String empPassword;
}
