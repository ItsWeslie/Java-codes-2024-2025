public class CeilingOfNumberUsingBinSearch {

    public static void main(String[] args) {
        
        int arr[]={2,3,5,9,14,16,18};
        int target =19;

       int result = ceiling(arr, target);

       System.out.println(result);
    }



    static int ceiling(int arr[],int target)
    {

         int start =0 , end = arr.length-1;

        while (start<=end) {
            
            int mid = start+(end-start)/2;

            if(target>arr[arr.length-1])
            {
                return -1;
            }

            if(target==arr[mid])
            {
                return arr[mid];
            }

            else if(target > arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            
        }
        return arr[start];
    }
    
}
