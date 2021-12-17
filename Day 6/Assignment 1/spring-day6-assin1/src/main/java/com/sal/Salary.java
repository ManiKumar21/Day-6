package com.sal;

public class Salary {
	
	int salary;
	
	public int getSalary() {
		System.out.println("getSalary : " + salary);
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
		System.out.println("setting salary");
	}

	

	public Salary(int salary) {
		super();
		this.salary = salary;
		System.out.println("Salary : " + salary);
	}

	@Override
	public String toString() {
		return "Salary salary = " + salary ;
	}


	

}
