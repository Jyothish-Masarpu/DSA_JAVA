/*
//algorithm to swap first and last node of linked list
void swapFirstLast() {
    if(head == null || head.next == null) {
        return;
    }
    Node first = head;
    Node temp = head;
    // Find second-last node
    while(temp.next.next != null) {
        temp = temp.next;
    }
    Node last = temp.next;

    // Swap first and last
    last.next = first.next;
    temp.next = first;
    first.next = null;

    head = last;
}
    */
