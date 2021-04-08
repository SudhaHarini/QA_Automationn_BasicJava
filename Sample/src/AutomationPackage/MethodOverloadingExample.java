/**
 * Method Overloading Example with Diff numeber of parameters passed
 */
package AutomationPackage;

/**
 * @author DELL
 *
 */
public class MethodOverloadingExample {
	
	public int add(int a,int b) {
		System.out.println("Two Parameters");
		int c= a+b;
		System.out.println(c);
		return c;
	}
	public int add(int a,int b,int c) {
		System.out.println("Three Parameters");
		int d = c+a+b;
		System.out.println(d);
		return d;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample overload = new MethodOverloadingExample();
		overload.add(1, 2, 3);
		overload.add(5, 6);
	}

}
