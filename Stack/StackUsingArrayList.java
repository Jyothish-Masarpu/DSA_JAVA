package Stack;
import java.util.*;
class StackArrayList {
    ArrayList<Integer> stack = new ArrayList<>();
    void push(int data) {
        stack.add(data);
    }
    int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }
    int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.get(stack.size() - 1);
    }
    boolean isEmpty() {
        return stack.isEmpty();
    }
    boolean search(int key) {
        for (int i = stack.size() - 1; i >= 0; --i) {
            if (stack.get(i) == key) {
                return true;
            }
        }
        return false;
    }
    void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = stack.size() - 1; i >= 0; --i) {
            System.out.println(stack.get(i));
        }
    }
}
class StackUsingArrayList{
    public static void main(String[] args) {
        StackArrayList stack=new StackArrayList();
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