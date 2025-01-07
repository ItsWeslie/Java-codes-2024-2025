import java.util.Scanner;

class RotateArr
{
static void reverse(int a[],int start,int end)
{
    while(start<end)
    {
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
        start++;
        end--;
    }
}
    static void rotate(int a[],int k)
    {
        k=k%a.length;
        if(k<0)
        {
            k=k+a.length;
        }
        

        reverse(a, 0, k-1);//here it is divide array from 0 to target
        reverse(a, k, a.length-1);//here it is starts from target value to end length of the the array
        reverse(a, 0, a.length-1);//here it rotate entire array
    }

}
public class RotatingArray {
    public static void main(String[] args) {
        RotateArr rarr= new RotateArr();
        int a[]={1,2,3,4,5};
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        rarr.rotate(a, 1);

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        Scanner s = new Scanner(System.in);
        int firstIndex,secondIndex;
        firstIndex=s.nextInt();
        secondIndex=s.nextInt();
        System.out.println(a[firstIndex]+"  "+a[secondIndex]);


    }
}
