public class SelectionSort{  
    public static void selectionSort(int[] arr)
    {  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int temp = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[temp]){  
                    temp= j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[temp];   
            arr[temp] = arr[i];  
            arr[i] = smallerNumber;  
        }  
        
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {9,14,3,2,43,11,58,22};  
        
        selectionSort(arr1);
         
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
}