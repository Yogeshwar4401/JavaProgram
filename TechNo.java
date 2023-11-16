import java.util.Scanner;
class  TechNum
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		int tem=num;
		int count=0;
		int sum=0;
		int sum1=0;

		for (int i=num;i!=0 ;i=i/10 )
		{
			count++;
		}
		count=count/2;
	    
		for(int j=1;j<=count;j++)
		{
		   int rem=num%10;
		   sum=sum*10+rem;
		   
			num=num/10;

		}
		System.out.println(sum);
		for(int k=1;k<=count;k++)
		{
		   int rem1=sum%10;
		   sum1=sum1*10+rem1;
		   
			sum=sum/10;

		}
		System.out.println(sum1);
		System.out.println(num);
		 int sqr=sum1+num;
		 System.out.println(sqr*sqr);
         
		if(tem==sqr*sqr)
		{
			System.out.println("it is a tech Number");
		}
		else
		{
			System.out.println("It is not a number");
		}
	}
}
