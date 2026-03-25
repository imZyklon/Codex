/*

    Enter the String:
    C++ 20 is the latest version of C++ yet.
    No. of vowels: 9
    No. of consonants: 16

 */
import java.util.*;
class countalpha
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        countalpha obj = new countalpha();
        System.out.println("Enter the String: ");
        String st = in.nextLine();
        obj.count(st);
        in.close();
    }
    void count(String st)
    {
        int v=0,c=0;
        String ch;
        st=st.toLowerCase();
        for(int i=0;i<st.length();i++)
        {
            ch=String.valueOf(st.charAt(i));
            if(ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u"))
                v++;
            else
            {
                if(st.charAt(i)>='a'&&st.charAt(i)<='z')
                    c++;
            }
        }
        System.out.println("No. of vowels: "+v);
        System.out.println("No. of consonants: "+c);
    }
}