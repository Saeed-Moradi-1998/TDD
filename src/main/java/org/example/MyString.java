package org.example;

public class MyString {

    public static int indexOfString(String s1, String s2, int pos) {
        if (s2.isEmpty()){
            return -1; // This condition checks if s2 is empty or not.
        }
        if (s1.isEmpty()){
            return -1;
        }
        return -2; // This is the initial implementation of this function which has a blank body and return a wrong number.
    }
}
