package First_Task;

public class Robot {
	
	private String name;
	private String task; 

	Robot (String name, String task) {
		this.name = name;
		this.task = task;
	}
	Robot () {
		this.name = "Robot";
		this.task = "I just work";
	}
	
	public void Work() {
		System.out.println("I am " + this.name + " - " + this.task);
	}
	
	public String getName(){
		return name;
	}
	public String getTask(){
		return task;
	}
}
