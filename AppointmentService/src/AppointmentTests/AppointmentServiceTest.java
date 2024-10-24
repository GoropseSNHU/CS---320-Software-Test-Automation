package AppointmentTests;
import Appointments.AppointmentService;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
public class AppointmentServiceTest 
{
	@SuppressWarnings("deprecation")
	Date date = new Date(2024, 1, 1);
	//These tests are to ensure that Adding and Deleting Appointments work correctly
	@Test
	void testAddAppointment() 
	{
		AppointmentService service = new AppointmentService();
		service.addAppointment(date, "desc");
		assertNotNull(service.getAppointment("0"), "Appointment was not added.");	
	}
	
	@Test
	void testDelAppointment() 
	{
		AppointmentService service = new AppointmentService();
		service.addAppointment(date, "desc");
		service.delAppointment("0");
		assertEquals(service.list.size(), 0, "Appointment was not deleted.");
	}
}
