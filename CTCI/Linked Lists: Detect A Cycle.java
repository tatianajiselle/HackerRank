/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    
    for(int i = 0; i <= 100; i++){
        if(head == null){
            return false;
        }
        head = head.next;
    }
    
    return true;
}