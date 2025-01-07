public class MaxValueInArray {
    public static void main(String[] args) 
    {
        int arr[]={1,4,99,20,10,6,36};

        System.out.println(max(arr));

        
    }
    static int max(int arr[])
    {
        int maxValue=arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if(arr[i]>maxValue)
            {
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
    
}
