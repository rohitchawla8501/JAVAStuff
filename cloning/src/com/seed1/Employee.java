package com.seed1;

public class Employee implements Cloneable{
	
	private int id ;
	private String name;
	private double salary;
	private Mydate doj;
	public Employee(int id, String name, double salary,Mydate doj) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	    this.doj=doj;
	}
	
public void calallowance()
{
}








@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
			+ ", doj=" + doj.getDay() +" "+doj.getMonth()+" " +doj.getYear()+"]";
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public Mydate getDoj() {
	return doj;
}

public void setDoj(Mydate doj) {
	this.doj = doj;
}

public Object clone()throws CloneNotSupportedException
{
	Employee x=(Employee) super.clone();
	Mydate d=(Mydate) x.getDoj().clone();
	 x.setDoj(d);
	return x;
	
}



}


