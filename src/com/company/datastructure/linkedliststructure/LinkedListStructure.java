package com.company.datastructure.linkedliststructure;

public class LinkedListStructure {


    Node head; // first node.
    public LinkedListStructure(Node head ){
        this.head =head;
    }

    public void add(Node newNode){  // add node. Big-O = O of ( 1 ) because add first node in one step only.
        newNode.next = head;
        head = newNode;
    }

    public void delete(){   // delete first node. Big-O = O of ( 1 ) because delete first node in one step only.
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
