package com.example.lesson6android3;


public class StringMethod {


    public String mirrorWords(String words) {
        StringBuilder buffer = new StringBuilder(words);
        buffer.reverse();
        words = buffer.toString();
        return words;
    }

    public String swapWords(String words) {
        String[] strings = words.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i]).append(" ");
        }
        return sb.toString().trim();
    }

}
