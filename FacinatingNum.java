import java.util.Scanner;
class FacinatingNum
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Number :");
		int num1= sc.nextInt();
        int num2=num1*2;
		int num3=num1*3;
		int rev1=0;
		int rev2=0;
		
		while(num2>0)
		{
		   rev1=rev1*10+num2%10;
		   num2=num2/10;
		}
		while(num3>0)
		{
		   rev2=rev2*10+num3%10;
		   num3=num3/10;
		}
		while(rev1>0)
		{
		   num1=num1*10+rev1%10;
		   rev1=rev1/10;
		}
        while(rev2>0)
		{
		   num1=num1*10+rev2%10;
		   rev2=rev2/10;
		}
		int temp=num1;
		int count=0;
		for (int i=1;i<9 ;i++ )
		{
			num1=temp;
			for (;num1>0;num1/=10 )
			{
				int rem1=num1%10;
				if(i==rem1)
				{
					count++;
					break;
				}
			}
		}
		if(count==9)
		{
			System.out.println("Facinating number");
		}
			else
			{
			System.out.println("Not Facinating number");
		}	

	}

}
