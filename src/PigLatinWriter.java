import java.util.Scanner;

public class PigLatinWriter {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String cont = "y";
		String userWord;
		String pigWord;
		
		
		System.out.println("Let's play with Pig-Latin!");
		
		while (cont.equalsIgnoreCase("y")) {
			
			System.out.println("Enter a word: ");
			userWord = scnr.nextLine();
			userWord = userWord.toLowerCase();
			if (userWord.charAt(0) == 'a' || userWord.charAt(0) == 'e' || userWord.charAt(0) == 'i' || 
					userWord.charAt(0) == 'o' || userWord.charAt(0) == 'u') {
				pigWord = userWord + ("way");
				System.out.println(pigWord);
			} else if (userWord.charAt(1) == 'a' || userWord.charAt(1) == 'e' || userWord.charAt(1) == 'i' || 
					userWord.charAt(1) == 'o' || userWord.charAt(1) == 'u') {
				System.out.println(modifyOneCons(userWord));
				
			} else if (userWord.charAt(2) == 'a' || userWord.charAt(2) == 'e' || userWord.charAt(2) == 'i' || 
					userWord.charAt(2) == 'o' || userWord.charAt(2) == 'u') {
				System.out.println(modifyTwoCons(userWord));
				
			} else if (userWord.charAt(3) == 'a' || userWord.charAt(3) == 'e' || userWord.charAt(3) == 'i' || 
					userWord.charAt(3) == 'o' || userWord.charAt(3) == 'u') {
				System.out.println(modifyThreeCons(userWord));
				
			} else {
				System.out.println("Wow, that's a weird word...");
			}
			
			System.out.println("Want to continue? ");
			cont = scnr.nextLine();
			
		}
		System.out.println("Ok, bye. ");
		scnr.close();
	}
	public static String modifyOneCons(String userWord) {
		String modWord1 = userWord.substring(1);
		String modWord2 = userWord.substring(0, 1);
		String pigWord = (modWord1 + modWord2 + "ay");
		
		return pigWord;
	}
	public static String modifyTwoCons(String userWord) {
		String modWord1 = userWord.substring(2);
		String modWord2 = userWord.substring(0, 2);
		String pigWord = (modWord1 + modWord2 + "ay");
		
		return pigWord;
	}
	public static String modifyThreeCons(String userWord) {
		String modWord1 = userWord.substring(3);
		String modWord2 = userWord.substring(0, 3);
		String pigWord = (modWord1 + modWord2 + "ay");
		
		return pigWord;
	}
	
}


