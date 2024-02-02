package org.arkAcademy.week2.Day8;

public class Ch8 {
    public static void main(String args[])
    {
        try {
            int a = 30, b = 0;
            int c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);

            String txt = null; //null value
            System.out.println(txt.charAt(0));

            String line = "This is like chipping "; // length is 22
            char v = line.charAt(24); // accessing 25th element
            System.out.println(v);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
