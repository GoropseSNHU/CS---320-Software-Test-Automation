package Tests;

import Tasks.TaskService;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class TaskServiceTest 
{
	//tests to make sure adding and deleting tasks work
	@Test
	void testAddTask() 
	{
		TaskService service = new TaskService();
		service.addTask("name", "desc");
		assertNotNull(service.getTask("0"), "Task was not added, or test was not added correctly");
	}
	
	@Test
	void testDelTask() 
	{
		TaskService service = new TaskService();
		service.addTask("name", "desc");
		service.delTask("0");
		assertEquals(service.list.size(), 0, "Task was not deleted.");
	}
	
	//tests to make sure updating task info works
	@Test
	void testUpdateTestName() 
	{
		TaskService service = new TaskService();
		service.addTask("name", "desc");
		service.updateName("0", "newname");
		assertEquals("newname", service.getTask("0").getName(), "Task name is not updated");
	}
	
	@Test
	void testUpdateTestDesc() 
	{
		TaskService service = new TaskService();
		service.addTask("name", "desc");
		service.updateDesc("0", "newdesc");
		assertEquals("newdesc", service.getTask("0").getDesc(), "Task desc is not updated");
	}
}
