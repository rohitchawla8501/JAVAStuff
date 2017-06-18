package com.seed;

import java.util.Comparator;

public class Comparebysalary implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		if(e1.salary>e2.salary)
		{
			return -123344;
			
		}
		if(e1.salary<e2.salary)
		{
			return 123344;
			
		}	
	return 0;
	}

}

