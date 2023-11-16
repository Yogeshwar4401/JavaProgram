import java.util.Scanner;
class HarshadNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number ");
		int num= sc.nextInt();
		int temp=num;
		int sum=0;
     
	 for (int i=num;i!=0 ;i=i/10 )
	 {
		 int rem=i%10;
		 sum=sum+rem;

	 }
     if(temp%sum==0)
		{
			System.out.println("harshad Number");
		}
			else
			{
		   System.out.println("Not a harshad Number");
			}

	}
}
