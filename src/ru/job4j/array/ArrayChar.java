package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int indexPref = 0; indexPref < pref.length; indexPref++) {
            if (word[indexPref] != pref[indexPref]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
