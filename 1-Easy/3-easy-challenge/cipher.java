import java.util.Scanner;

class Cipher{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String message;

		System.out.println("What do you want to do:");
		System.out.println("\t1. Encrypt message");
		System.out.println("\t2. Decrypt message\n");
		
		try{
			int delta = 5;	//Encrypted message is plus five of the original
			int choice = input.nextInt();
			String buffer = input.nextLine(); //Get rid of extra \n char


			switch(choice){
				case 1:
					System.out.print("\nEnter a message you want to encrypt: ");
					message = input.nextLine();
					String encrypted = "";

					for(int i = 0; i < message.length(); i++){
						char c = message.charAt(i);
						if ((int) c >= 96 && (int) c <= 122){
							int a = (((int) c) + delta - 122)% 26;
							a = a < 0 ? a + 26 + 96 : a + 96;
							encrypted += (char) a;
						} else {
							encrypted += (char) c;
						}
					}

					System.out.format("The encrypted message is %s\n", encrypted);
					break;
					
				case 2:
					System.out.print("\nEnter a message you want to decrypt: ");
					message = input.nextLine();
					String decrypted = "";

					for(int i = 0; i < message.length(); i++){
						char c = message.charAt(i);
						if ((int) c >= 96 && (int) c <= 122){
							int a = (((int) c) - delta -122)% 26;
							a = a < 0 ? a + 26 + 96 : a + 96;
							decrypted += (char) a;
						} else {
							decrypted += (char) c;
						}
					}

					System.out.format("The decrypted message is %s\n", decrypted);
					break;

				default:
					System.out.println("ERROR! INVALID INPUT!");
			}
		} catch (java.util.InputMismatchException e){
			System.out.println("INPUT WAS NOT AN INT!");
		}
	}
}