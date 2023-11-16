import java.util.Scanner;
class StatMonth
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Week 2.Month");

		int no =sc.nextInt();
		switch(no)
		{
		case 1:
		{   
			//System.out.println("")
			int day=sc.nextInt();
		   switch(day)
		{
			case 1:
		{
			System.out.println("Monday");
			break;
		}
			case 2:
		{
			System.out.println("Tuesday");
			break;
		}
			case 3:
		{
			System.out.println("Wednesday");
			break;
		}
			case 4:
		{
			System.out.println("Thrusday");
			break;
		}
			case 5:
		{
			System.out.println("friday");
			break;
		}
			case 6:
		{
			System.out.println("Saturday");
			break;
		}
			case 7:
		{
			System.out.println("Sunday");
				break;
		}
		   
		}break;
			}


     case 2:{
		      int mon=sc.nextInt();
			  switch(mon)
		 {
			case 1:
		{
			System.out.println("Jan");
			break;
		}
			case 2:
		{
			System.out.println("Feb");
			break;
		}
			case 3:
		{
			System.out.println("March");
			break;
		}
			case 4:
		{
			System.out.println("April");
			break;
		}
			case 5:
		{
			System.out.println("May");
			break;
		}
			case 6:
		{
			System.out.println("Jun");
			break;
		}
			case 7:
		{
			System.out.println("July");
			break;
		}
			case 8:
		{
			System.out.println("August");
			break;
		}
			case 9:
		{
			System.out.println("Sept");
			break;
		}
			case 10:
		{
			System.out.println("Oct");
			break;
		}	case 11:
		{
			System.out.println("Nov");
			break;
		}
			case 12:
		{
			System.out.println("Dec");
			break;
		}

         }
		
	    }
      }

	}
}
