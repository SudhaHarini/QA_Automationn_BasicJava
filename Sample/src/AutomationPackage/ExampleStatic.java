package AutomationPackage;

public class ExampleStatic {
		   public static void main(String args[]){
		     Student student1 = new Student();
		     student1.showData();
		     Student student2 = new Student();
		     student2.showData();
		  }
		}

		class Student {
		int a; //initialized to zero
		static int b; //initialized to zero only when class is loaded not for each object created.

		  Student(){
		   //Constructor incrementing static variable b
		   b++;
		  }

		   public void showData(){
		      System.out.println("Value of a = "+a);
		      System.out.println("Value of b = "+b);
		   }

		}
