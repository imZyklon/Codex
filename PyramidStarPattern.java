/*

    Enter the value for n:
    5
        *
       ***
      *****
     *******
    *********

 */
import java.util.*;
class Pyramidstarpattern
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Pyramidstarpattern psp = new Pyramidstarpattern();
        System.out.println("Enter the value for n: ");
        int n=in.nextInt();
        psp.printpattern(2*n-1);
        in.close();
    }
    void printpattern(int n)
    {
        int v=n/2;
        for(int i=0;i<=n/2;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j>=n/2&&i+j<=v)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            v=v+2;
            System.out.println();
        }
    }
}