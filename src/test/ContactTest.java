//Matthew Clockel
//05/21/2021	
//CS 320 - 21EW5
//This is the contact test class which includes JUnit tests for the contact class.


package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.java.model.Contact;

class ContactTest {

//Test contact contains all the variables.
		@Test
		void testContact() {
			Contact contact = new Contact("Id007", "Michael", "Smith", "5555555555", "125 boulder lane");
			assertTrue(contact.getContactId().equals("Id007"));
			assertTrue(contact.getFirstName().equals("Michael"));
			assertTrue(contact.getLastName().equals("Smith"));
			assertTrue(contact.getPhone().equals("5555555555"));
			assertTrue(contact.getAddress().equals("125 boulder lane"));
		}
//Test if the contact Id is greater than 10 characters.
		@Test
		void testContactIdToLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("Id000000007", "Michael", "Smith", "5555555555", "125 boulder lane");
			});
			
		}
//Test if the contact Id is null.
		@Test
		void testContactIdIsNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact(null, "Michael", "Smith", "5555555555", "125 boulder lane");
			});
		}
//Test if the first name is longer than 10 characters.
		@Test
		void testFirstNameToLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("Id007", "Bartholome", "Smith", "5555555555", "125 boulder lane");
			});
			
		}
//Test if the first name is null.
		@Test
		void testFirstNameIsNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("Id007", null, "Smith", "5555555555", "125 boulder lane");
			});
		}
//Test if the last name is longer than 10 characters.
		@Test
		void testLastNameToLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("Id007", "Michael", "Bartholomew", "5555555555", "125 boulder lane");
			});
			
		}
//Test if the last name is null.
		@Test
		void testLastNameIsNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("Id007", "Michael", null, "5555555555", "125 boulder lane");
			});
		}
//Test if the phone number is longer than 10 characters.
		@Test
		void testPhoneToLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("Id007", "Bartholomew", "Smith", "15555555555", "125 boulder lane");
			});
			
		}
//Test if the phone number is null.
		@Test
		void testPhoneIsNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("Id007", "Michael", "Smith", null, "125 boulder lane");
			});
		}
//Test if the address is greater than 30 characters.
		@Test
		void testAddressToLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("Id007", "Bartholomew", "Smith", "5555555555", "125000000777788 boulders lane blvd");
			});
			
		}
//Test if the address is null.
		@Test
		void testAddressIsNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("Id007", "Michael", "Smith", "5555555555", null);
			});
		}
}
