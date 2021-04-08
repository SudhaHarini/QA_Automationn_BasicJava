/**
 * 
 */
package AutomationPackage;

/**
 * @author DELL
 *
 */

class Parent{
	void print() {
		System.out.println("Done");
	}
}


class Child extends Parent{
		 void takePrint() {
		System.out.println("Sleepy");
	}
}

class Child1 extends Parent{
	void printing() {
		System.out.println("check");
	}
}

public class SingleInherit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 childObj = new Child1();
		childObj.print();
		childObj.printing();
		Child childob = new Child();
		childob.takePrint();
//		Parent parentObj = new Parent();
//		parentObj.print();
//		
	}

}
