package com.company;

import java.util.ArrayList;
import java.util.List;

public class WW {
    List<Transaction> initial() {
        List<Transaction> result = new ArrayList<>();
        Transaction transaction = new Transaction(State.q0, State.q1 , Alphabet.a , Alphabet.X , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q0, State.q1 , Alphabet.b , Alphabet.Y , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q1, State.q1 , Alphabet.b , Alphabet.b , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q1, State.q1 , Alphabet.a , Alphabet.a , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q1, State.q2 , Alphabet.Y , Alphabet.Y , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q1, State.q2 , Alphabet.X , Alphabet.X , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q1, State.q2 , Alphabet.B , Alphabet.B , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q2, State.q3 , Alphabet.a , Alphabet.X , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q2, State.q3 , Alphabet.b , Alphabet.Y , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q3, State.q3 , Alphabet.b , Alphabet.b , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q3, State.q3 , Alphabet.a , Alphabet.a , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q3, State.q0 , Alphabet.X , Alphabet.X , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q3, State.q0 , Alphabet.Y , Alphabet.Y , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q0, State.q4 , Alphabet.Y , Alphabet.Y , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q0, State.q4 , Alphabet.X , Alphabet.X , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q4, State.q4 , Alphabet.X , Alphabet.a , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q4, State.q4 , Alphabet.Y , Alphabet.b , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q4, State.q5 , Alphabet.B , Alphabet.B , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q5, State.q9 , Alphabet.Z , Alphabet.B , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q5, State.q6 , Alphabet.a , Alphabet.B , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q6, State.q6 , Alphabet.a , Alphabet.a , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q6, State.q6 , Alphabet.b , Alphabet.b , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q6, State.q7 , Alphabet.X , Alphabet.Z , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q7, State.q7 , Alphabet.b , Alphabet.b , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q7, State.q7 , Alphabet.a , Alphabet.a , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q7, State.q7 , Alphabet.Z , Alphabet.Z , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q7, State.q5 , Alphabet.B , Alphabet.B , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q5, State.q8 , Alphabet.b , Alphabet.B , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q8, State.q8 , Alphabet.b , Alphabet.b , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q8, State.q8 , Alphabet.a , Alphabet.a , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q8, State.q8 , Alphabet.Z , Alphabet.Z , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q8, State.q7 , Alphabet.Y , Alphabet.Z , Direction.L);
        result.add(transaction);
        transaction = new Transaction(State.q5, State.q9 , Alphabet.Z , Alphabet.B , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q9, State.q9 , Alphabet.Z , Alphabet.B , Direction.R);
        result.add(transaction);
        transaction = new Transaction(State.q9, State.q10 , Alphabet.B , Alphabet.B , Direction.L);
        result.add(transaction);

        return result;
    }
}
