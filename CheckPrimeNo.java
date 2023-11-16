import java.util.Scanner;
class CheckPrimeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the positive number :");
		int Num = sc.nextInt();
		if(Num%2==0)
		{
			System.out.println("It Is A Even Number");
		}
		else
		{
			if ( Num)
			{
				System.out.println("It Is A Prime Number");
			}
			else 
				{
				System.out.println("It Is A Odd Number");
			  }
		}
	}
}
