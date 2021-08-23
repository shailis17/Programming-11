package unit11;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = {4, 3, 6, 2, 5, 1, 9, 7, 8, 0};
        System.out.println("Original Data:");
        printArr(arr);
        
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - i - 1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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