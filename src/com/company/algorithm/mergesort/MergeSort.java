package com.company.algorithm.mergesort;

public class MergeSort {

    int [] array;
    int [] tempArray;

    public static void main(String[] args) {

        int[] arr = {1,50,30,10,60,80};

        System.out.println("After Sort");
        for( int i=0; i<arr.length; i++ ){ // n time
            System.out.print(arr[i]+"\t");
        }

        // call prepareForSort fun.
        new MergeSort().PrepareForSort(arr);
        System.out.println("Before Sort");
        for( int i=0; i<arr.length; i++ ){ // n time
            System.out.print(arr[i]+"\t");
        }

    }

    // prepare for sort.
    void PrepareForSort( int [] arr ){
        this.array = arr;
        this.tempArray = new int [arr.length];
        doMergeSort( 0 , arr.length -1);
    }

    // divide to small problem
    void doMergeSort( int lowerIndex , int heightIndex){
        if( lowerIndex < heightIndex) {
            int middle = lowerIndex + (heightIndex - lowerIndex)/2;
            doMergeSort(lowerIndex, middle);  // example ( 1 to 5 )
            doMergeSort(middle + 1, heightIndex); // example ( 6 to 10 )
            MergePart(lowerIndex , middle , heightIndex);
        }
    }

    // merge small problems and sort.
    void MergePart( int lowerIndex , int middle , int heightIndex ){
        for( int i = lowerIndex; i <= heightIndex; i++){
            tempArray[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle+1;
        int k = lowerIndex;
        while ( i <= middle && j <= heightIndex){
            if ( tempArray[i] <= tempArray[j] ){
                array[k] = tempArray[i];
                i++;
            }else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i<=middle){
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }
}

