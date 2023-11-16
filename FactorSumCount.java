import java.util.Scanner;
class FactorSumCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int no= sc.nextInt();
		System.out.println("1.Factor :");
		System.out.println("2.Count:");
		System.out.println("3.Sum :");
		int no1= sc.nextInt();
        int count=0;
		int sum=0;
		if(no1==1)
		{
			// no= sc.nextInt();
			for(int i=1; i<=no;i++)
			{
				if(no%i==0){
				System.out.println(i);
				}
			}
		}
		else if (no1==2)
		{
		//	 no= sc.nextInt();
			for(int i=1; i<=no;i++)
			{
				if(no%i==0){
				count++;
				}
			}
			System.out.println(count);
		}
		else if (no1==3)
		{
		//	 no= sc.nextInt();
			for(int i=1; i<=no;i++)
			{
				if(no%i==0){
				sum=sum+i;
				}
			}System.out.println(sum);
		}

	}
}
