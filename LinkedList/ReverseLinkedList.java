/*
This is a leetcode problem. You can find the problem here:
https://leetcode.com/problems/reverse-linked-list/
Now in this problem, i will write a algorithm only assuming 
that linked list is already created and head is given to us. 
So we will not create a linked list here. We will just write 
a function to find the reverse of the linked list.
algorithm:
1. We will use three pointers, prev, curr and next.
2. Initially, prev will be null, curr will be head and next will be null.
3. We will iterate through the linked list and in each iteration, we will do the following:
   a. Store the next node of curr in next.
   b. Change the next of curr to prev.
   c. Move prev to curr.
   d. Move curr to next.
*/
package LinkedList;
public class ReverseLinkedList {
    public Node reverseList(Node head) {
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
