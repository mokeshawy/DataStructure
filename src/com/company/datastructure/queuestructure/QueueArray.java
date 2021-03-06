package com.company.datastructure.queuestructure;

public class QueueArray<T> {

    Object[] ArrayQueue;
    int rear;
    int front;
    int size;
    public QueueArray(int size){

        this.size = size;
        ArrayQueue = new Object[this.size];
        rear = -1;
        front = -1;
    }

    Boolean isFull(){
        return (rear == size-1);
    }

    Boolean isEmpty(){
        return (front == -1 || front>rear);
    }

    public void queue( Object newItem){ // insert item.

        if(isFull()) {
            System.out.println("Queue is full !");
            return;
        }
        rear +=1;
        ArrayQueue[rear] = newItem;

        if(front == -1){ // only execute one time.
            front = 0;
        }
    }

    public T dQueue(){

        if(isEmpty()){
            System.out.println("Queue is empty !");
            return null;
        }
         T objectOut = (T) ArrayQueue[front];
         front +=1;
         return objectOut;
    }
}
