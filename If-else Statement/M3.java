import java.util.*;
class M3
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a char :");

		char c1 = sc.next().charAt(0);

		
		if (c1== 'a' || c1== 'e' || c1== 'i' || c1== 'o' || c1== 'u')
			{

				System.out.println("Hi");
				return;
			}
			
				System.out.println("Bye");
		
	}
}