import java.io.*;
public class FileWriterExample {
    public static void main(String[] args) {
        try(FileWriter f = new FileWriter("notes.txt",true))
        {
f.write(" welcome to java programming");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


        try (BufferedReader b = new BufferedReader(new FileReader("notes.txt"))){

            System.out.println(b.readLine());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try(BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt",true)))
        {
bw.write(" hello students");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


        try (BufferedReader b = new BufferedReader(new FileReader("notes.txt"))){

            System.out.println(b.readLine());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
// FileWriterExample f = new FileWriterExample();
//         System.out.println(f.getClass().getName());
    }
}
