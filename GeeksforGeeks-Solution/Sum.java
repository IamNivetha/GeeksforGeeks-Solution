import java.util.Scanner;
class Sum
{
    
    static int sumOfDigit(int num)
    {
        int sum = 0;
        while(num>0)
        {
            int n = num%10;
            sum+=n;
            num = num/10;
        }
        return sum;
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            int num = sc.nextInt();
            System.out.println(sumOfDigit(num));
        }
    }
}


