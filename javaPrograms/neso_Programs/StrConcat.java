public class StrConcat
{
	public static void main(String args[])
	{
		String str1 = "Neso";
		String str2 =  "Academy";
		System.out.println(str1 + str2);
		System.out.println(str1 +" "+ str2);
		System.out.println(str1.concat(str2));
		System.out.println(str1 + 5);
		System.out.println(str1.isEmpty());
		// System.out.println(str1.concat(5));  is error
	}
}