package com.tech.racingcar.service;

import com.tech.racingcar.domain.*;
import com.tech.racingcar.util.RacingCarValidatorUtil;

import java.util.ArrayList;

public class RacingGameService {

    private static final RacingCarValidatorUtil validator = RacingCarValidatorUtil.getInstance();

    public boolean isRun(RandomNumber number) {
        return number.getNumber() > 4;
    }

    public RacingCarList makeRacingCarList(Inputs inputs) {

        ArrayList<RacingCar> list = new ArrayList<>();

        for(int i = 0; i < inputs.getSize(); i++){
            list.add(new RacingCar(new CarName(inputs.getIndexOfInput(i).getString())));
        }

        return new RacingCarList(list);
    }
}
