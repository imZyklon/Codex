import java.util.*;
class linear_search
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        linear_search ls = new linear_search();
        System.out.println("Enter the size of the array: ");
        int n=in.nextInt();
        int arr[] = new arr[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the element to search for- ");
        int ele=in.nextInt();
        ls.search(arr,ele);
        in.close();
    }
    void search(int arr[], int key)
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key) {
                System.out.println("Element found at index: " + (i + 1));
                System.exit(0);
            }
            System.out.println("Element not found!!!");
        }
    }
}