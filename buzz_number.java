/*

    Enter the number:
    147
    Buzz number

    Buzz number: number is divisible by 7 or ends with 7.

 */
import java.util.*;
class buzz_number
{
    public static void main(String args[])
    {
        buzz_number bn = new buzz_number();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n =in.nextInt();
        bn.checkno(n);
        in.close();
    }
    void checkno(int n)
    {
        if(n%7==0||n%10==7)
            System.out.println("Buzz number");
        else
            System.out.println("Not a Buzz number");
    }
}
