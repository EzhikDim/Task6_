package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = in.nextDouble();
        System.out.println("Введите n:");
        int n = in.nextInt();
        System.out.println("Введите e:");
        double e = in.nextDouble();
        double s1 = 1, s = 1, s2 = 1, s3 = 1, fakt = 1, fakt1 = 2, sv = 2;
        double fun;
        fun = 1/Math.sqrt(1-Math.pow(x, 2));
        System.out.print("Сумма " + n + " слагаемых ряда = " + sum(x, n, s1, s, fakt, fakt1, sv) + "\n");
        System.out.print("Сумма слагаемых > е = " + sume(x, e, n, s2, s, fakt, fakt1, sv) + "\n");
        System.out.print("Сумма слагаемых > больше е/10 = " + sume10(x, e, n, s3, s, fakt, fakt1, sv) + "\n");
        System.out.print("Значение функции = " + fun + "\n");
    }

    public static double sum(double x, int n, double s1, double s, double fakt, double fakt1, double sv) {
        int st = 2;
        for (int i = 0; i < n; i++) {
            s1 += (fakt/fakt1)*Math.pow(x, st);
            fakt1 *= sv + 2;
            fakt *= s + 2;
            s++;
            st += 2;
            sv+=2;
        }
        return s1;
    }

    public static double sume(double x, double e, int n, double s2, double s, double fakt, double fakt1, double sv) {
        double k;
        int st = 2;
        for (int i = 0; i < n; i++) {
            k = (fakt/fakt1)*Math.pow(x, st);
            if (k > e) {
                s2 += (fakt/fakt1)*Math.pow(x, st);
            }
            fakt1 *= sv + 2;
            fakt *= s + 2;
            s++;
            st += 2;
            sv += 2;
        }
        return s2;
    }

    public static double sume10(double x, double e, int n, double s3, double s, double fakt, double fakt1, double sv) {
        double k;
        int st = 2;
        for (int i = 0; i < n; i++) {
            k = (fakt/fakt1)*Math.pow(x, st);
            if (k > e/10) {
                s3 += (fakt/fakt1)*Math.pow(x, st);
            }
            fakt1 *= sv + 2;
            fakt *= s + 2;
            s++;
            st += 2;
            sv +=2;
        }
        return s3;
    }
}
