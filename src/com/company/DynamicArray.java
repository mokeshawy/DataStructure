package com.company;

import java.util.Arrays;

public class DynamicArray {

    int[] data;
    int size;

    public static void main(String[] args){

        DynamicArray dArray = new DynamicArray();

        dArray.putElement(4);
        System.out.println("Size :" + dArray.getSize());

        dArray.putElement(7);
        System.out.println("Size :" + dArray.getSize());

        System.out.println("Element :" + dArray.getElement(0));
    }

    public DynamicArray(){
        size = 0;
        data = new int[1];
    }

    // get size for array.
    public int getSize(){
        return data.length;
    }

    // get element fro array.
    public int getElement( int index){
        return data[index];
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
