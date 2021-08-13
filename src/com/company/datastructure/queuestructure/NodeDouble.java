package com.company.datastructure.queuestructure;

public class NodeDouble<T> {

    public T value;
    public NodeDouble next;
    public NodeDouble previous;

    public NodeDouble( T value , NodeDouble next , NodeDouble previous){
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
}
