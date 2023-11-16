import java.util.Scanner;
class PetersonNum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
	
		int sum=0;

		for(int i=num;i!=0;i=i/10)
		{
			int rem = i%10;
			int fact=1;
			for(int j=1; j<=rem;j++)
			{
				fact=fact*j;
				
			}
			sum=sum+fact;
		}
		if(num==sum)
		{
			System.out.println("peterson Number");
		}
			else {
		System.out.println("Not a peterson Number");
			}
	}
}
