import java.util.Scanner;
class EvenNum 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Starting number :");
		int no1= sc.nextInt();
		System.out.println("Enter the Ending number :");
		int no2= sc.nextInt();
		
		while(no1<=no2)
          {   
			if(no1%2==0)
		      {
		       	System.out.println(no1);
			 }
			no1++; 
		  } 
	}
}
