import java.util.Scanner;
class EvenSum 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the starting no1 :");
		int no1= sc.nextInt();
		System.out.println("Enter the starting no2 :");
		int no2= sc.nextInt();

		int sum=0;
		while(no1<=no2)
		{
			if(no1%2==0)
			{
			    sum=sum+no1;
			}
			no1++;
		}System.out.println(sum);
	}
}
