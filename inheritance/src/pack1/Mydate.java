package pack1;

public class Mydate {
	int day,month,year;

	public Mydate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean equals(Object obj)
	{
		
		Mydate temp =(Mydate) obj;
		if (this.day==temp.day&&this.year==temp.year&&this.month==temp.month)
		{ 
		
		  return (true);
		  
		}
		else
		{
			return (false);
		}
	
	
	}

}
