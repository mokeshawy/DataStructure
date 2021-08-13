package com.company.algorithm.bubblesort;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {1,50,30,10,60,80};

        System.out.println("Before Sort");
        for( int i=0; i<array.length; i++ ){ // n time
            System.out.print(array[i]+"\t");
        }

        BubbleSorting(array);
        System.out.println("\nAfter Sort");
        for( int i=0; i<array.length; i++ ){ // n time
            System.out.print(array[i]+"\t");
        }
    }

    // Big O --> O ( n^2 )
    public static void BubbleSorting( int[] array){
        int n = array.length;
        int temp = 0;
        for( int i=0; i<n; i++ ){ // n time
            for ( int j=1; j<(n -1); j++){ // n time

                if( array[j-1] > array[j]){ // C0 time
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
