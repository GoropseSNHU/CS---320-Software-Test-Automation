package Appointments;
import java.util.Date;
import java.util.ArrayList;

public class AppointmentService 
{
	public ArrayList<Appointment> list = new ArrayList<Appointment>();
	
	//creates new appointment with constructor
	public void addAppointment(Date Date, String Desc) 
	{
		Appointment appointment = new Appointment(Date, Desc);
		list.add(appointment);
	}
	
	//finds ID and deletes corresponding appointment from list
	public void delAppointment(String ID) 
	{
		for(int count = 0; count < list.size(); count++) 
		{
			if(list.get(count).getID().equals(ID))
			{
				list.remove(count);
				break;
			}
			if (count == list.size() - 1) 
			{
				throw new IllegalArgumentException
				(
						"Appointment could not be found"
				);
			}
		}
	}
	
	//searches and returns appointment information
	@SuppressWarnings("deprecation")
	public Appointment getAppointment(String ID) 
	{
		Appointment appointment = new Appointment(new Date(2025, 1, 1), "");
		for(int count = 0; count < list.size(); count++) 
		{

			if(list.get(count).getID().equals(ID))
			{
				list.get(count);
				break;
			}
			if (count == list.size() - 1) 
			{
				throw new IllegalArgumentException
				(
						"Appointment could not be found"
				);
			}
		}
		return appointment;
	}
}
