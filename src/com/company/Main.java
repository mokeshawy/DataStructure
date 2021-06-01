package com.company;

public class Main {

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
            System.out.println(number[i]);
        }


        // Array of Object.
        System.out.println("Array of Object :");
        Students[] stu = new Students[3];
        stu[0] = new Students("Mohamed" , 1);
        stu[1] = new Students("Keshawy" , 3);
        stu[2] = new Students("Anas" , 4);

        for( Students students : stu ){
            System.out.println(students.name + ":"+ students.id);
        }

    }

    // class for students.
    public static class Students{

        String name;
        int id;

        public Students( String name , int id ){

            this.name = name;
            this.id = id;
        }
    }


}


