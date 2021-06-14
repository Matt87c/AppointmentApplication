//Matthew Clockel
//05/27/2021	
//CS 320 - 21EW5
//This is the Task service test class which includes JUnit tests for the taskService class.

package test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import main.java.model.Task;
import main.java.model.TaskService;

/*Task service tests:
Test adding a single task
Test adding multiple tasks
Test if an error occurs when adding a task with a duplicate ID
Test adding and getting a task back from the service
Test updating a task
Test deleting a task*/

class TaskServiceTest {

	//JUnit test that tests the add task with uniqueId function
	@Test
	@DisplayName("Test to add task with unique ID")
	@Order(1)
	void testAddTaskWithUniqueId() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			Task addedTask = new Task("111", "New Task", "New Task Description");
			Integer uniqueId = 1000;
			equals(addedTask.addTask(uniqueId, addedTask));
			System.out.println(Task.addedTask(addedTask));
			System.out.println(Task.updateTask("111", "New Task", "New Task Description"));
			assertNotNull(addedTask.getTask("1"), "Task was not added correctly.");
		});
	}
	
	//JUnit test that tests the add a single task function
	@Test
	@DisplayName("Test to add a single task")
	@Order(2)
	void testAddTask() {
		TaskService taskService = new TaskService();
		Task task = new Task("111", "New Task", "New Task Description");
		assertTrue(taskService.addTask(task));
		assertNull(taskService.getTask("2"), "Task was not added correctly.");
	}
	
	//JUnit test that tests the add multiple task function
	@Test
	@DisplayName("Test to add multiple tasks")
	@Order(3)
	void testAddMultipleTask() {
		TaskService taskService = new TaskService();
		Task task1 = new Task("111", "New Task1", "New Task Description1");
		Task task2 = new Task("222", "New Task2", "New Task Description2");
		assertTrue(taskService.addTask(task1));
		assertTrue(taskService.addedTask(task2));
		assertNull(task1.getTask("3"), "Task1 was not added correctly.");
		assertNull(task2.getTask("4"), "Task2 was not added correctly.");
	}
	
	//JUnit test that test the deletes task function
	@Test
	@DisplayName("Test to delete task")
	@Order(4)
	void testDeleteTask() {
		TaskService taskService = new TaskService();
		Task task = new Task("100", "New Task1", "New Task Description1");
		assertTrue(taskService.addTask(task));
		assertTrue(taskService.deleteTask(task));
	}
	
	private void assertTrue(Map<Integer, Task> addTask) {
		// TODO Auto-generated method stub
		
	}
	
	//JUnit test that test the update task function
	@Test
	@DisplayName("Test to update task")
	@Order(5)
	void testUpdateTask() {
		TaskService taskService = new TaskService();
		Task task = new Task("101", "Task Updated", "New Task Updated");
		assertTrue(taskService.updateTask(task));
		}
}
