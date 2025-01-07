class Reverse{

    void reverse(int a[])
    {
        int i=0,j=a.length-1;
        while(i<j)
        {
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        for(i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
        

    }

}
public class ReverseArray {
   public static void main(String[] args) 
   {
     int arr[]={1,2,3,4,5};
     Reverse r = new Reverse();
    
     for(int i=0;i<arr.length;i++)
    {System.out.print(arr[i]+" ");}
    System.out.println();
    r.reverse(arr);        
    }
}
