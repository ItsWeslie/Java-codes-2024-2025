class AB implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("inside runnable A");

            try {
             Thread.sleep(10);   
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class BC implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("inside runnable B");
        }
    }
}

public class MultiThreadRunnableInter {
    public static void main(String[] args) {
        Runnable a = new AB();
        Runnable b = new BC();

        Runnable c = new Runnable() {
            public void run()
            {
                for (int i = 0; i < 10; i++) {
                    System.out.println("hi");
                }
            }
        };

        Runnable d = ()->
        {
            for (int i = 0; i < 10; i++) {
                System.out.println("hello");
            }
        };

        
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(d);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
