package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("please enter a string:");
        Scanner scanner = new Scanner( System. in);
        String input = scanner. nextLine();
        Utils utils = new Utils();
        Alphabet [] inputString =  utils.splitAndConvert(input);
        List<Transaction> transactions = new ArrayList<>();
        State finalState ;
        State currentState = State.q0;

        System.out.println("Select a Turing machine:");
        System.out.println("1.WcW^r");
        System.out.println("2.a^n b^n+m a^m");
        System.out.println("3.WW");

        String turingMachine = scanner.nextLine();
        if(turingMachine.equals("1")) {
            WcWr wcWr = new WcWr();
            transactions = wcWr.initial();
            finalState = State.q8;
        }
        else if(turingMachine.equals("2")){
            an_bnm_am an_bnm_am = new an_bnm_am();
            transactions = an_bnm_am.initial();
            finalState = State.q8;
        }
        else if(turingMachine.equals("3")){
            WW ww = new WW();
            transactions = ww.initial();
            finalState = State.q10;
        }
        else {
            System.out.println("invalid choice");
            return;
        }




        int index = 1;
        int directionEffect = 0;

        boolean deadLock = false;

        int innerIndex = 0;

        while(!deadLock){
            innerIndex = 0;
            for (Transaction transaction : transactions){
                if (transaction.startState.equals(currentState)){
                    if (transaction.input.equals(inputString[index])){


                        inputString[index] = transaction.replace;

                        if (transaction.direction.equals(Direction.R))
                            directionEffect = 1;
                        else
                            directionEffect = -1;

                        index  += directionEffect;
                        currentState = transaction.endState;

                        utils.print(transaction,inputString);

                        break;
                    }
                }
                innerIndex ++;
            }
            if (innerIndex == transactions.size() )
                deadLock  = true;
        }

        if (currentState.equals(finalState))
            System.out.println("True");
        else
            System.out.println("False");

    }


}
