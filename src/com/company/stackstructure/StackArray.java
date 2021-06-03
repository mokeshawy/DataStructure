package com.company.stackstructure;

public class StackArray<T> {

    int size;
    Object[] ArrayStack;
    public int top;
    public StackArray( int size ){
        this.size   = size;
        ArrayStack  = new Object[this.size];
        top = -1;
    }


    public void push( Object newItem){ // insert element to stack.
        if(isFull()){ // check stack is full.
            System.out.println("Stack of full !");
        }else {
            top = top+1;
            ArrayStack[top] = newItem;
        }
    }

    public Boolean isFull(){ // function check stack is full.
        return (top == size-1);
    }

    public T pop(){ // delete item from stack.
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }else {
            T item = (T) ArrayStack[top];
            top = top-1;
            return item;
        }
    }

    public Boolean isEmpty(){ // check stack empty.
         return (top < 0);
    }
}
