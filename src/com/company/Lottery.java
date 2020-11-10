package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class Lottery {

    private static int numberOfPanels;
    public final int cost = 2;
    private static int finalPrice;
    public static ArrayList<Integer> numbersChosen = new ArrayList<>(6);


    public Lottery(int numberOfPanels) {

        this.numberOfPanels = numberOfPanels;
        int finalPrice = numberOfPanels * cost;
        this.finalPrice = finalPrice;
        chooseNumbers();


    }

    public int getNumberOfPanels() {
        return numberOfPanels;
    }

    public void chooseNumbers() {
        int max = 999, min = 1, index = 0;

        while (index < numbersChosen.size()) {

            int rand = (int) (Math.random() * (max - min + 1) + min);

                if (numbersChosen.contains(rand)) {
                    rand = (int) (Math.random() * (max - min + 1) + min);
                } else {
                    numbersChosen.add(rand);
                }
            index++;
        }

    }

    @Override
    public String toString() {
        for (int i = 0; i < numbersChosen.size(); i++){
            System.out.print(numbersChosen.get(i)+" ");
        }
        return " ";
    }


}
