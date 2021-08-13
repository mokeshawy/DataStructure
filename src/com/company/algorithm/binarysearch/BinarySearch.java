package com.company.algorithm.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {


        int size = 1000000;
        int[] array = new int[size]; //==> C0
        for (int i = 0; i<array.length; i++){
            array[i] =i+1;
        }


        //Binary search.
        int numberSearch    = 900;
        int low = 0;
        int height = array.length -1;
        int mid = 0;
        boolean isFound = false;
        int numberOfTray     = 0;

        while (!isFound){

            if( low > height){
                System.out.println("Number is not Found");
                break;
            }
            mid = low + ((height-low) / 2);

            numberOfTray++;
            if(array[mid] == numberSearch){
                System.out.println("Number is Found");
                System.out.println("Number tray after : "+numberOfTray);
                break;
            }
            if(array[mid] < numberSearch){
                low = mid +1;
            }
            if(array[mid] > numberSearch){
                height = mid -1;
            }
        }
    }
}
