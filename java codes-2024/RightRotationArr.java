import java.util.Scanner;

class RightRotationArr 
{    
    public static void main(String[] args) 
    {    
              Scanner s = new Scanner(System.in);
           int [] arr = new int [] {1, 2, 3, 4, 5};     
             System.out.println("enter the no of rotation");
           int n = s.nextInt();    
                
           System.out.println("Original array: ");    
           for (int i = 0; i < arr.length; i++) 
           {     
               System.out.print(arr[i] + " ");     
           }      
               
             
           for(int i = 0; i < n; i++)
           {    
               int j, last;    
               
               last = arr[arr.length-1];    
               
               for(j = arr.length-1; j > 0; j--)
               {    
                      
                   arr[j] = arr[j-1];    
               }    
               
               arr[0] = last;    
           }           
           System.out.println();    
    
           System.out.println("Array after right rotation: ");    
           for(int i = 0; i< arr.length; i++){    
               System.out.print(arr[i] + " ");    
           }    
       }    
   } 