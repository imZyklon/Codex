/*

    Enter the value of n:
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
class HDSI
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        HDSI obj = new HDSI();
        System.out.println("Enter the value of n: ");
        int n=in.nextInt();
        obj.printpattern(n);
        in.close();
    }
    void printpattern(int n)
    {
        int v=n/2+2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=n/2;j++)
            {
                if(i<=n/2)
                {
                    if(i+j>=n/2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else
                {
                    if(i+j>=v)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            if(i>n/2)
                v+=2;
            System.out.println();
        }
    }
}