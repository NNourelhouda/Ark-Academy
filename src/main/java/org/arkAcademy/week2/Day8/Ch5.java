package org.arkAcademy.week2.Day8;
import java.io.*;
public class Ch5 {
    public static void main(String[] args) {
        // Initializing String variable with null value
        String ptr = null;
        // Checking if ptr.equals null or works fine.
        try
        {
                    if (ptr.equals("gfg"))
                        System.out.print("Same");
                    else
                        System.out.print("Not Same");
        }
        catch(NullPointerException e)
                {
                    System.out.print("NullPointerException Caught");
                }
            }
        }


