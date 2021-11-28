package com.pb.lyashenko.hw10;

import java.util.stream.IntStream;

public class NumBox<T extends Number> {
    private T[] numbers;

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    public void add(int index, T num) throws ArrayIndexOutOfBoundsException {
        if (index > numbers.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else numbers[index] = num;
    }

    public T get(int index) {
        return numbers[index];
    }

    public int length() {
        return numbers.length;
    }

    public double average() {
        double av = (sum() / length());
        return av;
    }

    public double sum() {
        double sum = 0.0;
        for (T i : numbers) {
            if (i == null) {
                sum += 0;
            } else sum += i.doubleValue();
        }
        return sum;
    }

    public T max() {
        T ma = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].doubleValue() > ma.doubleValue()) {
                ma = numbers[i];
            }
        }
        return ma;
    }

    // При подсчете воспользоваться тем, что у любого из объектов подклассов Number есть методы
    // intValue, doubleValue, floatValue и другие.*/
    //NumBox<Float> и NumBox<Integer>.
    public static void main(String[] args) {
        NumBox<Integer> numBox = new NumBox<>(20);

        try {
            numBox.add(0, new Integer(22));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив переполнен!" + e.getMessage());
            e.printStackTrace();
        }

        NumBox<Double> numBox1 = new NumBox<>(5);
        numBox1.add(1, new Double(1.1));
        numBox1.add(2, new Double(2.2));
        numBox1.add(3, new Double(3.3));

        Double d = (Double) numBox1.get(1);
    }
}