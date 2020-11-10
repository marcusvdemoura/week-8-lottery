package com.company;

import java.util.ArrayList;

public class Tickets {

    public final int lastNumber = 50;
    public final int firstNumber = 1;
    private static ArrayList<Integer> numbersChosen = new ArrayList<>(6);

    public Tickets() {

        addNumbers();

    }

    public static ArrayList<Integer> getNumbersChosen() {
        return numbersChosen;
    }

    public int randomNumber() {

        int rand = (int) (Math.random() * (lastNumber - firstNumber + 1) + firstNumber);
        return rand;

    }

    public void addNumbers (){
        ArrayList<Integer>_numbersChosen = new ArrayList<>(6);
        int index = 0;
        while (index < _numbersChosen.size()) {
            int number = randomNumber();
            if (_numbersChosen.contains(number)){
                do {
                    randomNumber();
                    number = randomNumber();
                }while (!_numbersChosen.contains(number));
            } else {
                _numbersChosen.add(number);
            }
        }
        numbersChosen = _numbersChosen;
    }

    @Override
    public String toString (){
        for (int i = 0; i<numbersChosen.size(); i++){
            System.out.print(getNumbersChosen().get(i));
        } return " ";
    }


}
