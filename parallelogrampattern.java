/*

    Enter the size:
    5
    ******
     ******
      ******
       ******
        ******

 */
import java.util.*;
class parallelogrampattern
{
    public static void main(String args[])
    {
        parallelogrampattern pp=new parallelogrampattern();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=in.nextInt();
        pp.printpattern(n);
        in.close();
    }
    void printpattern(int n)
    {
        int c=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+6;j++)
            {
                if(c++<i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            c=0;
            System.out.println();
        }
    }
}