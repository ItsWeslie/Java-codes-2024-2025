import java.io.*;
import java.util.*;
class Motor
{
    void motorCycle()
    {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
    }
}
class Cycle extends Motor
{
    void cycle()
    {
        super. motorCycle(); 
      System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
      
    }
}
public class HackerRankOverride2 {

    public static void main(String[] args) {
        Cycle c = new Cycle();
        c.cycle();
    }
}