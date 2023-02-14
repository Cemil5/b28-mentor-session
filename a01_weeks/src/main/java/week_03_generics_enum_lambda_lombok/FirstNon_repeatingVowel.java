package week_03_generics_enum_lambda_lombok;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and return its index.
If it doesn't exist, return -1. Assume that all the characters of the String is lowercase.
( Do not use String class functions other than charAt() and length() )

 */
public class FirstNon_repeatingVowel {
    public static void main(String[] args) {
        int index = getIndexOfFirstNonRepeatingVowel_nestedLoop("google");
        System.out.println(index);
        System.out.println(getIndexOfFirstNonRepeatingVowel_nestedLoop("bbddeeaffgi"));
        System.out.println(getIndexOfFirstNonRepeatingVowel_nestedLoop("aaabbbeeeoouu"));

        System.out.println(getIndexOfFirstNonRepeatingVowel_map("google"));
        System.out.println(getIndexOfFirstNonRepeatingVowel_map("bbddeeaffgi"));
        System.out.println(getIndexOfFirstNonRepeatingVowel_map("aaabbbeeeoouu"));

        System.out.println(returnVowelIndexSolution2("google"));
        System.out.println(returnVowelIndexSolution2("bbddeeaffgi"));
        System.out.println(returnVowelIndexSolution2("aaabbbeeeoouu"));
        System.out.println(returnVowelIndexSolution2("cydeo"));
    }

    public static int returnVowelIndexSolution2(String str){
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i)==str.charAt(j)){
                        count++;
                    }
                }
                if(count == 1){
                    index = i;
                }
            }
        }
        return index;
    }

    static int getIndexOfFirstNonRepeatingVowel_map(String input){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
               if (!map.containsKey(ch)){
                   map.put(ch, i);
               } else {
                   map.put(ch, -5);
               }
            }
        }
        if (!map.isEmpty()){
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                int index = e.getValue();
                if ( index != -5){
                    return index;
                }
            }
        }
        return -1;
    }

    public static int getIndexOfFirstNonRepeatingVowel_nestedLoop(String input) {
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                int vowelCount = 0;
                for (int j = 0; j < length; j++) {
                    if (ch == input.charAt(j)) {
                        vowelCount++;
                    }
                }
                if (vowelCount == 1)
                    return i;
            }
        }
        return -1;
    }
}