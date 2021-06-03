package com.company.simplearray;

public class SimpleArrayDemo {

    public static void main(String[] args) {
	// write your code here

        // Simply Array in java
        int[] number = new int[5];

        number[0] = 11;
        number[1] = 2;
        number[2] = 4;
        number[3] = 42;
        number[4] = 12;

        System.out.println("Simple Array :");
        for( int i = 0;  i<number.length; i++){
            System.out.print(number[i] + "\t");
        }


        // Array of Object.
        System.out.println("\n Array of Object :");
        Students[] stu = new Students[3];
        stu[0] = new Students("Mohamed" , 1);
        stu[1] = new Students("Keshawy" , 3);
        stu[2] = new Students("Anas" , 4);

        for( Students students : stu ){
            System.out.println(students.name + ":"+ students.id);
        }


        // Tow dimension
        System.out.println("\n Tow dimension Array :");
        int[][] data = new int[3][3];

        data[0][0] = 1;
        data[0][1] = 3;
        data[0][2] = 5;
        data[1][0] = 9;
        data[1][1] = 13;
        data[1][2] = 16;
        data[2][0] = 18;
        data[2][1] = 20;
        data[2][2] = 4;

        for (int i =0; i<3; i++){
            for (int j =0; j<3; j++){

                System.out.print(data[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}


