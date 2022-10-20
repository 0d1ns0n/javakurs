package com.codewars.od1ns0n.files.javacheleng.javacheleng1;

public class Maskify {

    static String maskify(String sc) {
        char[] chars = sc.toCharArray();


        for (int i = 0; i <= chars.length - 1; i++) {

            if (chars.length - 4 > i) {
                String fin = String.valueOf(chars[i]);
                System.out.print(fin.replace(fin, "#"));
            } else if (chars.length - 5 < i) {
                System.out.print(chars[i]);
            }

        }

        return sc;
    }
}