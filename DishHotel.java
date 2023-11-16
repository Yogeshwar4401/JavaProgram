import java.util.Scanner;
class  DishHotel
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the dish type No : ");
		System.out.println("1.Veg");
		System.out.println("2.Non-Veg");

		int type= sc.nextInt();
		switch(type)
        {
			case 1:
			{
				System.out.println("1. Panner Masala");
				System.out.println("2. Chole masala");
				System.out.println("3. Palak sabji");
				System.out.println("4. Kolhapuri tej");
				int choice = sc.nextInt();
				switch(choice)
				{
					case 1:
						{
						System.out.println("Panner Masala = 210");
						break;
						}
                    case 2:
					    {
						System.out.println("chole Masala = 180");
						break;
				     	}
                    case 3:
					    {
						System.out.println("Palak sabji = 170");
						break;
				     	}
				     case 4:
					    {
						System.out.println("chole Masala = 160");
						break;
				     	}
				}
				
			}
			break;
			case 2:
				{
				System.out.println("1. Chiken fry");
				System.out.println("2. Mutton Masala");
				System.out.println("3. Biryani");
				System.out.println("4. Mutten handi");
				int choice = sc.nextInt();
				switch(choice)
					{
						case 1:
						{
						System.out.println("Chiken fry = 250");
						break;
						}
                    case 2:
					    {
						System.out.println(" Mutton Masala = 280");
						break;
				     	}
                    case 3:
					    {
						System.out.println("Biryani = 150");
						break;
				     	}
				     case 4:
					    {
						System.out.println(" Mutton handi = 230");
						break;
				     	}
					}

				}
        }

	}
}
