package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class Lottery {

    public ArrayList<Integer> lotteryNumbers = new ArrayList<>(6);
    int randomNumber;

    public Lottery (){
        for (int i = 0; i < lotteryNumbers.size(); i++){
            randomNumber = (int)(Math.random()*50);
            for (int j = 0; j < i; j++){
                if (lotteryNumbers.contains(randomNumber)) {
                    randomNumber = (int) (Math.random() * 50);
                    j = -1;
                }
            }
            lotteryNumbers.add(randomNumber);
        }

        for (int i = 0; i < lotteryNumbers.size(); i++){
            System.out.println(lotteryNumbers.get(i));
        }

    }


}
