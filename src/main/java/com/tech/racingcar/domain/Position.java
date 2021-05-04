package com.tech.racingcar.domain;

public class Position {

    private int position;

    public Position(){
        position = 0;
    }

    void run(){
        position++;
    }

    public int getPosition(){
        return position;
    }
}
