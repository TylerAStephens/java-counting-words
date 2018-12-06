package com.TylerStephens;

public class Main {

    public static void main(String[] args) {

        String str = "How many words are in this sentence?";
        System.out.println("The number of words in this sentence are " + countWord(str));
    }


    private static int countWord(String str) {
        int wordCount = 1;

        for(int i = 0; i < str.length(); i++) {
            // initialize for loop
            if(str.charAt(i) == ' ' && i < str.length() - 1 && str.charAt(i+1) != ' ') {
            // preventing index out of bounds exception
                wordCount++;
            }
        }
        return wordCount;
    }
}

