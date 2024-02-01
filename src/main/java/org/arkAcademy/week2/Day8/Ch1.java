package org.arkAcademy.week2.Day8;

public class Ch1 {
        public static void main(String args[])
        {
            try{
                int a[]=new int[12];
                a[21] = 9;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println ("ArrayIndexOutOfBounds Exception occurred");
                System.out.println ("You tried to access an element at an index that is out of bounds");
            }
        }
    }
