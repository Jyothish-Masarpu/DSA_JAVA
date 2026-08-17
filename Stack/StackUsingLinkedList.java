package Stack;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class StackLinkedList {
    Node top;
    void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }
    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    boolean isEmpty() {
        return top == null;
    }
    boolean search(int key) {
        Node temp = top;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
class StackUsingLinkedList{
    public static void main(String[] args) {
        StackLinkedList stack=new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack:");
        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack:");
        stack.display();
        System.out.println("Is 10 in stack: "+stack.search(10));
    }
}
