import java.util.*;
class LargestNumberof3Digit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter third number");
		int c = sc.nextInt();

		if(a>=b && b>=c)
		{
			System.out.println("Largest number is : "+a);
			return;
		}
		else if(b>=a && b>=c)
		{
			System.out.println("Largest number is : "+b);
			return;
		}
		else
		{
			System.out.println("Largest number is : "+c);
			return;
		}
	}
}