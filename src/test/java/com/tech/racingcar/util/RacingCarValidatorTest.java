package com.tech.racingcar.util;

import com.tech.racingcar.domain.Input;
import com.tech.racingcar.domain.Inputs;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RacingCarValidatorTest {

    private final RacingCarValidatorUtil validator = RacingCarValidatorUtil.getInstance();

    @Test
    @DisplayName("input_String_글자수_체크_5자이내_성공_6자이상_0자_실패")
    void checkInputStringLengthTest(){
        assertTrue(validator.checkStringLength(new Input("tommy")));
        assertFalse(validator.checkStringLength(new Input("tommyCar")));
        assertFalse(validator.checkStringLength(new Input("")));
    }

    @Test
    @DisplayName("racing_car_참가수_2개_이상부터_게임시작")
    void checkRacingCarParticipantsTest(){
        assertTrue(validator.checkRacingCarParticipantsCount(new Inputs(new String[]{"hi", "hello"})));
        assertFalse(validator.checkRacingCarParticipantsCount(new Inputs(new String[]{"hi"})));
    }

    @Test
    @DisplayName("racing_횟수_숫자유무")
    void isNumberTest(){
        assertTrue(validator.checkNumber(new Input("4")));
        assertFalse(validator.checkNumber(new Input("aaa")));
    }

    @Test
    @DisplayName("racing_횟수_1이상_100이하_받기")
    void checkTotalRacingCountRangeTest(){
        assertTrue(validator.checkTotalRacingCount(new Input("1")));
        assertFalse(validator.checkTotalRacingCount(new Input("0")));
        assertFalse(validator.checkTotalRacingCount(new Input("101")));
        assertTrue(validator.checkTotalRacingCount(new Input("100")));
    }

}
