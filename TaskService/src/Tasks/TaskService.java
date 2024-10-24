package Tasks;

import java.util.List;

import java.util.ArrayList;

public class TaskService 
{
	public List<Task> list = new ArrayList<>();
	
	//loops through the list to find a matching id, then returns it.
	public Task getTask(String ID) 
	{
		Task task = new Task("", "");
		for (int count = 0; count < list.size(); count++) 
		{
			if (list.get(count).getID().equals(ID)) 
			{
				task = list.get(count);
			}
		}
		return task;
	}
	
	//Constructs new tasks and adds to list
	public void addTask(String Name, String Desc) 
	{
		Task task = new Task(Name, Desc);
		list.add(task);
	}
	
	//loops through the list to find a matching id, then removes the task from the list.
	public void delTask(String ID) 
	{
		for(int count = 0; count < list.size(); count++) 
		{
			if(list.get(count).getID().equals(ID)) 
			{
				list.remove(count);
				break;
			}
			else if (count == list.size()-1) 
			{
				System.out.println("Task could not be found.");
			}
		}
	}
	
	//loops through the list to find a matching id, then updates each respective String.
	public void updateName(String ID, String newName) 
	{
		for(int count = 0; count < list.size(); count++) 
		{
			if(list.get(count).getID().equals(ID)) 
			{
				list.get(count).setName(newName);
				break;
			}
			else if (count == list.size()-1) 
			{
				System.out.println("Task could not be found.");
			}
		}
	}
	
	public void updateDesc(String ID, String newDesc) 
	{
		for(int count = 0; count < list.size(); count++) 
		{
			if(list.get(count).getID().equals(ID)) 
			{
				list.get(count).setDesc(newDesc);;
				break;
			}
			else if (count == list.size()-1) 
			{
				System.out.println("Task could not be found.");
			}
		}
	}
}
