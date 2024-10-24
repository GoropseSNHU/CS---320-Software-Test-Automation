package Tests;

import Contacts.ContactService;
import Contacts.Contact;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class ContactServiceTest 
{
	//Tests if the Update methods work as intended.
	@Test
	void testUpdateFirst() 
	{
		ContactService service = new ContactService();
		service.addContact("first", "last","Address", "1234567890");
		service.updateFirst("0", "john");
		assertEquals("john", service.getContact("0").getFirst(), "Firstname is not updated");
	}
	
	@Test
	void testUpdateLast() 
	{
		ContactService service = new ContactService();
		service.addContact("first", "last","Address", "1234567890");
		service.updateLast("0", "Doe");
		assertEquals("Doe", service.getContact("0").getLast(), "Lastname is not updated");
	}
	
	@Test
	void testUpdateAddress() 
	{
		ContactService service = new ContactService();
		service.addContact("first", "last","Address", "1234567890");
		service.updateAddress("0", "Apartment 6");
		assertEquals("Apartment 6", service.getContact("0").getAddress(), "Address is not updated");
	}
	
	@Test
	void testUpdatePhone() 
	{
		ContactService service = new ContactService();
		service.addContact("first", "last","Address", "1234567890");
		service.updatePhone("0", "8189111612");
		assertEquals("8189111612", service.getContact("0").getPhone(), "Firstname is not updated");
	}
	
	//Tests if the Add and Delete methods work as intended.
	@Test
	void testAddContact() 
	{
		ContactService service = new ContactService();
		service.addContact("first", "last","Address", "1234567890");
		assertNotNull(service.getContact("0"), "Add Contact did not work.");
		
	}
	
	@Test
	void testDelContact() 
	{
		ContactService service = new ContactService();
		service.addContact("first", "last","Address", "1234567890");
		service.delContact("0");
		ArrayList<Contact> emptyList = new ArrayList<Contact>();
		assertEquals(service.list, emptyList, "The contact still exists and was not deleted.");
		
	}
}
