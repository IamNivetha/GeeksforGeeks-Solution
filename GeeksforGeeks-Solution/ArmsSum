mport java.util.Scanner;
class Main
{
    static int ArmstrongNumber(int num)
    {
        int k = num,sum = 0;
        int n = String.valueOf(num).length();
        while(k>0)
        {
            int digits = k%10;
            sum+=Math.pow(digits,n);
            k = k/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            int num = sc.nextInt();
            System.out.println(ArmstrongNumber(num));
        }
    }
    
}