package com.tech.racingcar;

import com.tech.racingcar.service.RacingGameService;

public class Launcher {

    private static final RacingGameService racingGameService = new RacingGameService();

    public static void main(String[] args) {
        racingGameService.playGame();
    }
}
