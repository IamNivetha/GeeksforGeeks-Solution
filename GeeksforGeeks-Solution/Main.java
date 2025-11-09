import java.util.Scanner;
public class Main
{
   static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i = 2;i<Math.sqrt(num);i++)
        {
            if(num%i == 0)
            {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
      for(int i = 0;i<n;i++)
       {
		System.out.println("enter the value");
		int num = sc.nextInt();
		
		
		System.out.println(isPrime(num));
		}
	}
}