package pack3;

public class Mydate {
	int day,month,year;
     static int count;
	
    private Mydate(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	   count ++;
	}
    
    public static Mydate create()
    {
    	if(count<1)
    	{
    		Mydate d1=new Mydate(10,11,2015);
    		return d1;
    	}
    	else{
    		System.out.println("More than one object not allowed");
    		return null;
    		
    	}
    }

	
	public String toString() {
		return "Mydate [day=" + day + ", month=" + month + ", year=" + year
				+ "]";
	}
	

}
