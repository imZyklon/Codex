/*

    Enter the String:
    abcdfe
    efdcba

 */
import java.util.*;
class reverse_string
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        reverse_string obj = new reverse_string();
        System.out.println("Enter the String: ");
        String str=in.nextLine();
        obj.revstr(str);
        in.close();
    }
    void revstr(String str)
    {
        char[] ch=str.toCharArray();
        int p1=0,p2=str.length()-1;
        while(p1<p2)
        {
            char temp=ch[p1];
            ch[p1]=ch[p2];
            ch[p2]=temp;
            p1++;
            p2--;
        }
        System.out.println(String.valueOf(ch));
    }
}