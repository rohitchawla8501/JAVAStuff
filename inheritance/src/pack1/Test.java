package pack1;

public class Test {

	
	public static void main(String[] args) {
		Mydate d1=new Mydate(1,1,2013);
		Mydate d2=new Mydate(1,1,2014);
        if (d1.equals(d2))
        {
        	System.out.println("equal");
        	
        }
        else{
        	System.out.println("Not equal");
        }
	
	System.out.println(d1.hashCode());
	}
	

}
