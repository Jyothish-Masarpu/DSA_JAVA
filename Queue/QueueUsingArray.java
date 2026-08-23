class QueueUsingArray{
    public static void main(String[] args) {
        QueueArray q=new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Queue elements: ");
        q.display();
        System.out.println("Is 20 present: "+q.search(20));
        System.out.println("Peek: "+q.peek());
        q.dequeue();
        System.out.println("Queue elements after dequeue: ");
        q.display();
    }
}
class QueueArray{
    int[] queue;
    int front;
    int rear;
    QueueArray(int size){
        queue=new int[size];
        front=0;
        rear=0;
    }
    void enqueue(int value){
        if(rear==queue.length-1){
            System.out.println("Queue is full");
            return;
        }
        queue[rear++]=value;
    }
    void dequeue(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("dequeue operation: "+queue[front++]);
    }
    int peek(){
        if(isEmpty()) return -1;
        return queue[front];
    }
    boolean isEmpty(){
        return front==rear;
    }
    boolean search(int value){
        for(int i=front;i<rear;i++){
            if(queue[i]==value) return true;
        }
        return false;
    }
    void display(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}
