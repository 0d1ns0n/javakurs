package com.hackerrank.od1ns0n.test.testworks.testworks5;

import java.util.Scanner;

public class SysEOF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; sc.hasNext(); i++) {
            System.out.println(i + " " + sc.nextLine());
        }
    }
//    static void CheckText(Scanner scanner){
//        while (true){
//            if (scanner.hasNext()){
//                System.out.println(scanner.next());
//                break;
//            } else {
//                System.out.println("Wrong, try again write!");
//            }
//        }
//    }
}
