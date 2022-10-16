package com.hackerrank.od1ns0n.test.testworks.testworks2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextNxn {
    public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());
CheckInteger(N);
            bufferedReader.close();
    }
    static void CheckInteger(int N){
        for (int i = 0; i <= 10; i++) {
            if (2 <= N && N <= 20) {
                if (1 <= i && i <= 10) {
                    int result = N * i;
                    System.out.println(N +" x "+i+" = "+ result);
                }
            }
        }
    }
}
