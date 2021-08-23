package unit10;

public class MeanMedianMode
{
    public static void main (String[] args)
    {
        int[] arr = {1, 5, 19, 87, 87, 87, 99, 100, 100};
        
        //find mean
        double sum = 0, mean;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        mean = sum/arr.length;
        
        //find median
        int median;
        median = arr[arr.length/2];
        
        //find mode
        int longest = 0, tracker = 0;
        int mode = 0;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] == arr[i-1])
            {
                tracker++;
            }
            if(arr[i] != arr[i-1] && tracker > longest)
            {
    		longest = tracker;
    		tracker = 0;
    		mode = arr[i-1];
            }
	}
        
        //print results
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }
}