/**
 * Creating Method
 */
package AutomationPackage;

/**0
 * @author DELL
 *
 */
public class CreationOfMethod {

	public void doAdd()
	{
		int var1,var2;
		var1 = 10;
		var2 = 20;
		int var3 = var1+var2;
		System.out.println(var3);
	}
	
	public void doSub() {
		int var4,var5,var6;
		var4=100;
		var5=20;
		var6=var4-var5;
		System.out.println(var6);
				
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreationOfMethod Objname = new CreationOfMethod();//Constructor is for memory allocation,Garbage collector will be there in java to destruct the memory
		Objname.doAdd();
		Objname.doSub();
	}

}
