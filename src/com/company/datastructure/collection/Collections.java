package com.company.datastructure.collection;

import java.util.*;

public class Collections {

    public static void main(String[] args) {

        // Dynamic array = ArrayList --> in java , in kotlin

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Mohamed"); // O of ( n )
        System.out.println(arrayList.get(0)); // O of ( 1 ) best case Senario
        arrayList.remove(0); // O of ( n )


        // LinkedList = LinkedList
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Mohamed"); // O of ( n )

        // Stack DynamicArray
        Stack<String> stackArray = new Stack<String>();
        stackArray.push("Mohamed"); // O of ( 1 )
        stackArray.pop(); // O of ( 1 )

        // Queue
        Queue<String> queue = new LinkedList<String>();
        queue.add("Mohamed");
        queue.poll();


        PriorityQueue<String> pQueue = new PriorityQueue<String>(1);


        // HashTable.
        HashMap<Integer, Integer> hashTable = new HashMap<>();
        hashTable.put(1,3);
        System.out.println(hashTable.get(1));

    }
}
