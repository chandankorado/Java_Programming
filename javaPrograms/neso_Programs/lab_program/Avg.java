public class Avg
{
	public static void main(String[] args)
	{
		int numbers[] = {1,2,3,4,5,6,7,7};
		//calculate sum of all array elements
		int sum = 0;
		for(int i=0; i < numbers.length ; i++)
			sum = sum + numbers[i];
		//calculate average value
		double avg = sum / numbers.length;
		System.out.println("Average value of the array elements is : " + avg);
	}
}


