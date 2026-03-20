/*

    Enter the size:
    4
    1111
    2222
    3333
    4444

 */
import java.util.*;
class squareincrement
{
    public static void main(String args[])
    {
        squareincrement si = new squareincrement();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=in.nextInt();
        si.printpattern(n);
        in.close();
    }
    void printpattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(i+1);
            System.out.println();
        }
    }
}