package unit11;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] arr = {4, 3, 6, 2, 5, 1, 9, 7, 8, 0};
        System.out.println("Original Data:");
        printArr(arr);
            
        for(int i = 1; i < arr.length - 1; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
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