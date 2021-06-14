package test;

import java.util.Calendar;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.java.model.Appointment;



//Matthew Clockel
//06/4/2021
//CS 320 - 21EW5
//Requirements:
/*The appointment object shall have a required unique appointment ID string that cannot be longer than 10 characters. 
 *The appointment ID shall not be null and shall not be updatable.
 *The appointment object shall have a required appointment Date field. 
 *The appointment Date field cannot be in the past. 
 *The appointment Date field shall not be null.
 *The appointment object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
*/

class AppointmentTest {

	//Test if the Appointment ID is greater than 10 characters.
	@Test
	void testAppointmentIdToLong() {
		Calendar appointmentDate = Calendar.getInstance();
		appointmentDate.set(2021, Calendar.JUNE, 4, 12, 00);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("11111111111111", appointmentDate, "Task1 Description");
		});
		
	}
	
	//JUnit test if the Appointment ID is null.
	@Test
	void testAppointmentIdIsNull() {
		Calendar appointmentDate = Calendar.getInstance();
		appointmentDate.set(2021, Calendar.JUNE, 4, 12, 00);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, appointmentDate, "Appointment Description");
		});
	}
	
	//JUnit test if the Appointment date is in the past.
		@Test
		void addAppointmentDateIsPast() {
			// Create a Calendar object for appointment date
			Calendar appointmentDate = Calendar.getInstance();
			appointmentDate.set(2021, Calendar.JUNE, 4, 12, 00);
			new Appointment("1", appointmentDate, "New Appointment Description");
			Assertions.assertThrows(IllegalArgumentException.class, () ->{
				new Appointment("1", appointmentDate.before(appointmentDate), "New Appointment Description");
				});
			
		}
	//Test if the Appointment Description is longer than 50 characters.
	@Test
	void testAppointmentDescriptionToLong() {
		Calendar appointmentDate = Calendar.getInstance();
		appointmentDate.set(2021, Calendar.JUNE, 4, 12, 00);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1111", appointmentDate, "The Appointment Description Is Too Long Over 50 Characters long.");
		});
		
	}
	
	//Test if the Appointment Description is null.
	@Test
	void testAppointmentDescriptionIsNull() {
		Calendar appointmentDate = Calendar.getInstance();
		appointmentDate.set(2021, Calendar.JUNE, 4, 12, 00);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1111", appointmentDate, null);
		});
	}

}