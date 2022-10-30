package com.company;

import java.util.Arrays;

class Utils {
    Alphabet [] splitAndConvert(String input){
        input = "B"+input+"B";
        String [] temp = input.split("");
        Alphabet [] result = new Alphabet[temp.length];
        for (int i = 0;i<temp.length;i++){
            if(temp[i].equals("a"))
                result[i] = Alphabet.a;
            if(temp[i].equals("b"))
                result[i]=Alphabet.b;
            if (temp[i].equals("c"))
                result[i] = Alphabet.c;
            if (temp[i].equals("B"))
                result[i] = Alphabet.B;
        }
        return result;
    }

    void print(Transaction transaction, Alphabet[] currentString){
        String stringBuilder = transaction.startState.toString() +
                " ==== ( " +
                transaction.input.toString() +
                " ," +
                transaction.replace.toString() +
                " ," +
                transaction.direction.toString() +
                " )====> " +
                transaction.endState.toString() +
                "           " +
                "Turing tape:  " +
                Arrays.toString(currentString);
        System.out.println(stringBuilder);
    }
}
