// Vriables in java 

class lis               // ' lis ' is a class name.
{
	int b = 20; 		// instance var	
	
	static int c = 30;		// static var
	
	public static void main(String args[])
	{
		 int a = 10;		// local var
		 
		 lis ch = new lis();		// ctreate object for instance var
		 
		 System.out.println("local variable = "+a);			// print local var
		 System.out.println("instane variable = "+ch.b);		// print instanse var
		 System.out.println("static variable = "+c);		// print static var ( are directly acces )
	}
}