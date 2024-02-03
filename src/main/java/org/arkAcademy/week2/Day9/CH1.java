package org.arkAcademy.week2.Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Array Operations
public class CH1 {
    public static void main(String[] args) {

                int[] array = {5, 12, 7, 15, 3, 9};

                int sum = 0;
                for (int value : array) {
                    sum += value;
                }
                System.out.println("Sum of array elements: " + sum);

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int value : array) {
                    if (value > max) {
                        max = value;
                    }
                    if (value < min) {
                        min = value;
                    }
                }
                System.out.println("Maximum value: " + max);
                System.out.println("Minimum value: " + min);

                reverseArray(array);
                System.out.print("Reversed array: ");
                for (int value : array) {
                    System.out.print(value + " ");
                }
            }
            private static void reverseArray(int[] array) {
                int start = 0;
                int end = array.length - 1;

                while (start < end) {
                    // Swap elements at start and end indices
                    int temp = array[start];
                    array[start] = array[end];
                    array[end] = temp;

                    // Move indices towards the center
                    start++;
                    end--;
                }
            }
        }



