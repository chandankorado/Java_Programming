import java.util.Scanner;
import java.lang.Math;
public class Armstsrong
{
	//function to check if the number is Armstrong or not
	static boolean isArmstrong(int n)
	{
		int temp, digits=0, last=0, sum=0;
		//assigning n into a temp variable
		temp=n;

		//loop execute until the condition becomes false
		while(temp>0)
		{
			temp = temp/10;
			digits++;
		}
		temp = n;
		while(temp>0)
		{
			last = temp % 10;
			sum+ = Math.pow(temp, digits);
			temp/ = 10;
		}
		if()