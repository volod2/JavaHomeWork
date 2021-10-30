package com.pb.lyashenko.hw4;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        System.out.println("Введите первое предложение. Нажмите Enter");
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое предложение. Нажмите Enter");
        Scanner in2 = new Scanner(System.in);

        String input = in.nextLine();
        String input2 = in2.nextLine();

        char[] c1 = input.toCharArray();
        char[] c2 = input2.toCharArray();

        char[] c1New = new char[c1.length];
        char[] c2New = new char[c2.length];

        int number1 = 0;
        int number2 = 0;

        for (int i=0; i<c1.length; i++)
        {
            //очищаем занки препинания
            Character car1 = new Character(c1[i]);
            if (car1.equals('.')||car1.equals('-')||car1.equals(':')||car1.equals(';')||car1.equals(' ')||car1.equals(','))
            {
                continue;
            }
            else
            {
                c1New[number1]= c1[i];
                number1++;
            }
        }

        for (int i=0; i<c2.length; i++)
        {
            //очищаем занки препинания
            Character car2 = new Character(c2[i]);
            if (car2.equals('.')||car2.equals('-')||car2.equals(':')||car2.equals(';')||car2.equals(' ')||car2.equals(','))
            {
                continue;
            }
            else
            {
                c2New[number2]= c2[i];
                number2++;
            }
        }

        //проверка, что букв одинаковое кол-во
        if (number1 != number2)
        {
            System.out.println("Не анаграмма");
        }
        else
        {
            int number3 = 0;
            //проверка на совпадение всех букв
            for (int i = 0; i<number1; i++)
            {
                for (int j = 0; j<number1; j++)
                {
                    if (c1New[i] == c2New[j])
                    {
                        number3++;
                        break;
                    }
                }

            }
            if (number3 == number1)
            {
                System.out.println("Анаграмма");
            }
            else
            {
                System.out.println("Не анаграмма");
            }
        }
    }
}




