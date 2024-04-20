/* commandline arguments in java 

class clr
{
	public static void main(String args[])
	{
		int a,b,c;
		a = Integer.parseInt(args[0]);      // typecast ( package )
		b = Integer.parseInt(args[1]);
		c = a + b;
		System.out.println("addition of two numbers  = "+c);
	}
}
*/
class clr
{
	public static void main(String[] args)
	{
		int a, b, result;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		result = a + b;
		
		System.out.println("Addition of two number is : "+result);
	}
}