package com.company.linearsearchalgorithm;


public class LinearSearch {

    public static void main(String[] args) {

        int size = 1000000;
        int[] array = new int[size]; //==> C0
        for (int i = 0; i<array.length; i++){
            array[i] =i+1;
        }

        int numberSearch    = 900;
        int numberOfTray     = 0;
        for (int i = 0; i<array.length; i++){ //==> n

            numberOfTray++;
            if (array[i] == numberSearch){  //==> C1
                System.out.println("Number is found = "+numberSearch); //==> C2
                System.out.println("Number tray after : "+numberOfTray);
                break; //==> C3
            }
        }

    }
    // C0 + n( C1 + C2 + C3 ) --------> Big-O for Linear search = n
}
