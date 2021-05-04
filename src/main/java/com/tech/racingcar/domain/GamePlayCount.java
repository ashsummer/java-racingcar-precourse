package com.tech.racingcar.domain;

public class GamePlayCount {

    private int count;

    public GamePlayCount(int count){
        this.count = count;
    }

    public int getCount(){
        return count;
    }

    public void addCount(){
        count++;
    }
}
