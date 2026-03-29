import java.util.*;
class binary_search
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        binary_search obj = new binary_search();
        int n;
        int[] arr = new int[100];
        System.out.println("Enter the length of the array: ");
        n=in.nextInt();
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.println("Enter the target number: ");
        int target = in.nextInt();
        obj.bs(arr,target,n);
        in.close();
    }
    void bs(int[] arr,int target,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(target==arr[i])
            {
                System.out.print("Element Found");
                System.exit(0);
            }
        }
        System.out.print("Element Not Found");
    }
}