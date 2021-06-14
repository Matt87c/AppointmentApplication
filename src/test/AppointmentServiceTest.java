package test;

//Matthew Clockel
//06/4/2021
//CS 320 - 21EW5
//AppointmentServiceTest Requirements:
/*The appointment service shall be able to add appointments with a unique appointment ID.
  The appointment service shall be able to delete appointments per appointment ID.*/

import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;
import java.util.Calendar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import main.java.model.Appointment;
import main.java.model.AppointmentService;


class AppointmentServiceTest {
	
	//JUnit test that tests the add appointment with uniqueId function
		@Test
		@DisplayName("Test to add appointment with unique ID")
		@Order(1)
		void testAddAppointmentWithUniqueId() {
			Calendar appointmentDate = Calendar.getInstance();
			appointmentDate.set(2021, Calendar.JUNE, 4, 12, 00);
			Assertions.assertThrows(NullPointerException.class, () -> {
				Appointment addedAppointment = new Appointment("111", appointmentDate, "Appointment Description");
				Integer uniqueId = 100;
				equals(addedAppointment.addAppointment(uniqueId, addedAppointment));
				System.out.println(Appointment.addedAppointment(addedAppointment));
				System.out.println(Appointment.updateAppointment("111", appointmentDate, "New Appointment Description"));
				assertNotNull(addedAppointment.getAppointment("1"), "Appointment was not added correctly.");
			});
		}
		
		//JUnit test that tests the add multiple appointments
		@Test
		@DisplayName("Test to add multiple appointments")
		@Order(2)
		void testAddMultipleAppointments() {
			Calendar appointmentDate = Calendar.getInstance();
			appointmentDate.set(2021, Calendar.JUNE, 4, 12, 00);
			AppointmentService appointmentService = new AppointmentService();
			Appointment appointment1 = new Appointment("001", appointmentDate, "New Appointment Description1");
			Appointment appointment2 = new Appointment("002", appointmentDate, "New Appointment Description2");
			assertTrue(appointmentService.addAppointment(appointment1));
			assertTrue(appointmentService.addAppointment(appointment2));
			assertNull(appointment1.getAppointment("3"), "Appointment1 was not added correctly.");
			assertNull(appointment2.getAppointment("4"), "Appointment2 was not added correctly.");
		}
		
		private void assertTrue(Map<Integer, Appointment> addAppointment) {
			// TODO Auto-generated method stub
		}

		//JUnit test that test the deletes appointment function
		@Test
		@DisplayName("Test to delete appointment")
		@Order(3)
		void testDeleteAppointment() {
			Calendar appointmentDate = Calendar.getInstance();
			appointmentDate.set(2021, Calendar.JUNE, 4, 12, 00);
			AppointmentService appointmentService = new AppointmentService();
			Appointment appointment = new Appointment("100", appointmentDate, "New Appointment Description1");
			assertTrue(appointmentService.addAppointment(appointment));
			assertTrue(appointmentService.deleteAppointment(appointment));
		}
		
		
		
		
}