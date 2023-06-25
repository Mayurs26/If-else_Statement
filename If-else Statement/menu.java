import java.util.*;
class A1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();

		System.out.println("Choose a menu :");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Quotient");
		System.out.println("4. Remainder");
		
		while(true)
		{
		switch(sc.nextInt())
		{
			case 1:
				System.out.println("Addition of "+ a+" + "+b +" = "+(a+b));
			break;
			case 2:
				System.out.println("Substraction of "+ a+" - "+b +" = "+(a-b));
			break;
			case 3:
				System.out.println("Multiplication of "+ a+" * "+b +" = "+(a*b));
			break;
			case 4:
				System.out.println("Quotient of "+ a+" / "+b +" = "+(a/b));
			break;
			case 5:
				System.out.println("Remainder of "+ a+" % "+b +" = "+(a%b));
			break;

			default :
				System.out.println("Enter number 1 to 5");
		}
		}
	}
}