/*

    Enter the size:
    5

    1
    2	3
    4	5	6
    7	8	9	10
    11	12	13	14	15

 */
import java.util.*;
class right_tnp
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        right_tnp obj = new right_tnp();
        System.out.println("Enter the size: ");
        int n=in.nextInt();
        System.out.println();
        obj.printpattern(n);
        in.close();
    }
    void printpattern(int n)
    {
        int v=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print(v++ + "\t");
            System.out.println();
        }
    }
}