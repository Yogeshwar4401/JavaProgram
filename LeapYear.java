import java.util.Scanner;
class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Starting Year");
		int start= sc.nextInt();
		System.out.println("Enter the Ending Year");
		int end= sc.nextInt();

		for(int from=start;from<=end;from++)
		{
			if(from%4==0&&from%100!=0 || from%400==0)
			{
				System.out.println(from);
			}
		}
		
	}
}
