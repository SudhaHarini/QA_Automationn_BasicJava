/**
 * 
 */
package AutomationPackage;

/**
 * @author DELL
 *
 */
public class ExampleIfClause {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=10;
		b=5;
		c=8;
		String var = "ABC";
		String var2 = "DEF";
		String exa = Integer.toString(a);
		int exb = Integer.parseInt(var2);
		String concat = var.concat(var2);
		System.out.println(concat);
		if(var.equals(var2)) {
			System.out.println("Match");
		}else {
			System.out.println("String");
		}
		if(a==b) {
			System.out.println("Value Match vit a");
		}else if(a==c) {
			System.out.println("Value match vit b");
		}else if(b==c){
			System.out.println("Value match vit c");
		}else {
			System.out.println("always do");
		}
	}

}
