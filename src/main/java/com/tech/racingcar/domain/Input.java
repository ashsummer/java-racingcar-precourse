package com.tech.racingcar.domain;

public class Input {

    private final String input;

    public Input(String input){
        this.input = input;
    }

    public int getLength(){
        return input.length();
    }

    public boolean checkMatch(String regExp){
        return input.matches(regExp);
    }

    public boolean isEqualsWithString(String string){
        return input.equals(string);
    }
}
