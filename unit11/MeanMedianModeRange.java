package unit11;

public class MeanMedianModeRange
{
    public static void main (String[] args)
    {
        double[] dataset = {94.1, 100, 100, 100, 100, 98.2, 84.8, 87.9, 93.9, 92, 97, 27.5, 98, 100, 100, 100, 100, 100, 83, 100, 57.3, 93.9, 100, 80.9, 60.5, 100, 100, 75.5, 79.5};
        
        for(int i = 0; i < dataset.length - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < dataset.length; j++)
            {
                if(dataset[j] < dataset[min])
                {
                    min = j;
                }
            }
            double temp = dataset[min];
            dataset[min] = dataset[i];
            dataset[i] = temp;
        }
        
        System.out.println("Sorted Data:");
        printdataset(dataset);
        
        //find mean
        double sum = 0, mean;
        for(int i = 0; i < dataset.length; i++)
        {
            sum += dataset[i];
        }
        mean = sum/dataset.length;
        
        //find median
        double median;
        median = dataset[dataset.length/2];
        
        //find mode
        double longest = 0, tracker = 0;
        double mode = 0;
        for(int i = 1; i < dataset.length; i++)
        {
            if(dataset[i] == dataset[i-1])
            {
                tracker++;
            }
            if((dataset[i] != dataset[i-1] && tracker > longest) || (i == dataset.length-1 && tracker > longest))
            {
                longest = tracker;
                tracker = 0;
                mode = dataset[i-1];
            }
        }
        
        //find range
        double range;
        range = dataset[dataset.length-1] - dataset[0];
        
        //print results
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }
    public static void printdataset(double[] dataset)
    {
        for(int i = 0; i < dataset.length; i++)
        {
        System.out.print(dataset[i] + " ");
        }
        System.out.println("\n");
    }
}