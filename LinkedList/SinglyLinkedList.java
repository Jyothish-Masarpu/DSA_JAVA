/*
 In this file, you will implement a Singly Linked List data structure.
A singly linked list is a collection of nodes where each node contains 
data and a reference (or link) to the next node in the sequence. 
The last node in the list points to null, indicating the end of the list.
we will implement the following methods in this class:
1. insertFirst(int data): Inserts a new node with the given data at the 
   beginning of the list.
2. insertLast(int data): Inserts a new node with the given data at the end 
   of the list.
3. insertPos(int data, int pos): Inserts a new node with the given data at 
   the specified position in the list. If the position is invalid, it prints 
   an error message.
4. search(int key): Searches for a node with the given key in the list. 
   Returns true if found, otherwise false.
5. deleteFirst(): Deletes the first node of the list. If the list is empty, 
   it prints list is empty message.
6. deleteLast(): Deletes the last node of the list. If the list is empty, 
   it prints list is empty message.
7. deletekey(int key): Deletes the first occurrence of a node with the given key 
   in the list. If the key is not found, it prints an no element found message.
8. disp(): Displays the elements of the list in order, from head to tail, 
   followed  by "null" to indicate the end of the list. If the list is empty, 
   it prints list is empty message.    
*/
package LinkedList;
class Node {
	int data;
	Node next;
	Node(int data) {
		this.data=data;
		this.next=null;
	}
}
class Linkedlist {
	Node head;
	void insertFirst(int data) {
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
	}
	void insertLast(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
	}
	//10->20->30->40->50
	void insertPos(int data,int pos) {
		if(pos<1) {
			System.out.println("Invalid position");
			return;
		}
		if(pos==1) {
			insertFirst(data);
			return;
		}
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node temp=head;
		for(int i=1; i<pos-1 && temp!=null; ++i) {
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("Position out of range");
			return;
		}
		Node newNode=new Node(data);
		newNode.next=temp.next;
		temp.next=newNode;
	}
	boolean search(int key) {
		Node temp=head;
		while(temp!=null && temp.data!=key) {
			temp=temp.next;
		}
		if(temp==null) {
			return false;
		}
		return true;
	}
	void deleteFirst() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		head=head.next;
	}
	void deleteLast() {
        if(head==null) {
			System.out.println("List is empty");
			return;
		}
		if(head.next==null){
		    head=null;
		    return;
		}
		Node temp=head;
		while(temp.next.next!=null){
		    temp=temp.next;
		}
		temp.next=null;
	}
	void deletekey(int key){
	    if(head==null) {
			System.out.println("List is empty");
			return;
		}
		if(head.data==key){
		    deleteFirst();
		    return;
		}
		Node temp=head;
		while(temp.next!=null && temp.next.data!=key){
		    temp=temp.next;
		}
		if(temp.next==null){
		    System.out.println("No element found");
		    return;
		}
		temp.next=temp.next.next;
	}
	void disp() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("null");
	}
}
class SinglyLinkedList {
	public static void main (String[] args) {
		Linkedlist list=new Linkedlist();
		list.insertLast(20);
		list.insertLast(30);
		list.insertLast(40);
		list.insertLast(50);
		System.out.println("After inserting elements: ");
		list.disp();
		list.insertFirst(10);
		System.out.println("\nAfter inserting element at first: ");
		list.disp();
		list.insertPos(25,3);
		System.out.println("\nAfter inserting element at position: ");
		list.disp();
		System.out.println("\nElement found?: "+list.search(35));
		list.deleteFirst();
		System.out.println("After deleting element at first: ");
		list.disp();
		list.deleteLast();
		System.out.println("\nAfter deleting element at last: ");
		list.disp();
		list.deletekey(25);
		System.out.println("\nAfter deleting element at position: ");
		list.disp();
	}
}
