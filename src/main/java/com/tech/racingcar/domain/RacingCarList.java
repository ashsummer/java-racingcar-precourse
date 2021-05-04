package com.tech.racingcar.domain;

import java.util.ArrayList;

public class RacingCarList {

    private ArrayList<RacingCar> racingCars;

    public RacingCarList(ArrayList<RacingCar> list){
        this.racingCars = list;
    }

    public RacingCar getIndexOfCar(int idx){
        return racingCars.get(idx);
    }

    public int getSize(){
        return racingCars.size();
    }

    public ArrayList<RacingCar> getList(){
        return racingCars;
    }

}
