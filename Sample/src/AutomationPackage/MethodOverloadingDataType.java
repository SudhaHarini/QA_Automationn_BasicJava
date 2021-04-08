/**
 * Method overloading with different data type
 */
package AutomationPackage;

/**
 * @author DELL
 *
 */
public class MethodOverloadingDataType {
	
	
	public int add(int a,int b) {
		System.out.println("int and Float");
		int c = a+b;
		System.out.println(c);
		return c;
		
	}
	
	public double  add(double a,double b) {
		System.out.println("Float and Int");
		double c = a+b;
		System.out.println(c);
		return c;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDataType diffdata = new MethodOverloadingDataType();
		diffdata.add(1, 2);
		diffdata.add(12.0, 1.0);
	}

}
