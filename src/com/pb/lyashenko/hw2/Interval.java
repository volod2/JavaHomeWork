package com.pb.lyashenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operand: ");
        int operand1 = scanner.nextInt();
        String IsIn = "";
        if (operand1>=0 && operand1<=14) {
            IsIn = "0 - 14";
        }
        else if (operand1>=15 && operand1<=35) {
            IsIn = "15 - 35";
        }
        else if (operand1>=36 && operand1<=50) {
            IsIn = "36 - 50";
        }
        else if (operand1>=51 && operand1<=100) {
            IsIn = "51 - 100";
        }
        else {
            IsIn = "Loose";
        }
        System.out.println("Interval : " + IsIn);
    }
}
