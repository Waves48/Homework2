package com.company;

import javax.swing.*;

public class Hometask2 {

    public static void main(String[] args) {
        // Задание 2. Вывести на консоль 2 в степени n. Для вычисления использовать только побитовые операции.

        int number = 0b00000010;
        int n = 2;
        int result = number << n;
        System.out.println("2 в степени n - " + result);
        System.out.println(number);

        //Задание 4. Инвертировать i-й бит числа N. Вывести результат на консоль в двоичном виде.
        int num = 0b00000111;
        int replacement = 0b10000111;
        int Final = (num | replacement);
        System.out.println("Инвертировали 7 бит - " + Integer.toBinaryString(Final));
        // Задание 6. Обнулить все кроме последних i битов числа N. Вывести результат на консоль в двоичном виде.
        int Number_n = 0b1111111;
        int New = 0b0000000011;
        int end = Number_n & New;
        System.out.println("Обнуление всего кроме последних 2-ух битов числа N - " +Integer.toBinaryString(end));
        // Задание 8. Задание 8. Обнулить крайний левый (старший разряд) единичный бит числа N. Вывести результат на консоль в двоичном виде.
        int N_number = 0b1111111;
        int nullifyer = 0b0111111;
        int res = N_number & nullifyer;
        System.out.println("Обнуление старшего разряда - " +Integer.toBinaryString(res));
        // Задание 10. Найти и вывести на консоль минимальное из двух чисел M и N, используя только побитовые и арифметические операции (без использования условного оператора).
        int M = 27;
        int N = 11;
        if ((M - N)>0){
            System.out.println("N - меньшее из двух чисел");
        } else System.out.println("M - меньшее из двух чисел"); // не смог без if, Сергей Геннадьевич, задам вам глупый вопрос по этой задаче
        // Задание 12. Проверить, есть ли в двоичной записи числа n хотя бы один 0. Используя только побитовые и условные операторы. Вывести на консоль исходное число в двоичном виде и результат.
        int number1 = 0b1111101;
        int help = 0b1111111;
        if ((number1 & help) == help) {
            System.out.println("В числе " +Integer.toBinaryString(number1) + " нулей нет");
        }else if ((number1 & help) == number1) {
            System.out.println("Ноль в числе " +Integer.toBinaryString(number1) + " есть");
        }
    }
}
