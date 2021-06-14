//Matthew Clockel
//05/27/2021	
//CS 320 - 21EW5
//This is the task class which includes all the variables for task.


package main.java.model;


/*Task Class Requirements
The task object shall have a required unique task ID String that cannot be longer than 10 characters. The task ID shall not be null and shall not be updatable.
The task object shall have a required name String field that cannot be longer than 20 characters. The name field shall not be null.
The task object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.*/

public class Task {
	private String taskID;
	private String taskName;
	private String taskDescription;
	
	public Task(String taskID, String taskName, String taskDescription) {
			// If statement for taskId variable to not be null or is greater than 10 characters.
				//throws invalid input for taskId.
				if(taskID == null || taskID.length() > 10) {
		            throw new IllegalArgumentException("Invalid input");
				}
				// If statement for taskName variable to not be null or is greater than 20 characters.
							//throws invalid input for task name.
				else if(taskName == null || taskName.length() > 20) {
		        	 throw new IllegalArgumentException("Invalid input");
		         }
		      // If statement for taskDescription variable to not be null or is greater than 50 characters.
					//throws invalid input for task description.
				else if(taskDescription == null || taskDescription.length() > 50) {
		        	 throw new IllegalArgumentException("Invalid input");
		         }
		//Instance variables
				this.taskID = taskID;
				this.taskName = taskName;
				this.taskDescription = taskDescription;
	}

	//Getter methods for task variables
	public String getTaskID() {
		return this.taskID;
	}
	
	public String getTaskName() {
		return this.taskName;
	}
	
	public String getTaskDescription() {
		return this.taskDescription;
	}
	
	//Setter methods for task variables
	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public Object addTask(Integer uniqueId, Task addedTask) {
		// TODO Auto-generated method stub
		return null;
	}

	public static char[] addedTask(Task addedTask) {
		// TODO Auto-generated method stub
		return null;
	}

	public static char[] updateTask(String taskID, String taskName, String taskDescription) {
		// TODO Auto-generated method stub
		return null;
	}

	public void put(Integer uniqueId, Task task) {
		// TODO Auto-generated method stub
		
	}

	public Task getTask(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
