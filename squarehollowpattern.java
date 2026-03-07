/*

    Enter the size:
    5
    *****
    *   *
    *   *
    *   *
    *****

 */
import java.util.*;
class squarehollowpattern
{
    public static void main(String args[])
    {
        squarehollowpattern shp = new squarehollowpattern();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=in.nextInt();
        shp.printpattern(n);
        in.close();
    }
    void printpattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||j==0||i==n-1||j==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}