import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        int a,b,sum=0;
        Scanner obj=new Scanner(System.in); 
        System.out.println("Enter 2 numbers:");
        a=obj.nextInt();
        b=obj.nextInt();
        sum=a+b;
         System.out.println("Sum :"+sum);
    }
}