/*

    Enter the value for n:
    5
        *
       * *
      *   *
     *     *
    *********

 */
import java.util.*;
class HollowPyramidStar
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        HollowPyramidStar hps = new HollowPyramidStar();
        System.out.println("Enter the value for n: ");
        int n=in.nextInt();
        hps.printpattern(2*n-1);
        in.close();
    }
    void printpattern(int n)
    {
        int v=n/2;
        for(int i=0;i<=n/2;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j==n/2||i+j==v||i==n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            v=v+2;
            System.out.println();
        }
    }
}