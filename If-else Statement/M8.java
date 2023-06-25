import java.util.*;
class M8
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);

		double pswd = 123;
		double bal = 1000;
		System.out.println("Enter a Password");
		int pw = sc.nextInt();
		
		System.out.println("Enter a Money");
		double money = sc.nextDouble();
		
		if(pswd == pw && bal >= money)
		{
			bal = bal-money;
			System.out.println("Debbited Successfully");
			return;
		}
		
			System.out.println("Something went Wrong");
		

		
	}
}