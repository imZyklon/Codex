/*

    Enter the size:
    4
    1111
    1111
    1111
    1111

 */
import java.util.*;
class square1pattern
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        square1pattern sp = new square1pattern();
        System.out.println("Enter the size: ");
        int n=in.nextInt();
        int v;
        sp.printpattern(n,v=1);
        in.close();
    }
    void printpattern(int n,int v)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(v);
            System.out.println();
        }
    }
}