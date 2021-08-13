package com.company.datastructure.queuestructure;

public class QueueLinkedListDemo {

    public static void main(String[] args) {


        NodeDouble<Integer> nodeQueue= new NodeDouble<Integer>(12,null,null);
        QueueLinkedList<Integer> queueLinkedList= new QueueLinkedList<Integer>(nodeQueue);

        queueLinkedList.queue(new NodeDouble(13,null,null));
        queueLinkedList.queue(new NodeDouble(15,null,null));
        queueLinkedList.queue(new NodeDouble(16,null,null));
        queueLinkedList.queue(new NodeDouble(19,null,null));

    }
}
