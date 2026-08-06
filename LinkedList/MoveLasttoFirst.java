/*
In our linked list package, go through singly linked list and here i will only 
write a function to move last node to first node(If u need to check implementation 
copy this method to singlylinkedlist).
*/
package LinkedList;
public class MoveLasttoFirst {
    void moveLastToFirst(Node head) {
        if(head==null || head.next==null) {
            return;
        }
        Node temp=head;
        while(temp.next.next!=null) {
            temp=temp.next;
        }
        Node last=temp.next;
       //why temp.next means temps pointing to second last node and temp.next is pointing to last node.
        temp.next=null;
        last.next=head;
        head=last;
    }
}
