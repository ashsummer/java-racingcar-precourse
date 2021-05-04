package com.tech.racingcar.util;

import com.tech.racingcar.domain.Input;
import com.tech.racingcar.domain.Inputs;

public class RacingCarValidatorUtil {

    static RacingCarValidatorUtil instance;

    private RacingCarValidatorUtil(){}

    public static RacingCarValidatorUtil getInstance(){
        if(instance == null){
            instance = new RacingCarValidatorUtil();
        }
        return instance;
    }

    public boolean checkStringLength(Input input) {
        return input.getLength() >= 1 && input.getLength() <= 5;
    }

    public boolean checkRacingCarParticipantsCount(Inputs inputs) {
        return inputs.getSize() > 1 && inputs.getSize() < 101;
    }

    public boolean checkTotalRacingCount(Input input) {
        if(input.getLength() == 3 && input.isEqualsWithString("100")) return true;
        if(input.getLength() == 1 && input.isEqualsWithString("0")) return false;
        return input.getLength() < 3;
    }

    public boolean checkNumber(Input input) {
        String regExp = "^[1-9]+$";
        return input.checkMatch(regExp);
    }
}
