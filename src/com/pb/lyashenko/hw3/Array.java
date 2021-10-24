package com.pb.lyashenko.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Введите последовательно 10 чисел для одномерного массива");
        Scanner in = new Scanner(System.in);
        int [] arr = new int[10];
        for (int i=0; i<10; i++){
            int x = in.nextInt();
            arr[i] = x;
        }
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println("Сумма элемнтов массива " + sum);

        bubbleSort(arr);

        System.out.println("Отсортированный массив: ");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
