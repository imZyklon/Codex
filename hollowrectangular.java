/*

    Enter the number of rows and columns:
    4
    6
    ******
    *    *
    *    *
    ******

 */
import java.util.*;
class hollowrectangular
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        hollowrectangular hr = new hollowrectangular();
        int r,c;
        System.out.println("Enter the number of rows and columns:");
        r=in.nextInt();
        c=in.nextInt();
        hr.printpattern(r,c);
        in.close();
    }
    void printpattern(int r,int c)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0||j==0||i==r-1||j==c-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}