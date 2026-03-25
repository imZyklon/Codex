/*

    Enter the number:
    17
    Prime Number

 */
import java.util.*;
class prime_number
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        prime_number pn = new prime_number();
        System.out.println("Enter the number: ");
        int n=in.nextInt();
        pn.checkno(n);
        in.close();
    }
    void checkno(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}