/*

    Enter the size:
    5
    1
    12
    123
    1234
    12345

 */
import java.util.*;
class nipyramid
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        nipyramid nip = new nipyramid();
        System.out.println("Enter the size: ");
        int n= in.nextInt();
        nip.printpattern(n);
        in.close();
    }
    void printpattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
    }
}