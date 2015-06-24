import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;


class PasswordProtected {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String file_name = "login_credentials.txt";
		String user_try, pass_try, user_real = "", pass_real = "";
		int num_attempts = 0;
		boolean valid_credentials = false;

        try {
            FileReader fileReader = new FileReader(file_name);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //Assuming only two lines to read, username followed by password
            user_real = bufferedReader.readLine();
            pass_real = bufferedReader.readLine();

            bufferedReader.close();            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                file_name + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + file_name + "'");
        }

		while (num_attempts < 3 && !valid_credentials){
			System.out.print("Enter your username: ");
			user_try = input.nextLine();
			System.out.print("Enter your password: ");
			pass_try = input.nextLine();

			if (user_try.equals(user_real) && pass_try.equals(pass_real)){
				valid_credentials = true;
				program();
			}

			num_attempts++;
		}
	}

	public static void program(){
		System.out.println("\n===================================");
		System.out.println("WELCOME, YOUR LOGIN WAS SUCCESSFUL!");
		System.out.println("===================================");
	}
}