package com.pb.lyashenko.hw5;

import java.util.Date;

public class Library {
    public static void main(String[] args) {
        Book[] bArr = new Book[3];

        Book book1 = new Book( "Остров сокровищ", "Стивенсон Р.Л.", "1975");
        Book book2 = new Book( "Белый клик", "Лондон Дж.", "1966");
        Book book3 = new Book( "Два каптана", "Каверин В.В.", "1955");

        //создаем массив книг
        bArr[0] = book1;
        bArr[1] = book2;
        bArr[2] = book3;

        Reader[] readers = new  Reader[3];

        Reader reader1 = new Reader("Ляшенко В.В.", 5, "Мехмат", "1988", "0985081670");
        Reader reader2  = new Reader("Шевченко В.В.", 3, "Физтех", "1987", "0985081633");
        Reader reader3  = new Reader("Петров А.А.", 4, "Филфак", "1999", "0985081555");

        readers[0] = reader1;
        readers[1] = reader2;
        readers[2] = reader3;
        //создаем массив читателей


        // печатаются все книги.
        for (Book b: bArr) {
            System.out.println(b.getName() + ", " + b.getAuthor() + ", " + b.getPublishYear());
        }
        // печатаются все читатели.
        for (Reader r: readers) {
            System.out.println(r.getFio() + ", " + r.getFaculty() + ", " + r.getNumber() + ", " + r.getTelNumber() + ", " + r.getBirsday());
        }
        //- демонстрируется работа всех вариантов методов takeBook() и returnBook().
        readers[0].takeBook(3);
        readers[0].returnBook(2);
        String[] s = {"Остров сокровищ", "Два каптана"};
        readers[0].takeBook(s);
        readers[0].returnBook(s);
        readers[0].takeBook(bArr);
        readers[0].returnBook(bArr);
      }
   }

