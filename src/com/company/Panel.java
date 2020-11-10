package com.company;

import java.util.ArrayList;

public class Panel {

    private int numberPanels;

    final int pricePerPanel = 2;

    public int cost = pricePerPanel * numberPanels;


    public Panel(int numberPanels) {

        this.numberPanels = numberPanels;

        if (numberPanels == 1){
            Tickets ticket1 = new Tickets();
            ticket1.toString();
            System.out.println("The price is: " + cost);
        } else if (numberPanels == 2){
            Tickets ticket1 = new Tickets();
            Tickets ticket2 = new Tickets();
            System.out.println("Panel 1 numbers:"); ticket1.toString();
            System.out.println("Panel 2 numbers:"); ticket2.toString();
            System.out.println("The price is: " + cost);

        } else if ( numberPanels == 3){
            Tickets ticket1 = new Tickets();
            Tickets ticket2 = new Tickets();
            Tickets ticket3 = new Tickets();
            System.out.println("Panel 1 numbers:"); ticket1.toString();
            System.out.println("Panel 2 numbers:"); ticket2.toString();
            System.out.println("Panel 3 numbers:"); ticket3.toString();
            System.out.println("The price is: " + cost);

        }

    }


}
