package AutomationPackage;



	class Vehicle{  
		  static void run(){
			  System.out.println("Vehicle is running");}  
		}  
		//Creating a child class  
	public class Overriding  extends Vehicle{ 
		  public static void main(String args[]){ 
 		  //creating an instance of child class  
//			  Vehicle obj = new Vehicle();  
		  //calling the method with child class instance  
//		  obj.run(); 
		  run();
		  }  
		}  

