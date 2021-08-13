package com.company.datastructure.hashtable;

public class EntryHashtable<T> {

    int key;
    T value;
    EntryHashtable next;
    public EntryHashtable( int key , T value){

        this.key = key;
        this.value = value;
        next = null;
    }

    public EntryHashtable(){
        next = null;
    }
    public int getKey(){

        return key;
    }

    public T getValue(){

        return value;
    }
}
