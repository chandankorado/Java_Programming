public class Token
{
	public static void main(String args[])
	{
		StringTokenizer st = new StringTokenizer("my name is chandan broh");
		while (st.hasMoreTokens())
		{
			System.out.println(st.nxtToken());
		}
	}
}