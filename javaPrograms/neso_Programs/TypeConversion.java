public class TypeConversion
{
	public static void main(String args[])
	{
		char c1 = 'A';
		char c2 = '\u0041';
		char c3 = 65;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		int code1 = 'A';
		int code2 = '\u0041';
		
		System.out.println(code1);
		System.out.println(code2);
	}
}