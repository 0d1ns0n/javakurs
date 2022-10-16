package com.hackerrank.od1ns0n.test.testworks.testworks1;

import java.util.Scanner;

public class HomeTest1 {


        //    private static String a;
//    private static String b;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("================================");
//        for (int i = 0; i < 3; i++) {
//            String s1 = sc.next();
//            int x = sc.nextInt();
//            switch (i) {
//                case 0 -> a = s1 + check(x);
//                case 1 -> b = s1 + check(x);
//                case 2 -> {
//                    String c = s1 + check(x);
//                    System.out.println(a);
//                    System.out.println(b);
//                    System.out.println(c);
//                }
//            }
//        }
//        System.out.println("================================");
//    }
//
//    static String check(int sInt) {
//        while (true) {
//            if (sInt >= 0 && sInt <= 999) {
//                if (sInt > 99 && sInt < 1000) {
//                    return " " + sInt;
//                }
//                if (sInt < 100 && sInt > 9) {
//                    return " 0" + sInt;
//                }
//                if (sInt < 10) {
//                    return " 00" + sInt;
//                }
//            }
//        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for (int i = 0; i < 3; i++) {
                String name = sc.next();
                int num = sc.nextInt();
                check(num,name);
//            if (i == 0) {
//                a = name + check(num, name);
//            }
//            if (i == 1) {
//                b = name + check(num, name);
//            }
//            if (i == 2) {
//                c = name + check(num, name);
//                System.out.println(a);
//                System.out.println(b);
//                System.out.println(c);
//            }
//            for (int j = 0; j < 1; j++) {
//                if (num >= 0 && num <= 999) {
//                    if (num > 99 && num < 1000) {
//                        System.out.printf("%s %15d", name, num);
//                    }
//                    if (num < 100 && num > 9) {
//                        int c = 0;
//                        System.out.printf("%s%14d%d", name, c, num);
//                    }
//                    if (num < 10) {
//                        int c = 0;
//                        System.out.printf("%s%13d%d%d", name, c,c, num);
//                    }
//                }
//            }
            }
            System.out.println("================================");
        }
        //    static String check(int sInt, String sc) {
//        while (true) {
//            if (sInt >= 0 && sInt <= 999) {
//                if (sInt > 99 && sInt < 1000) {
//                     System.out.printf("%s%15b",sc,sInt);
//                    break;
//                }
//                if (sInt < 100 && sInt > 9) {
//                    String c = "0";
//                    System.out.printf("%s%15b%b",sc,c,sInt);
//                    break;
//                }
//                if (sInt < 10) {
//                    String c = "00";
//                    System.out.printf("%s%15b%b",sc,c,sInt);
//                    break;
//                }
//            }
//        }
//        for (int i = 0; i < 1; i++) {
//            if (sInt >= 0 && sInt <= 999) {
//                if (sInt > 99 && sInt < 1000) {
//                    System.out.printf("%s%15b", sc, sInt);
//                }
//                if (sInt < 100 && sInt > 9) {
//                    String c = "0";
//                    System.out.printf("%s%15b%b", sc, c, sInt);
//                }
//                if (sInt < 10) {
//                    String c = "00";
//                    System.out.printf("%s%15b%b", sc, c, sInt);
//                }
//            }
//        }return null;
        static void check(int in, String str){
            for (int j = 0; j < 1; j++) {
                if (in >= 0 && in <= 999) {
                    if (in > 99 && in < 1000) {
                        System.out.printf("%s %15d%n", str, in);
                    }
                    if (in < 100 && in > 9) {
                        int c = 0;
                        System.out.printf("%s%14d%d%n", str, c, in);
                    }
                    if (in < 10) {
                        int c = 0;
                        System.out.printf("%s%13d%d%d%n", str, c,c, in);
                    }
                }
            }
        }

    public static class Test {


        //    private static String a;
    //    private static String b;
    //
    //    public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("================================");
    //        for (int i = 0; i < 3; i++) {
    //            String s1 = sc.next();
    //            int x = sc.nextInt();
    //            switch (i) {
    //                case 0 -> a = s1 + check(x);
    //                case 1 -> b = s1 + check(x);
    //                case 2 -> {
    //                    String c = s1 + check(x);
    //                    System.out.println(a);
    //                    System.out.println(b);
    //                    System.out.println(c);
    //                }
    //            }
    //        }
    //        System.out.println("================================");
    //    }
    //
    //    static String check(int sInt) {
    //        while (true) {
    //            if (sInt >= 0 && sInt <= 999) {
    //                if (sInt > 99 && sInt < 1000) {
    //                    return " " + sInt;
    //                }
    //                if (sInt < 100 && sInt > 9) {
    //                    return " 0" + sInt;
    //                }
    //                if (sInt < 10) {
    //                    return " 00" + sInt;
    //                }
    //            }
    //        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for (int i = 0; i < 3; i++) {
                String name = sc.next();
                int num = sc.nextInt();
                check(num,name);
    //            if (i == 0) {
    //                a = name + check(num, name);
    //            }
    //            if (i == 1) {
    //                b = name + check(num, name);
    //            }
    //            if (i == 2) {
    //                c = name + check(num, name);
    //                System.out.println(a);
    //                System.out.println(b);
    //                System.out.println(c);
    //            }
    //            for (int j = 0; j < 1; j++) {
    //                if (num >= 0 && num <= 999) {
    //                    if (num > 99 && num < 1000) {
    //                        System.out.printf("%s %15d", name, num);
    //                    }
    //                    if (num < 100 && num > 9) {
    //                        int c = 0;
    //                        System.out.printf("%s%14d%d", name, c, num);
    //                    }
    //                    if (num < 10) {
    //                        int c = 0;
    //                        System.out.printf("%s%13d%d%d", name, c,c, num);
    //                    }
    //                }
    //            }
            }
            System.out.println("================================");
        }
    //    static String check(int sInt, String sc) {
    //        while (true) {
    //            if (sInt >= 0 && sInt <= 999) {
    //                if (sInt > 99 && sInt < 1000) {
    //                     System.out.printf("%s%15b",sc,sInt);
    //                    break;
    //                }
    //                if (sInt < 100 && sInt > 9) {
    //                    String c = "0";
    //                    System.out.printf("%s%15b%b",sc,c,sInt);
    //                    break;
    //                }
    //                if (sInt < 10) {
    //                    String c = "00";
    //                    System.out.printf("%s%15b%b",sc,c,sInt);
    //                    break;
    //                }
    //            }
    //        }
    //        for (int i = 0; i < 1; i++) {
    //            if (sInt >= 0 && sInt <= 999) {
    //                if (sInt > 99 && sInt < 1000) {
    //                    System.out.printf("%s%15b", sc, sInt);
    //                }
    //                if (sInt < 100 && sInt > 9) {
    //                    String c = "0";
    //                    System.out.printf("%s%15b%b", sc, c, sInt);
    //                }
    //                if (sInt < 10) {
    //                    String c = "00";
    //                    System.out.printf("%s%15b%b", sc, c, sInt);
    //                }
    //            }
    //        }return null;
        static void check(int in, String str){
            for (int j = 0; j < 1; j++) {
                if (in >= 0 && in <= 999) {
                    if (in > 99 && in < 1000) {
                        System.out.printf("%s %15d%n", str, in);
                    }
                    if (in < 100 && in > 9) {
                        int c = 0;
                        System.out.printf("%s%14d%d%n", str, c, in);
                    }
                    if (in < 10) {
                        int c = 0;
                        System.out.printf("%s%13d%d%d%n", str, c,c, in);
                    }
                }
            }
        }
    }
}
