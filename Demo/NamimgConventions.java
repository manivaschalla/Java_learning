import java.lang.*;  // packages
public class NamimgConventions {
	/*
	-> Java follows strict Namimg Conventions to maintain 
		readability and maintainability
		
	-> Types of cases :
			1) PascalCase -> First Letter of Each Word Capitalized
			2) camelCase -> first Letter lower Case Subsquent Words Capitalized
			3) SCREAMING_SNAKE_CASE -> All uppercase with words separated by underscore
			4) lowercase -> all in lower case letters
			
	-> USAGE :
			PascalCase => Classes, Interfaces & ENUMS()fields in UPPERCASE
			camelCase => Methods & Variables(meaningful names )
			SCREAMING_SNAKE_CASE => Constants
			lowercase => packages
	*/
	public static void main(String[] args) { // main method
		
		int height = 40;   // variable 
		final int BIRTH_YEAR = 1994; // Constant
		
		System.out.println(height);
		System.out.println(BIRTH_YEAR);
		
	}
}
