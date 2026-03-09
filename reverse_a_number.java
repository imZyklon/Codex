/*

    Enter the number:
    234
    Reversed Number: 432

 */
import java.util.*;
class revnum
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        revnum rn = new revnum();
        System.out.println("Enter the number: ");
        int n=in.nextInt();
        rn.reversenum(n);
        in.close();
    }
    void reversenum(int n)
    {
        int d,s=0;
        while(n!=0)
        {
            d=n%10;
            s=s*10+d;
            n=n/10;
        }
        display(s);
    }
    void display(int n)
    {
        System.out.println("Reversed Number: "+n);
    }
}