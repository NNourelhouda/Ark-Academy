package org.arkAcademy.week2.Day9;

import java.util.Stack;

public class Ch3 {
    public static void main(String args[]) {

        Stack<String> stack = new Stack<>();

        stack.push("Blue");
        stack.push("Yellow");
        stack.push("Red");
        stack.pop(); //removes the last element
        stack.peek();
        stack.push("Black");

        System.out.println("is the stack empty ? " + stack.empty());

        System.out.println("Stack elements: ");
        for (String str : stack) {
            System.out.println(str);
        }
    }
}