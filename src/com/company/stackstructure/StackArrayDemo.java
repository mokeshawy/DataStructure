package com.company.stackstructure;

public class StackArrayDemo {

    public static void main(String[] args){

        // Simple stack array
        /*StackArray<Integer> Stack = new StackArray<Integer>(5);
        Stack.push(12);
        Stack.push(14);
        Stack.push(16);
        Stack.push(18);
        Stack.push(20);

        System.out.println("Stack = "+Stack.top);
        System.out.println(Stack.pop());
        System.out.println("Stack = "+Stack.top);
        System.out.println(Stack.pop());
        System.out.println("Stack = "+Stack.top);
        System.out.println(Stack.pop());
        System.out.println("Stack = "+Stack.top);
        System.out.println(Stack.pop());
        System.out.println("Stack = "+Stack.top);
        System.out.println(Stack.pop());
        System.out.println(Stack.pop());*/



        // Stack dynamic array.
        // Simple stack array
        StackArrayDynamic<Integer> StackDynamic = new StackArrayDynamic<Integer>(5);
        StackDynamic.push(12);
        StackDynamic.push(14);
        StackDynamic.push(16);
        StackDynamic.push(18);
        StackDynamic.push(20);
        System.out.println("StackDynamic = "+StackDynamic.top);
        System.out.println("Size = " + StackDynamic.ArrayStack.length);
        StackDynamic.push(29);
        StackDynamic.push(90);
        StackDynamic.push(80);
        System.out.println("StackDynamic = "+StackDynamic.top);
        System.out.println("Size = " + StackDynamic.ArrayStack.length);
    }
}
