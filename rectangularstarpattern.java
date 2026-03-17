/*

    Enter the number of rows and columns:
    4
    6
    ******
    ******
    ******
    ******

 */
import java.util.*;
class rectangularstarpattern
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        rectangularstarpattern obj = new rectangularstarpattern();
        int r,c;
        System.out.println("Enter the number of rows and columns: ");
        r=in.nextInt();
        c=in.nextInt();
        obj.printpattern(r,c);
        in.close();
    }
    void printpattern(int r,int c)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}