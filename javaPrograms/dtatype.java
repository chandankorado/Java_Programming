// Datatypes in java 

class dtatype               // ' dttype ' is a class name.
{
	public static void main(String args[])
	{
		boolean var1 = true;		// 1 bit	  true, false
		byte var2 = 127;			// 1 byte 	    -128 ->  ( ascii char( unicode char ) )
		char var3 = 'A';			// 2 bytes	    'a', '\u0041', '\\', '\'', '\n', '8'
		short var4 = -32768; 		// 2 bytes		-> 32,767
		int var5 = 2147483647;		// 4 bytes		-2,147,483,648 ->
		
		long var6 = -9223372036854775808L;	 // 8 bytes	-> 9,223,372,036,854,775,808
		
		float var7 = 3.40282347f;			 // 4 bytes		3.40282347 x 10^38 , 1.40239846 x 10^-45
		
		double var8 = 1.797693134623157d;    // 8 bytes 1.7976931348623157 x 10^308 , 4.9406564584124654 x10^-324

		System.out.println("Datatypes:");
		System.out.println(" ");		
		System.out.println("boolean = "+var1);
		System.out.println("byte = "+var2);
		System.out.println("char = "+var3);
		System.out.println("short = "+var4);
		System.out.println("int = "+var5);
		System.out.println("long = "+var6);
		System.out.println("float = "+var7);
		System.out.println("double = "+var8);
	}
}