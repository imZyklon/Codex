/*

    Enter the number:
    121
    Palindrome Number

 */
import java.util.*;
class Palnum
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Palnum pn = new Palnum();
        System.out.println("Enter the number: ");
        int n=in.nextInt();
        pn.Palchecker(n);
        in.close();
    }
    void Palchecker(int n)
    {
        if(n==reverse(n))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
    int reverse(int n)
    {
        int d,s=0;
        while(n!=0)
        {
            d=n%10;
            s=s*10+d;
            n=n/10;
        }
        return s;
    }
}