/*

    Enter the size:
    4
    Enter the value to increment:
    3

    3
    4	5
    6	7	8
    9	10	11	12

 */
import java.util.*;
class basicdouble_inctri
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        basicdouble_inctri obj = new basicdouble_inctri();
        System.out.println("Enter the size: ");
        int n=in.nextInt();
        System.out.println("Enter the value to increment: ");
        int v=in.nextInt();
        System.out.println();
        obj.printpattern(n,v);
        in.close();
    }
    void printpattern(int n,int v)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print(v++ + "\t");
            System.out.println();
        }
    }
}