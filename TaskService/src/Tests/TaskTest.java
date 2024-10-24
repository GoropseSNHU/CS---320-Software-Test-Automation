package Tests;
import Tasks.Task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class TaskTest 
{
		//These tests check if anything returned null
		@Test
		void testTaskIDNotNull() 
		{
			Task task = new Task("Name", "Desc");
			assertNotNull(task.getID(), "ID was null");
		}
		
		@Test
		void testTaskNameNotNull() 
		{
			Task task = new Task("Name", "Desc");
			System.out.println(task.getID());
			assertNotNull(task.getName(), "Name was null");
		}
		
		@Test
		void testTaskDescNotNull() 
		{ 
			Task task = new Task( "Name", "Desc");
			assertNotNull(task.getDesc(), "Desc was null");
		}
		
		//These tests check if the variables pass the requirements check
		@Test
		void testTaskIDMoreThan10() 
		{
			Task task = new Task("Name", "Desc");
			if(task.getID().length() > 10 || task.getID() == "N/A") 
			{
				fail("ID contains more than 10 characters.");
			}
		}	
		
		@Test
		void testTaskNameMoreThan20() 
		{
			Task task = new Task("Name", "Desc");
			if(task.getName().length() > 20 || task.getName() == "N/A") 
			{
				fail("Name contains more than 20 characters.");
			}
		}	
		
		@Test
		void testTaskDescDMoreThan50() 
		{
			Task task = new Task("Name", "Desc");
			if(task.getDesc().length() > 50 || task.getDesc() == "N/A") 
			{
				fail("Desc contains more than 50 characters.");
			}
		}	
}
