package com.company.queuestructure;

import com.company.linkedliststructure.Node;

public class QueueLinkedList<T> {

    NodeDouble<T> rear;
    NodeDouble<T> front;
    public QueueLinkedList(NodeDouble newNode ){
        rear = newNode;
        front = newNode;
    }

    public void queue(NodeDouble newNode){
        rear.next = newNode;
        newNode.next = null;
        newNode.previous = rear;
        rear = newNode;
    }

    public T deQueue(){
        T value = front.value;
        front   = front.next;
        front.previous = null;
        return value;
    }
}
