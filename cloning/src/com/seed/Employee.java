package com.seed;

public class Employee implements Cloneable{
	
	int id ;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
public void calallowance()
{
}


public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

public Object clone()throws CloneNotSupportedException
{
	return super.clone();
}

}


