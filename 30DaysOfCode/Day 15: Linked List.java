import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    public static  Node insert(Node head,int data) {
        //Complete this method
        Node newNode = new Node(data);
        Node temp = head;
        
        // base case! List is empty...
        if(head == null){
            return head = newNode;
        }
        
        // iterate until the end of the list
        while(head.next!=null){
            head = head.next;
        }

        // set the pointer to the newest node
        head.next = newNode;
       
        // return reference to the head
        return temp;
    }
    
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
