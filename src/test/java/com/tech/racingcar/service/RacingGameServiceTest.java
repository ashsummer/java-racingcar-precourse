package com.tech.racingcar.service;

import com.tech.racingcar.domain.Inputs;
import com.tech.racingcar.domain.RacingCarList;
import com.tech.racingcar.domain.RandomNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        assertTrue(racingCarList.getIndexOfCar(0).getCarName().getName().equals("hello"));
        assertTrue(racingCarList.getIndexOfCar(1).getCarName().getName().equals("hi"));
        assertTrue(racingCarList.getIndexOfCar(0).getCarPosition().getPosition() == 0);
        assertTrue(racingCarList.getIndexOfCar(1).getCarPosition().getPosition() == 0);
    }


}
