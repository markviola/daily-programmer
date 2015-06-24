import java.util.Scanner;
import java.util.Random;

class PasswordGenerator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int num_pass, len_pass;

		System.out.print("How many passwords do you want to generate: ");
		num_pass = input.nextInt();
		System.out.print("How long do you want each password: ");
		len_pass = input.nextInt();

		String[] passwords = new String[num_pass];

		for (int i = 0; i < num_pass; i++){
			String current_pass = "";
			for (int j = 0; j < len_pass; j++){
				current_pass += (char)(generator.nextInt(96)+32);
			}
			passwords[i] = current_pass;
		}
	}
}