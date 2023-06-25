import java.util.*;
class DayProgram
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day :");
		
		String a = sc.next();

		
		switch(a)
		{
		case "Monday":
		case "Thursday":
			System.out.println(a+": Cricket");
		break;
		case "Tuesday":
			System.out.println(a+": Volleyball");
		break;
		case "Wednesday":
		case "Friday":
			System.out.println(a+": Football");
		break;
		case "Saturday":
			System.out.println(a+": Basketball");
		break;
		case "Sunday":
			System.out.println(a+": Sleep");
		break;
		
		
		

		default :
			System.out.println("Please enter valid data");
		}
		
	}
}