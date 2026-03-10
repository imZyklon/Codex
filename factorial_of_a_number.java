/*

    Enter the number:
    5
    Factorial of a number: 120

 */
import java.util.*;
class foanumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        foanumber foan = new foanumber();
        System.out.println("Enter the number:");
        int n=in.nextInt();
        int result=foan.calculate(n);
        foan.display(result);
        in.close();
    }
    int calculate(int n)
    {
        if(n==0||n==1)
            return 1;
        else
            return n*calculate(n-1);
    }
    void display(int n)
    {
        System.out.println("Factorial of a number: "+n);
    }
}