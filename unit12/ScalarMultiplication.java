package unit12;
import java.util.*;

public class ScalarMultiplication
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int rows, columns;
        
        System.out.print("How many rows? ");
        rows = sc.nextInt();
        System.out.print("How many columns" );
        columns = sc.nextInt();
        
        double[][] matrix = new double[rows][columns];
        
        System.out.println("Enter the values of the matrix");
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("");
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        
        double scale;
        System.out.print("What are you multiply the matrix by? ");
        scale = sc.nextInt();
        
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] *= scale;
            }
        }
        
        System.out.println("\nNew Matrix");
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}