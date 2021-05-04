package com.tech.racingcar.domain;

import java.util.ArrayList;

public class Winners {

    ArrayList<CarName> winners = null;

    public Winners(ArrayList<CarName> winners){
        this.winners = winners;
    }

    public String getWinners(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < winners.size() - 1; i++){
            sb.append(winners.get(i).getName());
            sb.append(", ");
        }
        sb.append(winners.get(winners.size()-1).getName());
        sb.append("가 최종 우승했습니다.");
        return sb.toString();
    }
}
