package com.tech.racingcar.domain;

public class RacingCar implements Comparable<RacingCar>{

    private CarName carName;
    private Position carPosition;

    public RacingCar(CarName carName){
        this.carName = carName;
        carPosition = new Position();
    }

    public void run(){
        carPosition.run();
    }

    public Position getCarPosition(){
        return carPosition;
    }

    public CarName getCarName(){
        return carName;
    }

    @Override
    public int compareTo(RacingCar o) {
        return this.carPosition.getPosition() - o.carPosition.getPosition();
    }

    public RacingCarStatus getRacingCarStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append(carName.getName());
        sb.append(" : ");
        for(int i = 0; i < carPosition.getPosition(); i++){
            sb.append("-");
        }
        return new RacingCarStatus(sb.toString());
    }

    public void addCarPosition() {
        carPosition.addPosition();
    }
}
