// 242. Valid Anagram
package arrays_and_hashing;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String first = "anagram";
        String second = "nagaram";

        System.out.println(isAnagram2(first, second));
    }

    public static boolean isAnagram2(String s, String t) {
        /**
         * Algorithm:
         * 1. Check if the lengths of the two input strings are different.
         *    If they are not of the same length, they cannot be anagrams.
         *    Return false in this case.
         */
        if (s.length() != t.length()) return false;

        // Create an array to store the count of each alphabet (26 lowercase letters)
        int[] charCount = new int[26]; // array size of 26 alphabets

        /**
         * 2. Loop through each character in the input strings.
         *    a. Increment the count for the character in the first string (s).
         *    b. Decrement the count for the character in the second string (t).
         *    This step ensures that both strings have the same characters with the same frequency.
         */
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) - 'a'); // Optional: Debug print
            charCount[s.charAt(i) - 'a']++; // Increment count for character in string s
            charCount[t.charAt(i) - 'a']--; // Decrement count for character in string t
        }

        /**
         * 3. After processing both strings, loop through the charCount array.
         *    If any count is not zero, it means the characters are not balanced,
         *    and the strings cannot be anagrams. Return false.
         */
        for (int count : charCount) {
            if (count != 0) {
                return false; // Not a valid anagram
            }
        }

        // 4. If all characters are balanced (count is zero), return true as the strings are anagrams.
        return true;
    }

    public static boolean isAnagram1(String s, String t) {
        // Convert the first string to a character array and sort it
        char[] charArrayFirst = s.toCharArray();
        Arrays.sort(charArrayFirst);

        // Convert the second string to a character array and sort it
        char[] charArraySecond = t.toCharArray();
        Arrays.sort(charArraySecond);

        // Compare the sorted character arrays to check for anagram equality
        boolean areEqual = Arrays.equals(charArrayFirst, charArraySecond);

        // Return the result of the comparison
        return areEqual;
    }

}
