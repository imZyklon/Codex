/*

    Enter the number:
    1634
    Armstrong Number

 */
import java.util.*;
class armstrong_number
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        armstrong_number an = new armstrong_number();
        System.out.println("Enter the number: ");
        int n=in.nextInt();
        an.checkno(n);
        in.close();
    }
    void checkno(int n)
    {
        String l=n+"";
        int len=l.length(),d,s=0;
        while(n!=0)
        {
            d=n%10;
            s=s+(int)Math.pow(d,len);
            n=n/10;
        }
        if(s==Integer.parseInt(l))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}