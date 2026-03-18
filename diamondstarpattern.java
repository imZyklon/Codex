/*

    Enter the value for n:
    7
       *
      ***
     *****
    *******
     *****
      ***
       *

 */
import java.util.*;
class diamondstarpattern
{
    public static void main(String args[])
    {
        diamondstarpattern dsp = new diamondstarpattern();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n = in.nextInt();
        dsp.printpattern(n);
        in.close();
    }
    void printpattern(int n)
    {
        int v1=n/2,v2=v1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<=n/2)
                {
                    if(i+j>=v1&&i+j<=v2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else
                {
                    if(i+j>=v1&&i+j<=v2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            if(i<n/2)
                v2+=2;
            if(i>=n/2)
                v1+=2;
            System.out.println();
        }
    }
}