package unit11;

public class ExchangeSort
{
    public static void main(String[] args)
    {
        int[] arr = {4, 3, 6, 2, 5, 1, 9, 7, 8, 0};
        System.out.println("Original Data:");
        printArr(arr);
        
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("Sorted Data:");
        printArr(arr);
    }
    public static void printArr(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
        System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}