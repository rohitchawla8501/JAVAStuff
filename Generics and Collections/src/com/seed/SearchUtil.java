package com.seed;
import java.util.*;

public class SearchUtil {

	public static void searchEmpinfo(int id,Map li) throws EmployeeRecordNotFoundException
	{
		Employee e=(Employee)li.get(id);
	    if(e==null)
	    {
	    	throw new EmployeeRecordNotFoundException(); 
	    }
	    else
	    System.out.println(e);
	}
}

