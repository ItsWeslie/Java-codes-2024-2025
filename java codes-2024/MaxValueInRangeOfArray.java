public class MaxValueInRangeOfArray {
    public static void main(String[] args) {

        int arr[]={1,4,99,20,10,6,36};

        System.out.println(maxRange(arr,3,7));
        
    }

    static int maxRange(int arr[],int start,int end)
    {
        int maxValue=arr[start];

        for (int i = start; i < end; i++) 
        {
        if(arr[i]>maxValue)
        {
            maxValue=arr[i];
        }    
        }
        return maxValue;
    }
}
