/*
This is a simple implementation of a stack using an array in Java. 
The StackArray class provides methods to push, pop, peek, check 
if the stack is empty, and display the contents of the stack. The 
main method demonstrates how to use the StackArray class by creating a 
stack, pushing elements onto it, displaying the stack, peeking at the top 
element, popping an element, and displaying the stack again.
*/
package Stack;
class StackArray {
    int[] stack;
    int top;
    StackArray(int size) {
        stack = new int[size];
        top = -1;
    }
    void push(int data) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
    }
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    boolean isEmpty() {
        return top == -1;
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; --i) {
            System.out.println(stack[i]);
        }
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack:");
        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack:");
        stack.display();
    }
}
