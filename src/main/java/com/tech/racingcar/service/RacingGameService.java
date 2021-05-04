package com.tech.racingcar.service;

import com.tech.racingcar.domain.*;
import com.tech.racingcar.util.RacingCarValidatorUtil;
import com.tech.racingcar.util.RandomNumberUtil;
import com.tech.racingcar.view.RacingCarView;

import java.util.ArrayList;
import java.util.Collections;

public class RacingGameService {

    private static final String INPUT_IS_NOT_NUMBER = "숫자를 입력해주세요";
    private static final String INPUT_NUMBER_RANGE_IS_OVER = "1 ~ 100 사이 숫자를 입력하세요";
    private static final String INPUT_LENGTH_IS_WRONG = "5자리 이하의 이름을 입력하세요(쉼표(,)로 구분하세요)";
    private static final String INPUT_RACING_CAR_COUNT_BELOW_TWO = "차이름을 2개이상 입력해주세요(쉼표(,)로 구분해주세요))";

    private static final RacingCarValidatorUtil validator = RacingCarValidatorUtil.getInstance();
    private final RandomNumberUtil randomNumberUtil = new RandomNumberUtil();
    private final RacingCarView view = new RacingCarView();
    private GameInfo gameInfo;

    public void playGame(){
        setGameInfo();

        GamePlayCount currentGamePlayCount = new GamePlayCount(0);

        while(!gameInfo.isFinish(currentGamePlayCount)){
            runRacingCarsGame();
            currentGamePlayCount.addCount();
        }

        endRacingGame();
    }

    private void endRacingGame() {
        Winners winners = findWinners();

        view.print(winners.getWinners());
    }

    private Winners findWinners() {
        Collections.sort(gameInfo.getRacingCarList().getList());
        Position maxPosition = gameInfo.getRacingCarList().getIndexOfCar(0).getCarPosition();
        Index idx = new Index(1);

        ArrayList<CarName> list = new ArrayList<>();
        list.add(gameInfo.getRacingCarList().getIndexOfCar(0).getCarName());

        while(gameInfo.getRacingCarList().getIndexOfCar(idx.getIndex()).getCarPosition().getPosition() == maxPosition.getPosition()){
            list.add(gameInfo.getRacingCarList().getIndexOfCar(idx.getIndex()).getCarName());
            idx.addIndex();
        }

        return new Winners(list);
    }

    private void runRacingCarsGame() {

        for(int i = 0 ; i < gameInfo.getRacingCarList().getSize(); i++){
            runRacingCar(gameInfo.getRacingCarList().getIndexOfCar(i));
        }

        view.printLn();

    }

    private void runRacingCar(RacingCar racingCar) {

        if(isRun(randomNumberUtil.getRandomNumber())){
            racingCar.addCarPosition();
        }

        view.printCarPosition(racingCar.getRacingCarStatus());

    }

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

    public void setGameInfo(){
        Inputs inputs = getCarListInputs();
        RacingCarList racingCarList = makeRacingCarList(inputs);
        Input input = getTotalGamePlayCount();
        GamePlayCount totalGamePlayCount = new GamePlayCount(Integer.parseInt(input.getString()));
        gameInfo = new GameInfo(totalGamePlayCount, racingCarList);
    }

    private Input getTotalGamePlayCount() {
        Input input= new Input(view.getTotalGamePlayCount());
        if(!validator.checkNumber(input)){
            throw new IllegalArgumentException(INPUT_IS_NOT_NUMBER);
        }
        if(!validator.checkTotalRacingCount(input)){
            throw new IllegalArgumentException(INPUT_NUMBER_RANGE_IS_OVER);
        }
        return input;
    }

    public Inputs getCarListInputs(){
        Inputs inputs = new Inputs(view.getCarsName().split(","));
        if(!validator.checkRacingCarParticipantsCount(inputs)){
            throw new IllegalArgumentException(INPUT_RACING_CAR_COUNT_BELOW_TWO);
        }
        if(!validator.checkStringsLength(inputs)){
            throw new IllegalArgumentException(INPUT_LENGTH_IS_WRONG);
        }
        return inputs;
    }


}
