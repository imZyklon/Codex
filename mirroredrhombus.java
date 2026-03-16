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
class mirroredrhombus
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        mirroredrhombus obj = new mirroredrhombus();
        System.out.println("Enter the size: ");
        int n=in.nextInt();
        obj.printpattern(n);
        in.close();
    }
    void printpattern(int n)
    {
        int d=n,c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=n*2-1;j++)
            {
                if(j<d)
                    System.out.print(" ");
                else if(c!=n)
                {
                    System.out.print("*");
                    c++;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
            c=0;
            d--;
        }
    }
}