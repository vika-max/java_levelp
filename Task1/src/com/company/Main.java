package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = 0.0f, b = 0.0f, c = 0.0f, d = 0.0f;
        try {
            System.out.println("Для решения квадратного уравнения введите a, b, c");
            System.out.println("Введите a:");
            a = in.nextFloat();
            System.out.println("Введите b:");
            b = in.nextFloat();
            System.out.println("Введите с:");
            c = in.nextFloat();
            d = (float) Math.pow(b, 2) - 4 * a * c;
            if (d < 0) {
                System.out.println("У уравнения нету корней");
            }
            if ((d == 0) && (a != 0)) {
                System.out.println("У уравнения один корень");
                float x1 = - b / (2 * a);
                System.out.printf("x1 = %.5f\n", x1);
            }
            if ((d > 0) && (a != 0)) {
                System.out.println("У уравнения два корня");
                float x1 = (-b - (float)Math.sqrt(d)) / (2 * a);
                float x2 = (-b + (float)Math.sqrt(d)) / (2 * a);
                System.out.printf("x1 = %f\n", x1);
                System.out.printf("x2 = %f\n", x2);
            }
            if ((a == 0) && (b==0) &&(c == 0)) {
                System.out.printf("x2 = %f\n", 0.0f);
            } else if (a == 0) {
                System.out.printf("x1 = %f\n", -b/c);
            }

        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не Float число");
        }
    }
}
/* Тестирование
  1. x^2 - 8*x + 12 = 0
  2. 5 * x^2 + 3 * x +  = 0;
  3. x^2 -6 * x + 9 = 0;
*/



