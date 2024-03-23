package org.example;

public class MyString {

    public static int indexOfString(String s1, String s2, int pos) {
        int counter = 0;
        int index = 0;
        boolean flag = false; // To track where we first found the first letter of s2.
        if (s1.isEmpty() || s2.isEmpty()){ // Check if either of the strings are empty.
            return -1;
        }
        counter = 0; // To track how many of the letter in s2 are observed in s1.
        for (int i = pos; i < s1.length(); i++){ // Iterating through s1 starting from the position specified.
            if (s1.charAt(i) == s2.charAt(counter) && counter == 0){ // Comparing the first letter of s2 with letter of s1.
                index = i; // Storing the position at which s2 is observed in s1.
                counter++; // Jumping to the next letter of s2.
                flag = true; //
            }
            if (s1.charAt(i) == s2.charAt(counter) && flag){
                counter++; // Jumping to the next letter of s2 in case we already observed all the letters from the beginning up to that letter.
            }
            if (s1.charAt(i) != s2.charAt(counter)){
                flag = false; // Making sure that once we didn't see the letters matching anymore,
                // reset the values of variables back to their initial value.
                counter = 0;
            }
        }
        return index;
    }
}
