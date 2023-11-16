import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num= sc.nextInt();
		int sum= 0;
		int pro=1;

	   /*for(int i=num; i!=0; i=i/10)
		{
			int rem = i%10;
			sum=sum+rem;
			pro=pro*rem;

		}*/
		while(num>0)
		{
			int rem = num%10;
			sum=sum+rem;
			pro=pro*rem;
			num=num/10;

		}
		
		if(sum==pro)
		{
			System.out.println(" It is Spy Number");
		}
        else
		{
			System.out.println("it Is not a Spsy number");
		}



	}
}
