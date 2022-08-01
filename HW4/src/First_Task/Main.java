package First_Task;

public class Main {

	public static void main(String[] args) {
		
		Robot r = new Robot();
		Robot cr = new CoffeRobot();
		Robot rd = new RobotDancer();
		Robot rc = new RobotCooker();
		
		r.Work();
		cr.Work();
		rd.Work();
		rc.Work();
		
		System.out.println("==============================================================================" + "\nRobot array:");
		
		Robot [] array = new Robot[4];
		array[0] = r;
		array[1] = cr;
		array[2] = rd;
		array[3] = rc;
		
		for(int i=0; i < array.length; i++) {
			array[i].Work();
		}
	}
}
	
