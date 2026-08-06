/*
This is a Leetcode problem. You can find the problem here: 
https://leetcode.com/problems/middle-of-the-linked-list/
Now in this problem, i will write a algorithm only assuming 
that linked list is already created and head is given to us. 
So we will not create a linked list here. We will just write 
a function to find the middle of the linked list.
algorithm:
1. We will use two pointers, slow and fast.
2. Initially, both pointers will point to the head of the linked list.
3. We will move the slow pointer by one step and the fast pointer by two steps.
4. When the fast pointer reaches the end of the linked list, the slow pointer 
   will be at the middle of the linked list.
check for even and odd length of linked list:
1. If the length of the linked list is odd, the slow pointer will point to the
   middle node.
2. If the length of the linked list is even, the slow pointer will point to the
   second middle node.
*/
package LinkedList;
public class MiddleOfLinkedList {
    public Node middleNode(Node head) {
        Node slow=head;
        Node fast=head;
        /*why fast!=null && fast.next!=null because if we have even length 
        of linked list then fast will be null and if we have odd length of 
        linked list then fast.next will be null.*/
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
