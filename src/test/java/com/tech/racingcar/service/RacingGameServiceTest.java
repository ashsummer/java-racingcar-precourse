package com.tech.racingcar.service;

import com.tech.racingcar.domain.Inputs;
import com.tech.racingcar.domain.RandomNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class RacingGameServiceTest {

    RacingGameService racingGameService = new RacingGameService();

    @Test
    @DisplayName("RacingCar_전진_멈춤_확인")
    void racingCarRunOrStopTest(){
        assertTrue(racingGameService.isRun(new RandomNumber(8)));
        assertFalse(racingGameService.isRun(new RandomNumber(0)));
        assertFalse(racingGameService.isRun(new RandomNumber(4)));
        assertTrue(racingGameService.isRun(new RandomNumber(9)));
    }

    @Test
    @DisplayName("RacingCarList_리스트_생성_확인")
    void checkRacingCars(){
        Inputs inputs = new Inputs(new String[]{"hello","hi"});
        RacingCarList racingCarList = racingGameService.makeRacingCarList(inputs);
        assertEquals(racingCarList.getSize(),2);
        assertTrue(racingCarList.getIndex(0).getCarName().getName().equals("hello"));
        assertTrue(racingCarList.getIndex(1).getCarName().getName().equals("hi"));
        assertTrue(racingCarList.getIndex(0).getCarPosition().getPosition().equals(0));
        assertTrue(racingCarList.getIndex(1).getCarPosition().getPosition().equals(0));
    }

    @Test
    @DisplayName("RacingCar_전진_후진_리스트_반영_확인")
    void checkRacingCarsRunOrStop(){
        Inputs inputs = new Inputs(new String[]{"hello","hi"});
        RacingCarList racingCarList = racingGameService.makeRacingCarList(inputs);
        racingGameService.reflectRacingCarPosition();
    }

}
