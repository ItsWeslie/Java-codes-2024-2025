class Cake{

    int cakeCount=0;
    public synchronized void check()
    {
        cakeCount++;
    }
}

class CakeCounc implements Runnable 
{
Cake c;

CakeCounc(Cake c)
{
    this.c=c;
}
public void run()
{
    for(int i=0;i<10;i++)
    {
        c.check();
    }
}
    
}
class Synchro {
    public static void main(String[] args) {
        
       Cake c = new Cake();
       Thread tc1 = new Thread(new CakeCounc(c));
       Thread t2 = new Thread(new CakeCounc(c));
        tc1.start();
        t2.start();

        try {

            tc1.join();
            t2.join();
            
        } catch (Exception e) {
            
        }

        System.out.println(c.cakeCount);
        
    }
}
