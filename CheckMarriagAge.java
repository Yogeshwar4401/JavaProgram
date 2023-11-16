import java.util.Scanner;
class CheckMarriagAge 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the gender M or F : ");
        char gen =sc.next().charAt(0) ;
		
		if(gen=='M'||gen=='F')
		{
			System.out.println("Enter the age :");
		int age = sc.nextInt();
		if  ((gen=='M'&& (age>=0&& age<21)) || (gen=='F'&&(age>=1&& age<18)))
		   {
			   if(gen=='M'){
			   System.out.println("Wait for the Marriage :" +(21-age) +"Years");
			   }
			   else{
				   System.out.println("Wait for the Marriage :" +(18-age) +"Years");
			   }
			   
		   }
	    else if  ((gen=='M'&& (age>=21&& age<45)) || (gen=='F'&&(age>=18&& age<45)))
		     {
		        	System.out.println("You can Marriage");
		     }
         else if (age<0)
		{
			System.out.println("Age can not be negative ");
		}

           else 
		{
			System.out.println("You are so late for Marriage");
		}
		}
		else
			System.out.println("plese enter correct gender");
	}
}
