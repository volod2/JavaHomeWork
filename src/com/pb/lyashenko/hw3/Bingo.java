package com.pb.lyashenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Для досрочного выхода из программы следут ввести 111");
        System.out.print("Угадайте число от 0 до 100 ");
        int attempt = 0;
        // генерация случайного числа
        Random random = new Random();
        int x = random.nextInt(101);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int operand = scanner.nextInt();
            //устранение бага
            if (operand == 111) {
                System.out.print("Вы досрочно вышли из программы");
                break;
            }
            attempt++;
            if (operand == x){
                System.out.print("Вы угадали число c " + attempt + " попытки");
                break;
            }
            else {
                if (operand > x){
                    System.out.print("Число меньше загаданного ");
                }
                else {
                    System.out.print("Число больше загаданного ");
                }
            }
        }
  }
}
