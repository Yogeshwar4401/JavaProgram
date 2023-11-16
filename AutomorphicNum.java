import java.util.Scanner;
class AutomorphicNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int Num=sc.nextInt();
		int sqr=Num*Num;

		for(int i=Num; i>0; i=Num/10)
		{
			if(Num%10==sqr%10)
			{
			System.out.println("Automorphic Number ");
			System.exit(1);
			}
			else 
			{
				System.out.println("It is not a Automorphic number");
				System.exit(1);
			}
		 sqr=sqr/10;
		}
		
	}
}
