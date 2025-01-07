import java.io.*;
public class FileReaderExample
 {

    public static void main(String[] args)
     {
        

        try(FileReader fr = new FileReader("notes.txt"))
        {
         int str = fr.read();//read the input from the file
         while (fr.ready()) 
         {
         System.out.print((char)str);
         str = fr.read();   //read next char which is found in the file that why here we are using two read() method.
         }   
        } 
        catch (Exception e)
         {
            System.out.println(e.getMessage());
        }

System.out.println();


//reading file using BufferedReader

        try (BufferedReader br = new BufferedReader(new FileReader("notes.txt")))
        {
        while (br.ready()) 
        {
        System.out.println(br.readLine());    
        }    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
