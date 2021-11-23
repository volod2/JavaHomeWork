package com.pb.lyashenko.hw9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
//import java.io.IOException;

public class FileNumbers extends IOException {
    public static void createNumbersFile()  {

            try(FileWriter fw = new FileWriter("C://1/numbers.txt")) {
                for( int i=1; i<101; i++) {
                    fw.write(i+" ");
                    if (i%10 == 0)
                    fw.write("\n");
                    //i++;
                }
            }
            catch (IOException ioEx) {
                ioEx.printStackTrace();
            }
        }

    public static  void createOddNumbersFile() throws FileNotFoundException {

        try (FileReader reader = new FileReader("C://1/numbers.txt"))
        {
            Scanner scan = new Scanner(reader);
            int i = 1;

            while (scan.hasNextLine()) {
                String s = scan.nextLine();
                String[] words = s.split(" ");
                StringBuilder words2 = new StringBuilder();
                for(String w: words) {
                    int i1 = Integer.parseInt(w);
                    if (i1 % 2 == 0) {
                        i1 = 0;
                    }
                    words2.append(String.valueOf(i1));
                    words2.append(" ");
                }

                    //добавляем строку в новый файл
                    try(FileWriter fw = new FileWriter("C://1/numbers_odd.txt")) {
                            fw.write(words2.toString());
                            fw.write("\n");
                        }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                i++;
            } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        FileNumbers.createNumbersFile();

        FileNumbers.createOddNumbersFile();
    }
}
