import java.util.*;
class S8
{
	 public static void main(String args[]) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");

   
		int a = sc.nextInt();

   
    		if (a % 3 == 0 ) 
		{
      	System.out.println(a + " divisible by 3");
    		}
		else if(a % 5 == 0)
		{
			System.out.println(a + " divisible by 5");
		}
    		
    		else 
		{
     		System.out.println(a + " no");
		}
  }
}