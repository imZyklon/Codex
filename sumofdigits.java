/*

    Enter the number:
    1634
    Sum of Digits: 14

 */
import java.util.*;
class sumofdigits
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        sumofdigits obj = new sumofdigits();
        System.out.println("Enter the number: ");
        int n=in.nextInt();
        obj.sod(n);
        in.close();
    }
    void sod(int n)
    {
        int d,s=0;
        while(n!=0)
        {
            d=n%10;
            s=s+d;
            n=n/10;
        }
        System.out.println("Sum of Digits: "+s);
    }
}