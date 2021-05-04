package com.tech.racingcar.domain;

public class GameInfo {

    private GamePlayCount gameTotalPlayCount;
    private RacingCarList racingCarList;

    public GameInfo(GamePlayCount gamePlayCount, RacingCarList racingCarList){
        this.gameTotalPlayCount = gamePlayCount;
        this.racingCarList = racingCarList;
    }

    public GamePlayCount getGamePlayCount() {
        return gameTotalPlayCount;
    }

    public RacingCarList getRacingCarList() {
        return racingCarList;
    }

    public boolean isFinish(GamePlayCount gamePlayCount){
        return gamePlayCount.getCount() == gameTotalPlayCount.getCount();
    }
}
