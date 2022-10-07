package com.thillel.denisov.homeworks.homeworks8;

import java.util.Arrays;

public class LotteryHome {
    public static void main(String[] args) {


        int lottery[] = new int[7];
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = random();
        }
        System.out.println();
        int player[] = new int[7];
        for (int b = 0; b < player.length; b++) {
            player[b] = random();
        }
        Arrays.sort(lottery);
        Arrays.sort(player);
        System.out.println(Arrays.toString(lottery));
        System.out.println(Arrays.toString(player));
        int tempCounter = 0;
        for (int i = 0; i < lottery.length; i++) {
            if (lottery[i] == player[i]) {
                tempCounter++;
                int resultCounter = tempCounter;

            }


        }
        System.out.println("You have matches: " + tempCounter);

    }

    static int random() {
        int rand = (int) (Math.random() * 10);
        return rand;
    }
}

