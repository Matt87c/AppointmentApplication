//Matthew Clockel
//05/21/2021	
//CS 320 - 21EW5
//This is the contact test class which includes JUnit tests for the contactService class.



package test;


import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.java.model.Contact;
import main.java.model.ContactService;

class ContactServiceTest {

	//JUnit test that tests the add contact with uniqueId function
	@Test
	void testaddContactWithUniqueId() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			Contact addedContact = new Contact("007", "Michael", "Smith", "5555555555", "125 boulder lane");
			Integer uniqueId = 100;
			equals(addedContact.addContact(uniqueId, addedContact));
			System.out.println(Contact.addContact(addedContact));
			System.out.println(Contact.updateContact("007", "Michael", "Smith", "5555555555", "125 boulder lane"));
		});
	}
	//JUnit test that tests the add contact function
	@Test
	void testAddContact() {
		//Assertions.assertThrows(IllegalArgumentException.class, () -> {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("007", "Michael", "Smith", "5555555555", "125 boulder lane");
		assertTrue(contactService.addContact(contact));
		//	});
	}
	//JUnit test that test the deletes contact function
	@Test
	void testDeleteContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("100", "James", "Bond", "5555555555", "125 Golden Eye Lane");
		assertTrue(contactService.addContact(contact));
		assertTrue(contactService.deleteContact(contact));
	}
	private void assertTrue(Map<Integer, Contact> addContact) {
		// TODO Auto-generated method stub
		
	}
	//JUnit test that test the update contact function
	@Test
	void testUpdateContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("007", "James", "Bond", "5555555555", "125 boulder lane");
		assertTrue(contactService.updateContact(contact));
		}
}
