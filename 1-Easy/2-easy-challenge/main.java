import java.util.Scanner;

class Function{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double force, mass, acceleration;

		System.out.println("What do you want to calculate: ");
		System.out.println("\t1. Force");
		System.out.println("\t2. Mass");
		System.out.println("\t3. Acceleration\n");
		int user_input = input.nextInt();

		switch (user_input){
			case 1:
				System.out.print("Enter the mass(kg): ");
				mass = input.nextDouble();
				System.out.print("Enter the acceleration(m/s^2): ");
				acceleration = input.nextDouble();
				System.out.format("The force is %f N.", mass*acceleration);
				break;
			case 2:
				System.out.print("Enter the force(N): ");
				force = input.nextDouble();
				System.out.print("Enter the acceleration(m/s^2): ");
				acceleration = input.nextDouble();
				System.out.format("The mass is %f kg.", force/acceleration);
				break;
			case 3:
				System.out.print("Enter the force(N): ");
				force = input.nextDouble();
				System.out.print("Enter the mass(kg): ");
				mass = input.nextDouble();
				System.out.format("The acceleration is %f m/s^2.", force/mass);
				break;
			default:
				System.out.println("Incorrect input!");
		}
	}
}