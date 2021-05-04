package com.tech.racingcar.util;

import com.tech.racingcar.domain.RandomNumber;

import java.util.Random;

public class RandomNumberUtil {

    private final Random random = new Random();

    public RandomNumber getRandomNumber() {
        int number = random.nextInt(9);

        return new RandomNumber(number);
    }

}
