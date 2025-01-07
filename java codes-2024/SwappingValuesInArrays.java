import java.util.Arrays;//its compulsory to declare as util.Arrays because it is not visible while use util.*;

public class SwappingValuesInArrays 
{
public static void main(String[] args) 
{
int arr[]={4,5,6,10,99};

swap(arr, 2, 4);

System.out.println(Arrays.toString(arr));    
}

static void swap(int arr[],int index1,int index2)
{
    int temp=arr[index1];
    arr[index1]=arr[index2];
    arr[index2]=temp;
}
}
