/*

    Enter the value for n:
    5
    *       *
    **     **
    ***   ***
    **** ****
    *********

 */
import java.util.*;
class ValleyPattern
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        ValleyPattern vp = new ValleyPattern();
        System.out.println("Enter the value for n: ");
        int n=in.nextInt();
        vp.printpattern(n);
        in.close();
    }
    void printpattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=2*n-2;j++)
            {
                if((i>=j&&j<n) || (i+j>=2*n-2&&j>=n))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}