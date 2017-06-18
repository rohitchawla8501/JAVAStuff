package pack;

public class Manager extends Employee {
 double pallowance,fallowance,oallowance;

public Manager(int id, String name, double salary) {
	super(id, name, salary);
	
}
 
public void calallowance()
{
 pallowance=0.08*salary;
 fallowance=0.13*salary;
 oallowance=0.03*salary;
 System.out.println("in manager");

}

@Override
public String toString() {
	return "Manager [pallowance=" + pallowance + ", fallowance=" + fallowance
			+ ", oallowance=" + oallowance + "]";
}

}
	
	
