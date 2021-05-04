package com.tech.racingcar.domain;

public class Index {

    private int idx;

    public Index(int idx){
        this.idx = idx;
    }

    public int getIndex(){
        return idx;
    }

    public void addIndex() {
        idx++;
    }
}
