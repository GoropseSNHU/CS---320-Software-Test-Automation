package Tasks;

import java.util.concurrent.atomic.AtomicLong;
public class Task 
{
	private final String ID;
	private String Name;
	private String Desc;
	private AtomicLong IDGeneration = new AtomicLong();
	
	public Task(String Name, String Desc) 
	{
		// sets ID
		this.ID = String.valueOf(IDGeneration.getAndIncrement());
		
		// sets Name, if Name is above 20 characters, or is null, throws exception
		if(Name == null) 
		{
			throw new IllegalArgumentException
			(
				"Name is empty."
			);
		}
		else if(Name.length() > 20)
		{
			throw new IllegalArgumentException
			(
				"Name is invalid as it exceeds 20 characters."
			);
		}
		else 
		{
			this.Name = Name;
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
	
	public String getID() 
	{
		return ID;
	}
	
	public String getName() 
	{
		return Name;
	}
	
	public String getDesc() 
	{
		return Desc;
	}
	
	public void setName(String Name) 
	{
		if(Name == null) 
		{
			throw new IllegalArgumentException
			(
				"Name is empty."
			);
		}
		else if(Name.length() > 20)
		{
			throw new IllegalArgumentException
			(
				"Name is invalid as it exceeds 20 characters."
			);
		}
		else 
		{
			this.Name = Name;
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
