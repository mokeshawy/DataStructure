package com.company.queuestructure;

public class QueueDemo {

    public static void main(String[] args) {

        QueueArray<String> queue = new QueueArray<String>(4);

        queue.queue("Mohamed");
        queue.queue("Eid");
        queue.queue("Ahmed");
        queue.queue("Eid");

        System.out.println(queue.dQueue());
        System.out.println(queue.dQueue());
        System.out.println(queue.dQueue());
        System.out.println(queue.dQueue());

    }
}
