import java.util.*;
class transpose_matrix
{
    public static void main(String args[])
    {
        transpose_matrix obj = new transpose_matrix();
        Scanner in = new Scanner(System.in);
        int m,n;
        int[][] mat = new int[100][100];
        int[][] mt = new int[100][100];
        System.out.println("Enter the dimensions: ");
        m=in.nextInt();
        n=in.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                mat[i][j]=in.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                mt[i][j]=mat[j][i];
        }
        System.out.println("Elements after swapping: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(mt[i][j]+" ");
            System.out.println();
        }
    }
}