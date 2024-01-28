package org.example;

import java.util.StringJoiner;
import org.apache.commons.lang3.StringUtils;
public class Revers {
    static StringBuilder single_word = new StringBuilder();
    static StringJoiner resultString = new StringJoiner(" ");
    public static String reversString(String str) {
        if(StringUtils.isBlank(str)) {
            return str;
        }

        final String[] words = str.split(" ");

        for (String word : words) {
            singleWordsReverse(word);
            strokeRevers(word);
        }

        String result = String.valueOf(resultString);

        return result;
    }
    public static void singleWordsReverse(String word) {
        char[] wordChar = word.toCharArray();
        for (var single_char : wordChar) {
            if (Character.isAlphabetic(single_char)) {
                single_word.append(single_char);
            }
        }
        single_word.reverse();
    }
     public static void strokeRevers(String word) {
         StringBuilder temp = new StringBuilder(word);
         int index = 0;
         for (int i = 0; i < word.length(); i++) {
             if (Character.isAlphabetic(word.charAt(i))) {
                 temp.setCharAt(i, single_word.charAt(index));
                 index++;
             } else {
                 temp.setCharAt(i, temp.charAt(i));
             }
         }
         resultString.add(temp);
     }
}
