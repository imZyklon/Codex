/*

    Enter the size:
    5
    *****
    *****
    *****
    *****
    *****

 */
import java.util.*;
class squarefillpattern
{
    public static void main(String args[])
    {
        squarefillpattern sfp = new squarefillpattern();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n= in.nextInt();
        sfp.printpattern(n);
        in.close();
    }
    void printpattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}