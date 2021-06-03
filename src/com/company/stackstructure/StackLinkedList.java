package com.company.stackstructure;

import com.company.linkedliststructure.Node;

public class StackLinkedList {


    Node head; // first node.
    public StackLinkedList(Node head ){
        this.head =head;
    }

    public void push(Node newNode){  // add node. Big-O = O of ( 1 ) because add first node in one step only.
        newNode.next = head;
        head = newNode;
    }

    public void pop(){   // delete first node. Big-O = O of ( 1 ) because delete first node in one step only.
        head = head.next;
    }

    public void Display(){ // print data from node.
        Node n = head;
        while ( n !=null){
            System.out.println(n.value);
            n = n.next;
        }
    }
}
