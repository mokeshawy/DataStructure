package com.company.queuestructure;

import com.company.linkedliststructure.Node;

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
