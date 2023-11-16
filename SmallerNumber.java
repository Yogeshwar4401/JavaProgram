import java .util.Scanner;
class SmallerNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Value 1 :");
		int v1= sc.nextInt();
		System.out.println("Enter Value 2 :");
		int v2= sc.nextInt();
		if (v1>v2)
		{
			System.out.println(v2);
		}
		else
		{
			System.out.println(v1);
		}
	}
}
