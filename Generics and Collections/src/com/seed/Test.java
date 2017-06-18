package com.seed;
import java.util.*;

import com.seed.Employee;


public class Test {
public static void main(String[] args) {
	
	int i,j,k,noemp;
	Scanner sc=new Scanner(System.in);
	//1Set s =CreateSet.create();
	
	/*System.out.println("Enter no of employees");
	noemp=sc.nextInt();
	for (k=0;k<noemp;k++)
	{
		Employee a[]=new Employee[noemp];
		
	}*/
	Employee e1=new Employee(101,"rohit",500000, CreateSet.create());
	Employee e2=new Employee(102,"rahul",400000,CreateSet.create());
	Employee e3=new Employee(103,"pritam",300000,CreateSet.create());

List li=new ArrayList();
li.add(e1);
li.add(e2);
li.add(e3);




Map m=new TreeMap();
m.put(e1.id,e1.salary);
m.put(e2.id,e2.salary);
m.put(e3.id,e3.salary);

Map m2=new HashMap();
m2.put(e1.id,e1);
m2.put(e2.id,e2);
m2.put(e3.id,e3);



do{
System.out.println("Enter choice");
System.out.println("1.Printlist  2.Show report  3.Sort  4.Sortbysalary 5.Search");


int ch=sc.nextInt();

switch (ch)
{

case 1:
{
UtilityClass.printList(li);
break;
}
case 2:{
System.out.println("Report");
UtilityReport.showReport(m);
break;
}
case 3:{
System.out.println("After Sorting");
Sortutil.sort(li);
break;
}
case 4:{
System.out.println("Sort by salary");
Sortutil.sortBySalary(li);
break;
}
case 5:
{
	System.out.println("SEARCHHHHH");
	try{
	System.out.println("enter id of employee");
	  j=sc.nextInt();
		SearchUtil.searchEmpinfo(j, m2);
	}
	catch(EmployeeRecordNotFoundException f)
	{
		System.out.println("Record not found");
	}
	System.out.println(" ");	
break;
}

}
System.out.println("Do you want to continue 1= yes 0=no");
i=sc.nextInt();
}while(i!=0);

}
	
}
