package Tests;
import Contacts.Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class ContactTest 
{
	//These tests check if anything returned null
	@Test
	void testContactIDNotNull() 
	{
		Contact contact = new Contact("First", "Last", "Address", "1234567890");
		assertNotNull(contact.getID(), "ID was null");
	}
	
	@Test
	void testContactFirstNameNotNull() 
	{
		Contact contact = new Contact("First", "Last", "Address", "1234567890");
		assertNotNull(contact.getFirst(), "First name was null");
	}
	
	@Test
	void testContactLastNameNotNull() 
	{ 
		Contact contact = new Contact("First", "Last", "Address", "1234567890");
		assertNotNull(contact.getLast(), "Last name was null");
	}
	
	@Test
	void testContactAddressNotNull() 
	{
		Contact contact = new Contact("First", "Last", "Address", "1234567890");
		assertNotNull(contact.getAddress(), "Address was null");
	}
	
	@Test
	void testContactPhoneNotNull() 
	{
		Contact contact = new Contact("First", "Last", "Address", "1234567890");
		assertNotNull(contact.getPhone(), "Phone was null");
	}
	
	//These tests check to see if they meet the requirements set.
	@Test
	void testContactIDMoreThan10() 
	{
		Contact contact = new Contact("First", "Last", "Address", "1234567890");
		if(contact.getID().length() > 10) 
		{
			fail("ID contains more than 10 characters.");
		}
	}
	
	@Test
	void testContactFirstMoreThan10() 
	{
		Contact contact = new Contact("First", "Last", "Address", "1234567890");
		if(contact.getFirst().length() > 10) 
		{
			fail("First contains more than 10 characters.");
		}
	}
	
	@Test
	void testContactLastMoreThan10() 
	{
		Contact contact = new Contact("First", "Last", "Address", "1234567890");
		if(contact.getLast().length() > 10) 
		{
			fail("Last contains more than 10 characters.");
		}
	}
	
	@Test
	void testContactAddressMoreThan30() 
	{
		Contact contact = new Contact("FirstName", "Last", "Address", "1234567890");
		if(contact.getAddress().length() > 30) 
		{
			fail("Address contains more than 30 characters.");
		}
	}
	
	@Test
	void testContactPhoneNot10() 
	{
		Contact contact = new Contact("FirstName", "LastName", "Address ", "1234567890");
		if(contact.getPhone().length() != 10) 
		{
			fail("Phone is not 10 characters");
		}
	}
}
