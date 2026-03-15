/*

    Enter the value for n:
    5
    *********
     *     *
      *   *
       * *
        *

 */
import java.util.*;
class hollowinvertedpyramid
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        hollowinvertedpyramid hip = new hollowinvertedpyramid();
        System.out.println("Enter the value for n: ");
        int n=in.nextInt();
        hip.printpattern(n*2-1);
        in.close();
    }
    void printpattern(int n)
    {
        for(int i=0;i<=n/2;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j||i==0||i+j==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}