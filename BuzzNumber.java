import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number :");
		int Num=sc.nextInt();

	  if(Num%10==0 || Num%7==0)
		{
			System.out.println("it is Buzz Number");
		}
		else 
		{
			System.out.println("it is not Buzz Number");
			System.out.println("it is not Buzz Number");
			
			
		}
		
	}
}
