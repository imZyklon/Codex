/*

    Enter the number:
    36
    Niven Number

    Niven Number: a number which is divisible by the sum of its digits.(also called Harshad Number)
    n=36
    sum of digits=3+6=9
    36 is divisible by 9.

 */
import java.util.*;
class niven_number
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        niven_number nn = new niven_number();
        System.out.println("Enter the number: ");
        int n=in.nextInt();
        nn.checkno(n);
        in.close();
    }
    void checkno(int n)
    {
        if(n%sod(n)==0)
            System.out.println("Niven Number");
        else
            System.out.println("Not a Niven Number");
    }
    int sod(int n)
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
}