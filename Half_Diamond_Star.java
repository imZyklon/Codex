/*

    Enter the size:
    7
    *
    **
    ***
    ****
    ***
    **
    *
     
 */
import java.util.*;
class HalfDSP
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        HalfDSP hd= new HalfDSP();
        System.out.println("Enter the size: ");
        int n=in.nextInt();
        hd.printpattern(n);
        in.close();
    }
    void printpattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=n/2;j++)
            {
                if(i<=n/2)
                {
                    if(i>=j)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else
                {
                    if(i+j<=n-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}