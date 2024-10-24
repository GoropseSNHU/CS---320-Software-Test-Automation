package Contacts;

import java.util.List;
import java.util.ArrayList;


public class ContactService 
{
	public List<Contact> list = new ArrayList<>();
	
	//Constructs new contact and adds to list.
	public void addContact(String firstNm, String lastNm, String address, String phoneNum) 
	{
		Contact contact = new Contact(firstNm, lastNm, address, phoneNum);
		list.add(contact);
	}
	
	//loops through the list to find a matching id, then removes the contact from the list.
	public void delContact(String ID) 
	{
		for(int count = 0; count < list.size(); count++) 
		{
			if(list.get(count).getID().equals(ID)) 
			{
				list.remove(count);
				break;
			}
		}
	}
	
	//loops through the list to find a matching id, then returns it.
	public Contact getContact(String ID) 
	{
		Contact contact = new Contact("", "", "", "1111111111");
		for(int count = 0; count < list.size(); count++) 
		{
			if (list.get(count).getID().equals(ID)) 
			{
				contact = list.get(count);
			}
		}
		return contact;
	}
	
	//loops through the list to find a matching id, then updates each respective String.
	public void updateFirst(String ID, String newName) 
	{
		for(int count = 0; count < list.size(); count++) 
		{
			if(list.get(count).getID().equals(ID)) 
			{
				list.get(count).setFirst(newName);;
				break;
			}
		}
	}
	
	public void updateLast(String ID, String newName) 
	{
		for(int count = 0; count < list.size(); count++) 
		{
			if(list.get(count).getID().equals(ID)) 
			{
				list.get(count).setLast(newName);;
				break;
			}
		}
	}
	
	public void updateAddress(String ID, String newName) 
	{
		for(int count = 0; count < list.size(); count++) 
		{
			if(list.get(count).getID().equals(ID)) 
			{
				list.get(count).setAddress(newName);;
				break;
			}
		}
	}
	
	public void updatePhone(String ID, String newName) 
	{
		for(int count = 0; count < list.size(); count++) 
		{
			if(list.get(count).getID().equals(ID)) 
			{
				list.get(count).setPhone(newName);;
				break;
			}
		}
	}
	
	
}
