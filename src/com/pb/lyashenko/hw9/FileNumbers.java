package com.pb.lyashenko.hw9;

import java.io.FileWriter;
import java.io.IOException;
//import java.io.IOException;

public class FileNumbers extends IOException {
    public static void createNumbersFile()  {
        // создает текстовый файл "numbers.txt"
        //заполненный случайными целыми числами от 1 до 99. 10 строк и по 10 чисел в каждой строке. Ч
        // исла разделять пробелами.
            int count = 0;
            try(FileWriter fw = new FileWriter("numbers.txt")) {
                for( int i=0; i<100; i++) {
                    fw.write(i+" ");
                    if (count%10 == 0)
                    fw.write("\n");
                }
            }
            catch (IOException ioEx) {
                ioEx.printStackTrace();
            }
        }



    public static  void createOddNumbersFile(){
        //читает файл "numbers.txt", и создает на основе
        //него новый файл "odd-numbers.txt" в который входят все числа из "numbers.txt" только все четные заменены на 0.

        if (a%2==0){
            a = 0;
        }
    }

    public static void main(String[] args) {

        FileNumbers.createNumbersFile();

        FileNumbers.createOddNumbersFile();
    }
}
