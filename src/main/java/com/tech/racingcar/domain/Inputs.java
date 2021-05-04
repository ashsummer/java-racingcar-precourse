package com.tech.racingcar.domain;

public class Inputs {

    private String[] inputs;

    public Inputs(String[] inputs){
        this.inputs = inputs;
    }

    public int getSize(){
        return inputs.length;
    }
}
