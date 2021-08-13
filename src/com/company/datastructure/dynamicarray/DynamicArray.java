package com.company.datastructure.dynamicarray;

import java.util.Arrays;

public class DynamicArray <T>{

    Object[] data;
    int size;

    public DynamicArray(){
        size = 0;
        data = new Object[1];
    }

    // get size for array.
    public int getSize(){
        return data.length;
    }

    // get element from array.
    public T getElement( int index){

        return (T) data[index];
    }

    // insert element to array.
    public void putElement( int element){
        ensureCapacity(size+1);
        data[size++] = element;
    }

    // when insert element.
    public void ensureCapacity( int mainCapacity){
        // get old size.
        int oldCapacity = data.length;
        // when mainCapacity > old size for array equal size of array asterisk 2
        if( mainCapacity > oldCapacity){
            int newCapacity = oldCapacity * 2;

            // when delete element newCapacity equal mainCapacity.
            if( newCapacity < mainCapacity){ // when delete element.
                newCapacity = mainCapacity;
            }
            data = Arrays.copyOf(data , newCapacity);
        }
    }
}
