package com.company.algorithm.heapsort;

public class HeapSorting {

    public static void main(String[] args) {

        int[] array = {1,50,30,10,60,80};

        System.out.println("Before Sort");
        for( int i=0; i< array.length; i++ ){ // n time
            System.out.print(array[i]+"\t");
        }


        System.out.println("\nAfter Sort");
        preSort(array);
        for( int i=0; i< array.length; i++ ){ // n time
            System.out.print(array[i]+"\t");
        }
    }

    static int total;
    public static void heapify( int[] array , int parentIndex){
        int leftNodeIndex = parentIndex*2;
        int rightNodeIndex = parentIndex*2+1;

        int newIndex = parentIndex;

        if(leftNodeIndex < total && array[leftNodeIndex] > array[parentIndex]){
            newIndex = leftNodeIndex;
        }

        if(rightNodeIndex < total && array[rightNodeIndex] < array[parentIndex]){
            newIndex = rightNodeIndex;
        }
        if( newIndex !=parentIndex){
            swap( array , parentIndex , newIndex);
            heapify(array , newIndex);
        }
    }

    private static void swap(int[] array, int parentIndex, int newIndex) {
        int temp = array[parentIndex];
        array[parentIndex] = array[newIndex];
        array[newIndex] = temp;

    }

    static void  preSort( int[] array ){

        total = array.length-1;

        for( int i = total/2; i>=0; i--){
            heapify(array , i);
        }

        for(int i=total; i>=0; i--){
            swap(array,0,i);
            total--;
            heapify(array,0);
        }
    }
}
