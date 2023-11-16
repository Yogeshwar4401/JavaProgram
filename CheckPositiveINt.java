import java.util.Scanner;
class CheckPositiveINt 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");

		int number= sc.nextInt();
		if(number>0){
		System.out.println("Hi");
		System.exit(0);
		}
		System.out.println("Bye");
	}
}
