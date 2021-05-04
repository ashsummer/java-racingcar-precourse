package com.tech.racingcar.service;

import com.tech.racingcar.domain.RandomNumber;

public class RacingGameService {

    public boolean isRun(RandomNumber number) {
        return number.getNumber() > 4;
    }
}
