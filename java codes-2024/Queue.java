class QueueUsingArrays
{
   static final int capacity=30;
   int rear=-1;
   int front=-1;
   int arr[]=new int[capacity];
   
   int isFull()
{
    if (rear==capacity-1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
void enqueue(int data)
{
    if (isFull()==1)
    {
        System.out.println("queue is full");
       
    }
    else
    {
       arr[++rear]=data; 
    }
}

int isEmpty()
{
    if (rear==-1&&front==-1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int dequeue()
{
    if (isEmpty()==1)
    {
        System.out.println("queue is empty");
    }
    
    
        return arr[front++];
    
}

}
public class Queue {
    public static void main(String[] args) {
QueueUsingArrays q = new QueueUsingArrays();
q.enqueue(5);
q.enqueue(6);
q.enqueue(7);
q.enqueue(9);

System.out.println("dequeued element : "+q.dequeue());
System.out.println("dequeued element : "+q.dequeue());
System.out.println("dequeued element : "+q.dequeue());
System.out.println("dequeued element : "+q.dequeue());


        
    }
}


















