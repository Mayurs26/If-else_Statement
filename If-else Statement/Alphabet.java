import java.util.*;
class A3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter character");
		int a = sc.next().charAt(0);
		

		if(a>=65 && a<=90 || a>=97 && a<=122)
		{
			System.out.println("It is Alphabet");
			return;
		}
		else if(a>=48 && a<=57)
		{
			System.out.println("It is Digit");
			return;
		}
		else
		{
			System.out.println("It is Special character");
			return;
		}
	}
}