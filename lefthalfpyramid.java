/*

    Enter the size:
    5
        *
       **
      ***
     ****
    *****

 */
import java.util.*;
class lefthalfpyramid
{
    public static void main(String args[])
    {
        lefthalfpyramid lhp = new lefthalfpyramid();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=in.nextInt();
        lhp.printpattern(n);
        in.close();
    }
    void printpattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j>=n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}