package org.example;

import java.util.StringJoiner;

public class Revers {
    public static String reversString(String str) {

        String checkNull = str;
        if(checkNull.trim().equals("")) {
            return str;
        }
        String[] wordsArr = str.split(" ");

        StringJoiner result = new StringJoiner(" ");
        StringBuilder sub_word = new StringBuilder();
        //12121
        for (var word : wordsArr) {
            var index = 0;
            StringBuilder temp = new StringBuilder(word);
            String[] wordChar = word.split("");

            for (var w_char : wordChar) {
                if (!w_char.matches("-?\\d+")) sub_word.append(w_char);
            }
            sub_word.reverse();

            for (int i = 0; i < word.length(); i++) {
                if (!Character.isDigit(word.charAt(i))) {
                    temp.setCharAt(i, sub_word.charAt(index));
                    index++;
                } else {
                    temp.setCharAt(i, temp.charAt(i));
                }
            }
            result.add(temp);
        }
        String r = String.valueOf(result);
        return r;
    }

}
