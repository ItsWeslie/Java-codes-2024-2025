

public class EnumDemo {

    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;

        Week()
    {
        System.out.println("constructor called for : "+this);
    }
    
    }

    

    public static void main(String[] args) {
      
        Week dayOfWeek = Week.Monday;
        System.out.println(dayOfWeek);
      
        try {
            Week week = Week.valueOf("uesday");//illegal declaration of valuesOf() function it must include the value of which is inside the enum constant 
            System.out.println(week);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       


 Week week2 = Week.valueOf("Tuesday");//proper declaration
 System.out.println(week2);

        for(Week day:Week.values())
        {
            System.out.print(day+" ");
        }
    System.out.println(week2.ordinal());
    
    }
}
