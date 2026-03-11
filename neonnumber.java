/*

    Enter the number:
    9
    The number is neon number.

 */
import java.util.*;
class neonum
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        neonum nn = new neonum();
        System.out.println("Enter the number:");
        int n =in.nextInt();
        int v=nn.calculate(n*n);
        nn.display(n,v);
        in.close();
    }
    int calculate(int n)
    {
        int d,s=0;
        while(n!=0)
        {
            d=n%10;
            s=s+d;
            n=n/10;
        }
        return s;
    }
    void display(int n, int v)
    {
        if(n==v)
            System.out.println("The number is neon number.");
        else
            System.out.println("Not a neon number.");
    }
}