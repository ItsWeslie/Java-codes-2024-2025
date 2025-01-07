
import java.util.Scanner;
enum Demo
{
    
    Demo1(2000),Demo2(1500);
    private int values;

    private Demo(int values)
    {
        this.values=values;
    }

    public int getValues() {
        return values;
    }

    public void setValues(int values) {
        this.values = values;
    }




}

public class EnumWithOwnClass {
    public static void main(String[] args) {
        //A Simple Hello World
        //Getting input via STDIN
        Scanner s = new Scanner(System.in);

        // Demo d = Demo.Demo1;
        // System.out.println(d.getValues());

        for(Demo dd : Demo.values())
        {
            System.out.println(dd+" "+dd.getValues());
        }
       
    }
}