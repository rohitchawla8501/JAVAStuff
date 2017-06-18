package pack;

public class Marketingexecutive extends Employee {
	double tour,telephone,kilometers;

	public Marketingexecutive(int id, String name, double salary) {
		super(id, name, salary);
		
	}
	
	public void calallowance()
	{
        kilometers=15;
		tour=5*kilometers;
        telephone=1500;
	    System.out.println("in marketingexecutive");
	}


	public String toString() {
		return "Marketingexecutive [tour=" + tour + ", telephone=" + telephone
				+ ", kilometers=" + kilometers + "]";
	}

	
}
