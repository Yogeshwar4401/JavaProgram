import java.util.Scanner;
class  ReverseNum
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num =sc.nextInt();
        int rev=0;
		for(int i=num; i>0; i=num%10)
		{
			rev=rev+i;
		}System.out.println(rev);

	}
}
