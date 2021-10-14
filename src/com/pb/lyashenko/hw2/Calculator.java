package com.pb.lyashenko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first operand: ");
        int operand1 = scanner.nextInt();

        System.out.print("Enter second operand: ");
        int operand2 = scanner.nextInt();

        System.out.print("Enter sign: ");
        String sign = scanner.next();
        if (sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) {
            double result = 0;
            String resultError = "";

            switch (sign) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 == 0){
                        resultError = "Divide on zero";
                        break;
                    }
                    result = operand1 / operand2;
                    break;
                default:
                    break;
            }
            if (!resultError.isEmpty()) {
                System.out.print(resultError);
            }
            else {
                System.out.print("Result is " + result);
            }
        }
        else {
            System.out.print("Enter right sign");
        }
    scanner.close();
    }
}
