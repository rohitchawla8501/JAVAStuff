package com.seed;

import java.util.*;
import java.util.HashSet;
public class Employee implements Comparable {
	
	public int id ;
	public String name;
	public double salary;
	public Set skillsets;

	
public Employee(int id, String name, double salary, Set skillsets) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.skillsets = skillsets;
	}

public void calallowance()
{
}

public int compareTo(Object o1)
{
Employee temp=(Employee) o1;
if(this.id>temp.id)
{
	return 123;
}
if(this.id<temp.id){
	return -123;
}

return 0;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
			+ ", skillsets=" + skillsets + "]";
}


}


