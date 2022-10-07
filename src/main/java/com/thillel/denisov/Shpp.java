package com.thillel.denisov;


import java.util.Scanner;

public class Shpp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userGoing = checkNum(scanner,"Write your years");
        if(userGoing > 0 && userGoing < 18) {
            System.out.println("so little bb");
        } else if (userGoing > 17 && userGoing < 50) {
            System.out.println("Nice big boy");
        } else if (userGoing > 100) {
            System.out.println(" You relly alive?) joke) sorry but, you very old! ");
        }
//        switch (userGoing) {
//            case 10:
//                System.out.println("so little bb");
//                break;
//            case 18:
//                System.out.println("Nice big boy");
//                break;
//            default:
//                System.out.println("you write ASS, fuck off!");
//                break;
//        }
    }
    static int rand(){
        int rand = (int) (Math.random() * 10);
        return rand;
    }
    static int checkNum (Scanner scanner, String text) {
        while (true) {
            System.out.println(text);
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                return number;
            }else {
                System.out.println("WRONG! only number 0,1,2...");
                scanner.next();
                break;
            }
        }
        return checkNum(scanner,"Write your years");
    }
}
