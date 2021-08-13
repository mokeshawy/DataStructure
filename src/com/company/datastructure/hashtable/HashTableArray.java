package com.company.datastructure.hashtable;

public class HashTableArray<T> {

    EntryHashtable[] arrayHash;
    int size;
    public HashTableArray( int size){
        this.size = size;
        arrayHash = new EntryHashtable[this.size];

        for( int i=0; i<arrayHash.length; i++){
            arrayHash[i] = new EntryHashtable<T>();
        }
    }

    int getHash( int key){
        return key%size;
    }

    public void put(int key , T value){

        int index = getHash(key);
        EntryHashtable arrayValue = arrayHash[index];
        EntryHashtable newItem = new EntryHashtable<T>(key , value);
        newItem.next = arrayValue.next;
        arrayValue.next = newItem;
    }

    public T get( int key){
        T value = null;
        int index = getHash(key);
        EntryHashtable arrayValue = arrayHash[index];

        while (arrayValue !=null){
            if( arrayValue.getKey() == key){
                value = (T)arrayValue.getValue();
                break;
            }
            arrayValue = arrayValue.next;
        }
        return value;
    }
}
