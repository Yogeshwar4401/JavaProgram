import java.util.Scanner;
class Autobigraphical
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num=sc.nextInt();
		int sum=0;
		int count=0;

		while(num>0)
		{
          int rem=num%10;
		  sum=sum+rem;
		  count++;
		  num=num/10;
			
		}
		if (sum==count)
		{
			System.out.println("Autobigraphical number");
		}
		else {
			 System.out.println("Autobigraphical number");
		}


	}
}
