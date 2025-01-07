
class InnerMulti extends Thread {

    public void run(){
    {
        for(int i=0;i<=5;i++)
             System.out.println("hi");
        }
       
    }

    
}

class OuterMulti extends Thread {

    public void run(){
    {
        for(int i=0;i<=5;i++)
             System.out.println("vanakam");
        }
       
    }

    
}
public class Multi {
    public static void main(String[] args) {

        InnerMulti i = new InnerMulti();
        OuterMulti o = new OuterMulti();
        i.start();
        o.start();
        o.setPriority(10);
        System.out.println(o.isAlive());
        try {
             i.sleep(2000);
        } catch (Exception e) {
            
        }
       
    }
}
