package Appointments;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Date;
public class Appointment 
{
	private final String ID;
	private Date Date;
	private String Desc;
	private AtomicLong IDGeneration = new AtomicLong();
	
	public Appointment(Date Date, String Desc) 
	{
		// sets ID
		this.ID = String.valueOf(IDGeneration.getAndIncrement());
		
		// sets Date, if Date is before previous date, or is null, throws exception
		if (Date == null) 
		{
			throw new IllegalArgumentException
			(
					"Date is empty."
			);
		}
		else if(Date.before(new Date())) 
		{
			throw new IllegalArgumentException
			(
					"Appointment is before current date."
			);
		}
		else 
		{
			this.Date = Date;
		}
		
		// sets Description, if Description is above 50 characters, or is null, throws exception
		if(Desc == null) 
		{
			throw new IllegalArgumentException
			(
				"Description is empty."
			);
		}
		else if(Desc.length() > 50)
		{
			throw new IllegalArgumentException
			(
				"Description is invalid as it exceeds 50 characters."
			);
		}
		else 
		{
			this.Desc = Desc;
		}
	}
	
	// get variable methods
	public String getID() 
	{
		return ID;
	}
	
	public Date getDate() 
	{
		return Date;
	}
	
	public String getDesc() 
	{
		return Desc;
	}
	
	// set variable methods
	
	public void setDate(Date Date) 
	{
		if (Date == null) 
		{
			throw new IllegalArgumentException
			(
					"Date is empty."
			);
		}
		else if(Date.before(new Date())) 
		{
			throw new IllegalArgumentException
			(
					"Appointment is before current date."
			);
		}
		else 
		{
			this.Date = Date;
		}
	}
	
	public void setDesc(String Desc) 
	{
		if(Desc == null) 
		{
			throw new IllegalArgumentException
			(
				"Description is empty."
			);
		}
		else if(Desc.length() > 50)
		{
			throw new IllegalArgumentException
			(
				"Description is invalid as it exceeds 50 characters."
			);
		}
		else 
		{
			this.Desc = Desc;
		}
	}
}
