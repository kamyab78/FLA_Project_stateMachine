package com.company;

public class Transaction {
    State startState;
    State endState;
    Alphabet input;
    Alphabet replace;
    Direction direction;

    public Transaction(State startState, State endState, Alphabet input, Alphabet replace, Direction direction) {
        this.startState = startState;
        this.endState = endState;
        this.input = input;
        this.replace = replace;
        this.direction = direction;
    }

    public State getStartState() {
        return startState;
    }

    public void setStartState(State startState) {
        this.startState = startState;
    }

    public State getEndState() {
        return endState;
    }

    public void setEndState(State endState) {
        this.endState = endState;
    }

    public Alphabet getInput() {
        return input;
    }

    public void setInput(Alphabet input) {
        this.input = input;
    }

    public Alphabet getReplace() {
        return replace;
    }

    public void setReplace(Alphabet replace) {
        this.replace = replace;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
