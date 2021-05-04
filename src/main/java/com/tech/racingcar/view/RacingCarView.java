package com.tech.racingcar.view;

import com.tech.racingcar.domain.GamePlayCount;
import com.tech.racingcar.domain.Inputs;
import com.tech.racingcar.domain.RacingCarStatus;

import java.util.Scanner;

public class RacingCarView {

    private final Scanner scanner = new Scanner(System.in);
    private final String INPUT_RACING_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)기준으로 구분)";
    private final String INPUT_PLAY_GAME_COUNT = "시도할 횟수는 몇 회인가요?";

    public void printCarPosition(RacingCarStatus racingCarStatus) {
        System.out.println(racingCarStatus.getRacingCarStatus());
    }

    public void print(String message){
        System.out.println(message);
    }

    public void printLn() {
        System.out.println();
    }

    public String getCarsName() {
        System.out.println(INPUT_RACING_CAR_NAME);
        return scanner.next();
    }

    public String getTotalGamePlayCount() {
        System.out.println(INPUT_PLAY_GAME_COUNT);
        return scanner.next();
    }
}
