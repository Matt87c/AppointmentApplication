//Matthew Clockel
//05/27/2021
//CS 320 - 21EW5

/*Description: Task class with requirements
		task object test requirements:
		Test creating a task object
		Test if an error occurs if the task ID is too long
		Test if an error occurs if the task name is too long
		Test if an error occurs if the description is too long
		I also added to test if null*/

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.java.model.Task;

class TaskTest {
		//Test task class to create a new task that contains all the variables.
				@Test
				void testTask() {
					Task task = new Task("1111", "Task1", "Task1 Description");
					assertTrue(task.getTaskID().equals("1111"));
					assertTrue(task.getTaskName().equals("Task1"));
					assertTrue(task.getTaskDescription().equals("Task1 Description"));
				}
				
		//Test if the task Id is greater than 10 characters.
				@Test
				void testTaskIdToLong() {
					Assertions.assertThrows(IllegalArgumentException.class, () -> {
						new Task("11111111111", "Task1", "Task1 Description");
					});
					
				}
		//Test if the task Id is null.
				@Test
				void testTaskIdIsNull() {
					Assertions.assertThrows(IllegalArgumentException.class, () -> {
						new Task(null, "Task1", "Task1 Description");
					});
				}
		//Test if the task name is longer than 20 characters.
				@Test
				void testTaskNameToLong() {
					Assertions.assertThrows(IllegalArgumentException.class, () -> {
						new Task("1111", "Task1NameIsTooLongOver20", "Task1 Description");
					});
					
				}
		//Test if the task name is null.
				@Test
				void testTaskNameIsNull() {
					Assertions.assertThrows(IllegalArgumentException.class, () -> {
						new Task("1111", null, "Task1 Description");
					});
				}
		//Test if the task description is longer than 50 characters.
				@Test
				void testTaskDescriptionToLong() {
					Assertions.assertThrows(IllegalArgumentException.class, () -> {
						new Task("1111", "Task1", "Task1 Description is longer than 50 characters.  Description can only be 50 characters long.");
					});
					
				}
		//Test if the task description is null.
				@Test
				void testTaskDescriptionIsNull() {
					Assertions.assertThrows(IllegalArgumentException.class, () -> {
						new Task("1111", "Task1", null);
					});
				}
		}


