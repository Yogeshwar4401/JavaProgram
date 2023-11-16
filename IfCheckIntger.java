import java.util.Scanner;
class IfCheckIntger 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a/2==0)
		{
			System.out.println("It is even number");
			System.exit(2);
		}

		System.out.println("It is odd number");
	}
}
