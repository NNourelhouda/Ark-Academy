package org.arkAcademy.week2.Day8.CH4;
public class Main {
    public static void main(String[] args) throws Exception {
        validateAge(-3);
    }
    public static void validateAge(int age) throws Exception {
        if(age < 0){
            throw new AgeLessThanZeroException("Age entered is invalid");
        }
    }
}
