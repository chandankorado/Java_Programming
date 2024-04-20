public class avgArr
{
	public static void main(String args[])
	{
		int nums[] = new int[] {1,2,3,4,5,6};
		
		int sum = 0;
		
		for(int i = 0; i < nums.length; i++)
			sum += nums[i];
		double avg = sum / nums.length;
		
		System.out.println("Average value  of array element is : "+avg);
	}
}