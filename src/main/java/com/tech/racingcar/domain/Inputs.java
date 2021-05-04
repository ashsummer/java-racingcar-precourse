package com.tech.racingcar.domain;

public class Inputs {

    private Input[] inputs;

    public Inputs(String[] strings){
        inputs = new Input[strings.length];
        for(int i = 0; i < strings.length; i++){
            inputs[i] = new Input(strings[i]);
        }
    }

    public int getSize(){
        return inputs.length;
    }

    public Input getIndexOfInput(int idx){
        return inputs[idx];
    }


}
