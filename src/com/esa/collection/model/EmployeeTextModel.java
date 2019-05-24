package com.esa.collection.model;

import java.util.Comparator;

public class EmployeeTextModel {
	private String id;
	private String name;
	private String entrydate;
	private String grade;
	private String salary;
	public EmployeeTextModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeTextModel(String id, String name, String entrydate, String grade, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.entrydate = entrydate;
		this.grade = grade;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEntrydate() {
		return entrydate;
	}
	public void setEntrydate(String entrydate) {
		this.entrydate = entrydate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public static Comparator<EmployeeTextModel> NameComparator = new Comparator<EmployeeTextModel>() {
		public int compare(EmployeeTextModel a, EmployeeTextModel b){
			String name1 = a.getName();
			String name2 = b.getName();
			return name1.compareTo(name2);
		}
	};
	
}
