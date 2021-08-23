package unit12;
import java.util.*;

public class MatrixAddition 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];
        
        System.out.println("Enter the values of Matrix A");
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[i].length; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the values of Matrix B");
        for(int i = 0; i < B.length; i++)
        {
            for(int j = 0; j < B[i].length; j++)
            {
                B[i][j] = sc.nextInt();
            }
        }
        
        //Add A and B
        for(int i = 0; i < C.length; i++)
        {
            for(int j = 0; j < C[i].length; j++)
            {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        
        //Print C
        System.out.println("\nMatrix A + Matrix B");
        for(int i = 0; i < C.length; i++)
        {
            for(int j = 0; j < C[i].length; j++)
            {
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }
    }

}