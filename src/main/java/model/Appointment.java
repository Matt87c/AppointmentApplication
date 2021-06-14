package main.java.model;
import java.util.Calendar;
import java.util.Date;

//Matthew Clockel
//06/4/2021
//CS 320 - 21EW5

/*Appointment class requirements:
 * The appointment object shall have a required unique appointment ID string that cannot be longer than 10 characters. 
 * The appointment ID shall not be null and shall not be updatable.
 * The appointment object shall have a required appointment Date field. 
 * The appointment Date field cannot be in the past. The appointment Date field shall not be null.
Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past.
The appointment object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
 */

public class Appointment {
	String appointmentID;
	Date appointmentDate;
	String appointmentDescription;
	

//Constructor method for the appointment class variables
	public Appointment(String appointmentID, Calendar appointmentDate, String appointmentDescription) {
		// If else statements that throw exceptions if the software does not meet the requirements. 
		//if(appointmentID != null) {
         //   throw new Illegal Argument Exception "Appointment ID is not updateable.");
		if(appointmentID == null || appointmentID.length() > 10) {
            throw new IllegalArgumentException("Appointment ID cannot be null or exceed 10 characters.");
		
		//Throw Illegal Argument Exception if appointment date is null or appointment date is before today
		} else if (appointmentDate == null || appointmentDate.before(appointmentDate)) {
			throw new IllegalArgumentException("Appointment date cannot be null or in the past.");
			
		} else if(appointmentDescription == null || appointmentDescription.length() > 50) {
				throw new IllegalArgumentException("Description cannot be null or greater than 50 characters.");
		}
	}

	
public Appointment(String appointmentID2, boolean before, String appointmentDescription2) {
		// TODO Auto-generated constructor stub
	}


	//GETTERS methods for the appointment variables
	public String getAppointmentID() {
		return appointmentID;
	}
	
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	public String getAppointmentDescription() {
		return appointmentDescription;
	}
//SETTERS methods for the appointment variables
    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }
    
    public void setAppointmentDatae(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    
    public void setAppointmenDescription(String appointmentDescription) {
        this.appointmentDescription = appointmentDescription;
       
    }
	public Object addAppointment(Integer uniqueId, Appointment addedAppointment) {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getAppointment(String string) {
		// TODO Auto-generated method stub
		return null;
	}


	public static char[] addedAppointment(Appointment addedAppointment) {
		// TODO Auto-generated method stub
		return null;
	}


	public static char[] updateAppointment(String string, Calendar appointmentDate2, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
}
