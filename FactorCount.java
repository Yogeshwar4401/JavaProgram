
import java.util.Scanner;
class FactorCount 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number :");

		int No =sc.nextInt();
		int Count=0;
		for(int i=1; i<=No; i++)
		{
			if (No%i==0)
			{
				Count++;
			}
		}System.out.println(Count);
	}
}
