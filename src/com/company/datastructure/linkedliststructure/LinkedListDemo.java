package com.company.datastructure.linkedliststructure;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedListStructure ls = new LinkedListStructure( new Node<Integer>( 12 , null));

        ls.add(new Node<Integer>(14,null));
        ls.add(new Node<Integer>(16,null));
        ls.add(new Node<Integer>(19,null));
        ls.Display();
        System.out.println("After Delete =>");
        ls.delete();
        ls.Display();
    }
}
