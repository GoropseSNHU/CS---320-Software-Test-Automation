/* Aidan Gorospe
CS 320
 *
  */

package Contacts;
import java.util.concurrent.atomic.AtomicLong;
public class Contact
{
	private AtomicLong IDGeneration = new AtomicLong();
	private final String ID;
	private String firstNm;
	private String lastNm;
	private String address;
	private String phoneNum;
	
	// Constructor
	public Contact(String firstNm, String lastNm, String address, String phoneNum) 
	{
		// sets ID, if ID is above 10 characters, prints N/A
		this.ID = String.valueOf(IDGeneration.getAndIncrement());
		//Sets the first name, if name is above 10 characters, prints N/A
		if(firstNm == null) 
		{
			throw new IllegalArgumentException
			(
				"Name is empty."
			);
		}
		else if(firstNm.length() > 10) 
		{
			throw new IllegalArgumentException
			(
				"Name is over 10 characters."
			);
		}
		else 
		{
			this.firstNm = firstNm;
		}
		//Sets the last name, if name is above 10 characters, prints N/A
		if(lastNm == null) 
		{
			throw new IllegalArgumentException
			(
				"Name is empty."
			);
		}
		else if(lastNm.length() > 10 ) 
		{
			throw new IllegalArgumentException
			(
				"Name is over 10 characters."
			);
		}
		else 
		{
			this.lastNm = lastNm;
		}
		//Sets the address, if length is over 30, prints N/A
		if(address == null) 
		{
			throw new IllegalArgumentException
			(
				"Address is empty."
			);
		}
		else if(address.length() > 30) 
		{
			throw new IllegalArgumentException
			(
				"Address is over 30 characters."
			);
		}
		else 
		{
			this.address = address;
		}
		//Sets the phone number, if number is not 10, prints N/A
		if(phoneNum == null) 
		{
			throw new IllegalArgumentException
			(
				"Phone is empty."
			);
		}
		else if(phoneNum.length() != 10)
		{
			throw new IllegalArgumentException
			(
				"Phone is not 10 characters."
			);
		}
		else 
		{
			this.phoneNum = phoneNum;
		}
	}
	
	// Set Methods
	public void setFirst(String firstNm) 
	{
		if(firstNm == null) 
		{
			throw new IllegalArgumentException
			(
				"Name is empty."
			);
		}
		else if(firstNm.length() > 10) 
		{
			throw new IllegalArgumentException
			(
				"Name is over 10 characters."
			);
		}
		else 
		{
			this.firstNm = firstNm;
		}
	}
	
	public void setLast(String lastNm) 
	{
		if(lastNm == null) 
		{
			throw new IllegalArgumentException
			(
				"Name is empty."
			);
		}
		else if(lastNm.length() > 10 ) 
		{
			throw new IllegalArgumentException
			(
				"Name is over 10 characters."
			);
		}
		else 
		{
			this.lastNm = lastNm;
		}
	}
	
	public void setAddress(String address) 
	{
		if(address == null) 
		{
			throw new IllegalArgumentException
			(
				"Address is empty."
			);
		}
		else if(address.length() > 30) 
		{
			throw new IllegalArgumentException
			(
				"Address is over 30 characters."
			);
		}
		else 
		{
			this.address = address;
		}
	}
	
	public void setPhone(String phoneNum) 
	{
		if(phoneNum == null) 
		{
			throw new IllegalArgumentException
			(
				"Phone is empty."
			);
		}
		else if(phoneNum.length() != 10)
		{
			throw new IllegalArgumentException
			(
				"Phone is not 10 characters."
			);
		}
		else 
		{
			this.phoneNum = phoneNum;
		}
	}
	
	// Get Methods
	public String getID() 
	{
		return ID;
	}
	
	public String getFirst() 
	{
		return firstNm;
	}
	
	public String getLast() 
	{
		return lastNm;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public String getPhone() 
	{
		return phoneNum;
	}
}
