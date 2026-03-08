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
class righthalfpyramid
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        righthalfpyramid rhp = new righthalfpyramid();
        System.out.println("Enter the size: ");
        int n=in.nextInt();
        rhp.printpattern(n);
        in.close();
    }
    void printpattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}