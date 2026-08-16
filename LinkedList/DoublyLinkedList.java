package LinkedList;
class Node {
    int data;
    Node prev;
    Node next;
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DLL {
    Node head;
    // Insert at beginning
    void insertFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }
    // Insert at end
    void insertLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }
    // Insert at given position
    void insertPos(int data, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            insertFirst(data);
            return;
        }
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; ++i) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        Node node = new Node(data);
        node.next = temp.next;
        temp.next.prev = node;
        node.prev = temp;
        temp.next = node;
    }
    // Delete first node
    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }
    // Delete last node
    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }
    // Delete node by key
    void deleteKey(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == key) {
            deleteFirst();
            return;
        }
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("No element found");
            return;
        }
        if (temp.next == null) {
            deleteLast();
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
    // Search element
    boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    // Display from beginning
    void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Display from end
    void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertLast(15);
        list.insertLast(20);
        list.insertLast(25);
        list.insertLast(35);
        list.insertFirst(10);
        list.insertFirst(5);
        System.out.println("Display from front:");
        list.displayForward();
        System.out.println("Display from end:");
        list.displayBackward();
        list.insertPos(30, 6);
        System.out.println("\nAfter inserting 30 at position 6:");
        System.out.println("Display from front:");
        list.displayForward();
        System.out.println("Display from end:");
        list.displayBackward();
        System.out.println("\nSearch 25 found: " + list.search(25));
        list.deleteFirst();
        System.out.println("\nAfter deleting first:");
        list.displayForward();
        list.deleteLast();
        System.out.println("After deleting last:");
        list.displayForward();
        list.deleteKey(25);
        System.out.println("After deleting key 25:");
        list.displayForward();
    }
}