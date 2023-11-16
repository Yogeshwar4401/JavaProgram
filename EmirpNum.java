import java.util.Scanner;
class EmirpNum 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the Number :");
		int num= sc.nextInt();
		int temp=num;
		int rev=0;
		int i,j;
		int count1=0;
		int count2=0;
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
	   for( i=2;i<temp;i++)
		{
			if(temp%i==0)
			{
				count1++;
			}
		}
		 for( j=2;j<rev;j++)
		{
			if(rev%j==0)
			{
				count2++;
			}
		}
		if(count1==0&&count2==0)
		{
			System.out.println("Emir Number :");
		}
		else 
         {
			System.out.println("Not Emir Number :");
		}

	}
}
