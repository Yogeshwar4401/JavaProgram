import java.util.Scanner;
class PrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number :");

		int No=sc.nextInt();
		int count=0;
		for(int i=1; i<=No; i++)
		{
			if(No%i==0)
			{
				//System.out.println(i);
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("it is a Prime Number");
		}
			else
		{
			System.out.println("it is not a prime number");
		}
	}
}
