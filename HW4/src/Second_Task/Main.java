package Second_Task;

public class Main {
	
	public static void main(String[] args) {
		
		Animal a = new Animal("Leopard", 20, 7);
		
		System.out.println("Animal [Name = " + a.getName() +"; Speed = " + a.getSpeed() + "km/hr; Age = " + a.getAge() + "years]");
		
		a.setName("Bull");
		a.setSpeed(2);
		a.setAge(14);
		System.out.println("Animal [Name = " + a.getName() +"; Speed = " + a.getSpeed() + "km/hr; Age = " + a.getAge() + "years]");

	}
}
