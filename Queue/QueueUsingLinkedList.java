public class QueueUsingLinkedList {
   public static void main(String[] args) {
    QueueLL q=new QueueLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Queue elements:");
        q.display();
        System.out.println("Peek: " + q.peek());
        System.out.println("Search 20: " + q.search(20));
        q.dequeue();
        System.out.println("After dequeue:");
        q.display();
   } 
}
class QueueLL{
    Node front;
    Node rear;
    void enqueue(int value){
        Node node=new Node(value);
        if(front==null){
            front=rear=node;
            return;
        }
        rear.next=node;
        rear=node;
    }
    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Removed: "+front.data);
        front=front.next;
        if(front==null){
            rear=null;
        }
    }
    int peek(){
        if(isEmpty()) return -1;
        return front.data;
    }
    boolean isEmpty(){
        return front==null;
    }
    boolean search(int value){
        Node temp=front;
        while(temp!=null){
            if(temp.data==value) return true;
            temp=temp.next;
        }
        return false;
    }
    void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
