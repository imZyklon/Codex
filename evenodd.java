/*

    Enter the number:
    5
    odd

 */
import java.util.*;
class evenodd
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        evenodd eo = new evenodd();
        System.out.println("Enter the number: ");
        int n=in.nextInt();
        eo.display(n);
        in.close();
    }
    void display(int n)
    {
        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("odd");
    }
}