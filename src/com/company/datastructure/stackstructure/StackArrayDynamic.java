package com.company.datastructure.stackstructure;

import java.util.Arrays;

public class StackArrayDynamic <T> {

    int size;
    public Object[] ArrayStack;
    public int top;
    public StackArrayDynamic( int size ){
        this.size   = size;
        ArrayStack  = new Object[this.size];
        top = -1;
    }


    public void push( Object newItem){ // insert element to stack.
        ensureCapacity(top+2);
        top = top+1;
        ArrayStack[top] = newItem;

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

    // when insert element.
    public void ensureCapacity( int mainCapacity){
        // get old size.
        int oldCapacity = ArrayStack.length;
        // when mainCapacity > old size for array equal size of array asterisk 2
        if( mainCapacity > oldCapacity){
            int newCapacity = oldCapacity * 2;

            // when delete element newCapacity equal mainCapacity.
            if( newCapacity < mainCapacity){ // when delete element.
                newCapacity = mainCapacity;
            }
            ArrayStack = Arrays.copyOf(ArrayStack , newCapacity);
        }
    }
}
