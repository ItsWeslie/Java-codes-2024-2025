class Animal
{
    void walk()
    {
        System.out.println("I am walking");
    }
}
class Bird extends Animal
{
    void fly()
    {
        System.out.println("I am flying");
    }
}
public class HackerRankLoop1 {
 public static void main(String[] args) {
    Bird bird = new Bird();
      bird.walk();
      bird.fly();
 }   
}
