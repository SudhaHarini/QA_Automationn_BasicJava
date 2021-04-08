package AutomationPackage;
import java.util.Scanner;
public class StoreToArray
{
    	  @SuppressWarnings("resource")
		public static void main(String[] args) 
    	  {
//    	    Scanner input = new Scanner(System.in);
//    	    System.out.print("Input your first name: ");
//    	    String fname = input.next();
//    	    System.out.print("Input your last name: ");
//    	    String lname = input.next();
//    	    System.out.println();
//    	    System.out.println("Hello \n"+fname+" \n"+lname);
            String s1 = "Welcome to Javatpoint";  
            char[] ch = s1.toCharArray();  
            int len = ch.length;  
            System.out.println("Char Array length: " + len);  
            System.out.println("Char Array elements: ");  
            for (int i = 0; i < len; i++) {  
                System.out.println(ch[i]);  
            }  

    	  }

    }

