import java.util.Scanner;
class FactorSum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");

		int No= sc.nextInt();
		int sum=0;
		for(int i=1; i<=No; i++)
		{
			if(No%i==0)
			{
				sum=sum+i;
			}
		} System.out.println(sum);
	}
}
