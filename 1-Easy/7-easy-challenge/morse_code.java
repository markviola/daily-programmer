import java.util.Hashtable;

class MorseCode{
	public static void main(String[] args){
		String morse_code_string = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- /" + 
			" .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.-"+
			" / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";

		Hashtable code_converter = new Hashtable();
		code_converter.put(".-", "A");
		code_converter.put("-...", "B");
		code_converter.put("-.-.", "C");
		code_converter.put("-..", "D");
		code_converter.put(".", "E");
		code_converter.put("..-.", "F");
		code_converter.put("--.", "G");
		code_converter.put("....", "H");
		code_converter.put("..", "I");
		code_converter.put(".---", "J");
		code_converter.put("-.-", "K");
		code_converter.put(".-..", "L");
		code_converter.put("--", "M");
		code_converter.put("-.", "N");
		code_converter.put("---", "O");
		code_converter.put(".--.", "P");
		code_converter.put("--.-", "Q");
		code_converter.put(".-.", "R");
		code_converter.put("...", "S");
		code_converter.put("-", "T");
		code_converter.put("..-", "U");
		code_converter.put("...-", "V");
		code_converter.put(".--", "W");
		code_converter.put("-..-", "X");
		code_converter.put("-.--", "Y");
		code_converter.put("--..", "Z");
		code_converter.put("/", " ");

		String morse_code_words[] = morse_code_string.split(" ");
		String deciphered_message = "";

		for (int i = 0; i < morse_code_words.length; i++){
			deciphered_message += (String)code_converter.get(morse_code_words[i]);
		}

		System.out.println(deciphered_message);
	}
}
