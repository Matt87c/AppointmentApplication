//Matthew Clockel
//05/27/2021	
//CS 320 - 21EW5
//This is the TaskService class which will allow adding, deleting, and updating tasks.


package main.java.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


//TaskService class
	public class TaskService {

		private static TaskService reference = new TaskService();
		//private final Map<String, Task> tasks;
		//Hashtable where the key is a uniqueId and Task is the value.
		private Map<Integer, Task> tasks = new HashMap<>();
		//uniqueId variable
		private Integer uniqueId;
		//Task Service method
		public TaskService() {
			this.tasks = new HashMap<Integer, Task>();
		}

		//Create a singleton Task Service
		public static TaskService getService() {
			return reference;
		}
		//Add Task
		public Map<Integer, Task> addedTask(Task task) {
			tasks.put(uniqueId, task);
			return tasks;
		}
		//Delete Task
		public Map<Integer, Task> deleteTask(String taskID) {
			//Gets the iterator
			Iterator<Entry<Integer, Task>> itr = tasks.entrySet().iterator();
			while (itr.hasNext()) {
				Map.Entry<Integer, Task> input = (Map.Entry<Integer, Task>) itr.next();
				if (input.getValue().getTaskID() == taskID) {
					itr.remove();
				}
			}
			return tasks;
		}
		//Update Task
		public Map<Integer, Task> updateTask(String taskID, String taskName, String taskDescription) {
			Iterator<Entry<Integer, Task>> itr = tasks.entrySet().iterator();
	         
	        while(itr.hasNext()) {
	        	Map.Entry<Integer, Task> input = (Map.Entry<Integer, Task>) itr.next();
	        	if(input.getValue().getTaskID() == taskID) {
	        		input.getValue().setTaskName(taskName);
	        		input.getValue().setTaskDescription(taskDescription);
	        	}
	        }
			return tasks;
		}

		public Map<Integer, Task> deleteTask(Task task) {
			// TODO Auto-generated method stub
			return null;
		}

		public Map<Integer, Task> updateTask(Task task) {
			// TODO Auto-generated method stub
			return null;
		}

		public Object addTask(Integer uniqueId2, Task task) {
			// TODO Auto-generated method stub
			return null;
		}

		public Map<Integer, Task> addTask(Task task) {
			// TODO Auto-generated method stub
			return null;
		}

		public Object getTask(String string) {
			// TODO Auto-generated method stub
			return null;
		}
	}