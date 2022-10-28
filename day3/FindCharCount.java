package week1.day3;

public class FindCharCount {

	public static void main(String[] args) {
		/*Find the count of given character in a String
		String str = "cognizant";
		char ch = 'c'; // 1
		Goal: To understand the String, loop, if 
		a) Create a class by name: FindCharCount (with main method) in same package
		b) Write a logic to find the number of occurances of a given character
		c) Run and Confirm the correct character count is printed in console
		Hint: Convert the String to character array, loop and compare with the input charac*/
		String str = "cognizant";
		char ch = 'c';
		
		int length=str.length();
		
		System.out.println("length of string: " + length);
		
		char[] chars=str.toCharArray();
		
		for(int i=0;i<chars.length;i++) {
			
			int indexof=str.indexOf('c');
			
			if(indexof==ch) {
				ch++;
				
			}

		}
		System.out.println("correct character count:  "+ch);
		
		

	}

}
