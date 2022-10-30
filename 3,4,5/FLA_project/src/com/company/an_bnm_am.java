package com.company;

import java.util.ArrayList;
import java.util.List;

public class an_bnm_am {
    List<Transaction> initial(){
        List<Transaction> result = new ArrayList<>();
        Transaction transaction = new Transaction(State.q0, State.q1 , Alphabet.a , Alphabet.B , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q1, State.q1 , Alphabet.a , Alphabet.a , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q1, State.q1 , Alphabet.X , Alphabet.X , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q1, State.q2 , Alphabet.b , Alphabet.X , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q2, State.q2 , Alphabet.a , Alphabet.a , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q2, State.q2 , Alphabet.X , Alphabet.X , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q2, State.q0 , Alphabet.B , Alphabet.B , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q0, State.q3 , Alphabet.X , Alphabet.B , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q3, State.q3 , Alphabet.X , Alphabet.B , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q3, State.q4 , Alphabet.b , Alphabet.B , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q4, State.q4 , Alphabet.b , Alphabet.b , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q4, State.q4 , Alphabet.a , Alphabet.a , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q4, State.q5 , Alphabet.B , Alphabet.B , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q5, State.q6 , Alphabet.a , Alphabet.B , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q6, State.q6 , Alphabet.a , Alphabet.a , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q6, State.q6 , Alphabet.b , Alphabet.b , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q6, State.q7 , Alphabet.B , Alphabet.B , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q7, State.q4 , Alphabet.b , Alphabet.B , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q7, State.q8 , Alphabet.B , Alphabet.B , Direction.L);
        result.add(transaction);

        return result;
    }
}
