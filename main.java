package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner debt = new Scanner(System.in);
        int countcoins = 0;
        float total;
        do {
            System.out.print("How much change do I owe you?: ");
            total = debt.nextFloat();
        }
        while (total <= 0.00);

        int cents = Math.round(total * 100);

        while (cents >= 25)
        { countcoins++;
            cents -= 25;
        }
        while (cents >= 10)
        { countcoins++;
            cents -= 10;
        }
        while (cents >= 5)
        { countcoins++;
            cents -= 5;
        }
        while (cents >= 1)
        { countcoins++;
            cents -= 1;
        }

        System.out.println( "Okay, that's " + countcoins + " coins!");
    }
}

