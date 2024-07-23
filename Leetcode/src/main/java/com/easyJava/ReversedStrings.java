package com.easyJava;

/**
 A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

 For this exersise, given a string (A), print "Yes" if it is a palindrome, print "No" otherwise.

 Constraints
 String A will consist of at most 50 lower case english letters.

 Stretch - configure the code so that it doesn't matter if there are uppercase letters in the string.

 Sample Input:
 madam

 Sample Output:
 Yes
 -------------------

 Sample Input:
 tiger

 Sample Output:
 No
 -------------------

 Stretch Sample Input:
 Racecar

 Stretch Sample Output:
 Yes

 */

public class ReversedStrings {

    public static void reversedString(String A){
        String reversed = new StringBuilder(A).reverse().toString();
        System.out.println(A.equalsIgnoreCase(reversed) ? "Yes" : "No");
    }
}