package com.pb.lyashenko.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        System.out.println("Введите слова");
        Scanner in = new Scanner(System.in);

        String [] input = in.nextLine().split(" ");
        String [] output = new String [input.length];
        int i=0;
        for (String s: input)
        {
            char[] ca = s.toCharArray();
            ca[0] = Character.toUpperCase(ca[0]);
            output[i] = String.valueOf(ca);
            i++;
        }

        System.out.println(ArrayStringToString(output));
       }

    public static String ArrayStringToString (String[] output)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < output.length; j++)
        {
            stringBuilder.append(output[j]);
            stringBuilder.append(" ");
        }
        String finalString = stringBuilder.toString();
        return finalString;
    }

    }
