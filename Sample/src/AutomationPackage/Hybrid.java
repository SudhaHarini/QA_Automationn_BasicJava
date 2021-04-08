package AutomationPackage;



	/**
	 * @author MSK
	 *
	 */
	 class Xxx {
		
		int a = 20,b = 10;
		int samsung()
		{
			int offer = a+b;
			return offer;
		}		
	}
		
		class hybrid1 extends Xxx {
			int c =15;
			void sony()
			{
			 int secondoffer = samsung() + c;
			 System.out.println("If you buy both,you will get :" + secondoffer+"% offer");
			}
		}
		
		class hybrid2 extends Xxx {
			int d=13;
			void redmi()
			{
				int thirdoffer=samsung()+d;
				System.out.println("If you buy samsung and Redmi,your offer is: " +thirdoffer+"% offer");
			}  
		}

		/**
		 * @param args
		 */
		
	public class Hybrid
		{
			
			public void main(String[] args) {
			// TODO Auto-generated method stub
			hybrid1 myoffer =new hybrid1();
			myoffer.sony(); 

			hybrid2 myoffer1 = new hybrid2();
			myoffer1.redmi();

		}


}
