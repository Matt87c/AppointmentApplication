//Matthew Clockel
//05/21/2021	
//CS 320 - 21EW5
//This is the contact class which includes all the variables for a contact.



package main.java.model;

//Contact class
public class Contact {
	//Variables for contact
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	 //Constructor for Contact 
		public Contact(String contactId, String firstName, String lastName, String phone, String address) {
			
		// If statement for contactId variable to be null or conatcId is greater than 10 characters.
			//throws invalid input for contactId.
			if(contactId == null || contactId.length() > 10) {
	            throw new IllegalArgumentException("Invalid input");
			}
			// If statement for firstName variable to be null or is greater than 10 characters.
						//throws invalid input for contactId.
			else if(firstName == null || firstName.length() > 10) {
	        	 throw new IllegalArgumentException("Invalid input");
	         }
	      // If statement for lastName variable to be null or is greater than 10 characters.
				//throws invalid input for contactId.
			else if(lastName == null || lastName.length() > 10) {
	        	 throw new IllegalArgumentException("Invalid input");
	         }
	      // If statement for phone variable to be null or is greater than 10 characters.
				//throws invalid input for contactId.
			else if(phone == null || phone.length() != 10) {
	        	 throw new IllegalArgumentException("Invalid input");
	         }
	      // If statement for address variable to be null or is greater than 10 characters.
				//throws invalid input for contactId.
			else if(address == null || address.length() > 30) {
	        	 throw new IllegalArgumentException("Invalid input");
	         }
	        //Instance variables
	         this.contactId = contactId;
	         this.firstName = firstName;
	         this.lastName = lastName;
	         this.phone = phone;
	         this.address = address;
	         
	    //Getter and setter methods for Contact class
		}
		public String getContactId() {
	        return contactId;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }
	    public String getPhone() {
	    	return phone;
	    }
	    public String getAddress() {
	    	return address;
	    }
	    public void setContactId(String contactId) {
	        this.contactId = contactId;
	    }
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	    public void setPhone(String phone) {
	        this.phone = phone;
	    }
	    public void setAddress(String address) {
	        this.address = address;
	    }
		public static char[] addContact(Contact addedContact) {
			// TODO Auto-generated method stub
			return null;
		}
		public static char[] updateContact(String string, String string2, String string3, String string4,
				String string5) {
			// TODO Auto-generated method stub
			return null;
		}
		public Object getContact() {
			// TODO Auto-generated method stub
			return null;
		}
		public Object addContact(Integer uniqueId, Contact addedContact) {
			// TODO Auto-generated method stub
			return null;
		}
	
}
