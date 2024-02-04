package org.arkAcademy.week2.Day9;

import java.util.Stack;

public class Ch3 {
    int top;
    int capacity;
    int[] stack;

    public Ch3() {
        top = -1;//array is empty
        capacity = 10 ;
        stack = new int[capacity];
    }

    // Push operation
    public void push(int element) {
            if (top < capacity - 1) {
                stack[++top] = element;
                System.out.println("Pushed: " + element);
            } else {
                System.out.println("Stack overflow. Cannot push element.");
            }
        }

        // Pop operation
        public void pop() {
            if (!isEmpty()) {
                int poppedElement = stack[top--];
                System.out.println("Popped: " + poppedElement);
            } else {
                System.out.println("Stack underflow. Cannot pop element.");
            }
        }

        // Peek operation
        public void peek() {
            if (!isEmpty()) {
                System.out.println("Peek: " + stack[top]);
            } else {
                System.out.println("Stack is empty. Cannot peek.");
            }
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        public static void main(String[] args) {
            Ch3 stack = new Ch3();

            stack.push(5);
            stack.push(10);
            stack.peek();
            stack.pop();
            stack.pop();
            stack.peek();
            stack.pop();
        }
    }
