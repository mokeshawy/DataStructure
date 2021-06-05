package com.company.hashtable;

public class HashTableDemo {

    public static void main(String[] args) {


        HashTableArray<String> hashTable = new HashTableArray<String>(10);
        hashTable.put(10,"Mohamed");
        hashTable.put(11,"Keshawy");
        hashTable.put(5,"Anas");
        System.out.println(hashTable.get(5));

    }
}
