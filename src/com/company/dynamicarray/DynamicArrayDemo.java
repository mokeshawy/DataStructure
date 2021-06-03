package com.company.dynamicarray;

public class DynamicArrayDemo {

    public static void main(String[] args){

        DynamicArray<Integer> dArray = new DynamicArray<Integer>();

        dArray.putElement(4);
        System.out.println("Size :" + dArray.getSize());

        dArray.putElement(7);
        System.out.println("Size :" + dArray.getSize());

        System.out.println("Element :" + dArray.getElement(0));
    }
}
