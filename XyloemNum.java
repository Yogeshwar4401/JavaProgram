import java.util.Scanner;
class XyloemNum 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int fl=0;
		int ml=0;
		fl=num%10;
		num=num/10;
		int i;
		for(i=num; i>9; i/=10)
		{
			ml=ml+i%10;
		}
		fl=fl+i;
          if(fl==ml)
			  {
			System.out.println("Xyloem");
			}
			else
		{
			System.out.println("Pholem");
		}
	}
}
