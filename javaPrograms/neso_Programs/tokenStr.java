import java.util.StringTokenizer;

public class tokenStr
{
	public static void main(String args[])
	{
		StringTokenizer st = new StringTokenizer("my name is chandan sir");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}