package AppointmentTests;
import Appointments.Appointment;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppointmentTest 
{
	@SuppressWarnings("deprecation")
	Date date = new Date(2024, Calendar.JANUARY, 1);
	@SuppressWarnings("deprecation")
	Date oldDate = new Date(2023, Calendar.JANUARY, 1);
	//These tests check if anything returned null
	@Test
	void testAppointmentIDNotNull() 
	{
		Appointment appointment = new Appointment(date, "Desc");
		assertNotNull(appointment.getID(), "ID was null");
	}

	@Test
	void testAppointmentDescNotNull() 
	{
		Appointment appointment = new Appointment(date, "Desc");
		assertNotNull(appointment.getDesc(), "Desc was null");
	}
	
	//These tests check if the variables pass the requirements check
	@Test
	void testAppointmentIDMoreThan10() 
	{
		Appointment appointment = new Appointment(date, "Desc");
		if(appointment.getID().length() > 10 || appointment.getID() == "N/A") 
		{
			fail("ID contains more than 10 characters.");
		}
	}	
	
	@Test
	void testAppointmentDateBefore() 
	{
		Appointment appointment = new Appointment(date, "Desc");
		if(appointment.getDate().before(new Date())) 
		{
			fail("The date is not correct.");
		}
	}
	
	@Test
	void testAppointmentDescDMoreThan50() 
	{
		Appointment appointment = new Appointment(date, "Desc");
		if(appointment.getDesc().length() > 50 || appointment.getDesc() == "N/A") 
		{
			fail("Desc contains more than 50 characters.");
		}
	}	
}
