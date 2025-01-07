import java.util.Scanner;

class Animal
{
    String name,color;
    Scanner s = new Scanner(System.in);

    public Animal()
    {
        System.out.println("enter the name of animal : ");
        name=s.nextLine();
        System.out.println("enter the color of animal : ");
        color=s.nextLine();
    }

    public void display()
    {
        System.out.println(name+"\t"+color);
    }
}
public class TabularGetting {
    public static void main(String[] args) {
        
    
    Animal a[] = new Animal[5];
    

    for(int i = 1;i<5;i++)
    {
         a[i]= new Animal();
    }

    System.out.println("name of the animal"  +  " color of the animal");

    for(int i = 1;i<5;i++)
    {
         a[i].display();
    }
    
}

}
