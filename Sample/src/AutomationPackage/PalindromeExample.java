/**
 * 
 */
package AutomationPackage;

import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class PalindromeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		      String original, reverse = ""; // Objects of String class  
		      Scanner in = new Scanner(System.in);   
		      System.out.println("Enter a string/number to check if it is a palindrome"); // 
		      original = in.nextLine();   //222
		      int length = original.length();   //3
		      for ( int i = length - 1; i >= 0; i-- )  // i=3, 2>=0, 3--= 2
		         reverse = reverse + original.charAt(i);  // 5
		      if (original.equals(reverse))  
		         System.out.println("Entered string/number is a palindrome.");  
		      else  
		         System.out.println("Entered string/number isn't a palindrome.");   
		}
			
	}
