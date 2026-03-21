/*

    Enter the size:
    5

    15	14	13	12	11
    10	9	8	7
    6	5	4
    3	2
    1

 */
import java.util.*;
class inverted_rtnp
{
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        inverted_rtnp obj = new inverted_rtnp();
        System.out.println("Enter the size: ");
        int n=in.nextInt();
        System.out.println();
        obj.printpattern(n);
        in.close();
    }
    void printpattern(int n)
    {
        int v=(n*n)-(n*n-n)/2;
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
                System.out.print(v-- + "\t");
            System.out.println();
        }
    }
}