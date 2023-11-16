import java.util.Scanner;
class  PerfectNum
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			
			if(num%i==0)
			{
				 sum=sum+i;
			}
			
		}
		if(num==sum-num)
		{
			System.out.println("It is perfect Number");
		}
        else
		{
			System.out.println("it is not a perfect number");
		}
	}
}
