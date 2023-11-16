import java.util.Scanner;
class YogiShop 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("****WELCOME TO A SHOP****");
		System.out.println("1. Yogi Daily Needs");
		System.out.println("2. Pavan Recharge Corner");

		int no = sc.nextInt();
		switch(no)
		{
			case 1:
			{
				System.out.println("1.Milk");
				System.out.println("2.Bread");
				System.out.println("3.Thost");
				System.out.println("4.Khari");
				int choice = sc.nextInt();
		        switch(choice)
				{
					case 1:
						{
							System.out.println("Milk= 50 Lit");
							break;
						}
                    case 2:
						{
							System.out.println("Bread= 30 per");
							break;
						}
                    case 3:
						{
							System.out.println("Thost= 40 per");
							break;
						}
                    case 4:
						{
							System.out.println("khari= 50 per");
							break;
						}
				}
			}
			   break;
			case 2:
			{
				System.out.println("1.Idea");
				System.out.println("2.Vodafone");
				System.out.println("3.Jio");
				System.out.println("4.BSNL");
				int choice = sc.nextInt();
		        switch(choice)
                //System.out.println("Buy Any Product");
				{
					case 1:
						{
							System.out.println("Idea = 299");
							break;
						}
                    case 2:
						{
							System.out.println("Vodafone = 249");
							break;
						}
                    case 3:
						{
							System.out.println("Jio = 249");
							break;
						}
                    case 4:
						{
							System.out.println("BSNL = 199");
							break;
						}
				}
			}
			
		}
	}
}
