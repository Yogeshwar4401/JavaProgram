import java.util.Scanner;
class NeonNum 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the Number :");
		int Num =sc.nextInt();
		int Sqr=Num*Num;
        int Add=0;
		while(Sqr>0)
		{
			Add=Add+Sqr%10;
			Sqr=Sqr/10;
		}
		//System.out.println(Add);
		//System.out.println(Sqr);
		if(Num==Add)
		{
			System.out.println("Neon");
		}
			else
		{
			System.out.println("Not Neon");
		}

	}
}