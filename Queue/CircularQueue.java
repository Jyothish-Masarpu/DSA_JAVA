class CircularQueue {
    public static void main(String[] args) {
        QueueArray1 q = new QueueArray1(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        q.dequeue();
        q.dequeue();
        System.out.println("After dequeue:");
        q.display();
        q.enqueue(60);
        q.enqueue(70);
        System.out.println("After adding 60 and 70:");
        q.display();
        System.out.println("Peek: " + q.peek());
        System.out.println("Search 40: " + q.search(40));
        System.out.println("Search 100: " + q.search(100));
    }
}
class QueueArray1 {
    int[] queue;
    int front;
    int rear;
    int size;
    QueueArray1(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }
    void enqueue(int value) {
        if(size == queue.length) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = value;
        rear = (rear + 1) % queue.length;
        size++;
    }
    void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Removed: " + queue[front]);
        front = (front + 1) % queue.length;
        size--;
    }
    int peek() {
        if(isEmpty()) {
            return -1;
        }
        return queue[front];
    }
    boolean isEmpty() {
        return size == 0;
    }
    boolean search(int value) {
        for(int i = 0; i < size; ++i) {
            int index = (front + i) % queue.length;
            if(queue[index] == value) {
                return true;
            }
        }
        return false;
    }
    void display() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for(int i = 0; i < size; ++i) {
            int index = (front + i) % queue.length;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }
}
