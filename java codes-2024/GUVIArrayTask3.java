/*You are given with an array. For each element present in the array your task is to print the next smallest than that number. If it is not smallest print -1

Input Description:
You are given a number ‘n’ representing size of array. And n space separated numbers.

Output Description:
Print the next smallest number present in array and -1 if no smallest is present

Sample Input :
7
10 7 9 3 2 1 15
Sample Output :
7 3 3 2 1 -1 -1
*/


import java.util.Scanner;
public class GUVIArrayTask3{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int num=obj.nextInt(),arr[] = new int[num],m,j;
        
        for(int i=0;i<num;i++)
        {
            arr[i]=obj.nextInt();
        }
       
        for(int i=0;i<num;i++)
        {
            for( j=i+1,m=arr[i];j<num;j++)
            {
            if(m>arr[j])
            {
                m=arr[j];
                break;
            }
            

            }

            if(i==num-1)
            {
                System.out.print((m==arr[i]?"-1":m));
                break; 
            }
            else
            {
            System.out.print((m==arr[i]?"-1":m)+" ");
            }
        }
        
        
    }
}