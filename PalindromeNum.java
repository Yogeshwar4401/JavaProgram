import java.util.Scanner;
class ReversePrint 
{
	public static void main(String[] args) 
	{
		 Scanner sc =new Scanner (System.in);
		System.out.println("Enter the Number :");
		int Num = sc.nextInt();
		int temp=Num;
		int rev=0;
		for(int i=Num;i!=0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
		if(temp==rev)
		{
			System.out.println("It is a palidrome Number");
		}
	 else
	     {
	      System.out.println("It is not palidrome Number");
		 }
	}
}
