/*

    Enter the size:
    4
    Enter the value to increment:
    3

    3
    44
    555
    6666

 */
import java.util.*;
class basic_inctri
{
    public static void main(String args[])
    {
        basic_inctri obj = new basic_inctri();
        Scanner in = new Scanner(System.in);
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
                System.out.print(v);
            System.out.println();
            v++;
        }
    }
}