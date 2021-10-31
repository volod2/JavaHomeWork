package com.pb.lyashenko.hw5;

import java.util.Date;

public class Reader {
    private final String fio;
    private int ticketNumber;
    private int takingBooks;
    private final String faculty;
    private final Date birsday;
    private final String telNumber;

    public int getTakingBooks() {
        return takingBooks;
    }

    public void setTakingBooks(int takingBooks) {
        this.takingBooks = takingBooks;
    }

    public String getFio() {
        return fio;
    }

    public int getNumber() {
        return ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public Date getBirsday() {
        return birsday;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }


    public Reader(String fio, int ticketNumber, String faculty, Date birsday, String telNumber)
    {
        this.fio = fio;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birsday = birsday;
        this.telNumber = telNumber;
    }

    public void takeBook(int numBooks)
    {
        //Выводит на консоль сообщение
        //"Петров В. В. взял 3 книги".
        int haveBooks = getTakingBooks();
        setTakingBooks(haveBooks+numBooks);
        System.out.println("???? Кто взял " + numBooks);
    }

    public void takeBook(Book book)
    {
        int haveBooks = getTakingBooks();
        setTakingBooks(haveBooks++);
        System.out.println("???? Кто взял:" + book.getName() + book.getAuthor() + book.getPublishYear());
        //"Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
    }

    public void takeBook(Book[] book)
    {
        //Выводит на консоль сообщение
        //"Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
        int haveBooks = getTakingBooks();
        int nowTakeBooks = book.length;
        setTakingBooks(haveBooks+nowTakeBooks);
        //вівести с массива 
        //System.out.println("???? Кто взял:" + book.getName() + book.getAuthor() + book.getPublishYear());

    }
    public void returnBook(int numBooks)
    {
        //"Петров В. В. вернул 3 книги"
        int haveBooks = getTakingBooks();
        setTakingBooks(haveBooks-numBooks);
        System.out.println("???? Кто вернул " + numBooks);
    }

    //- takeBook, который будет принимать количество взятых книг.
    public void returnBook(Book book)
    {
        //Выводит на консоль сообщение
        //- "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
        int haveBooks = getTakingBooks();
        setTakingBooks(haveBooks--);
        System.out.println("???? Кто взял:" + book.getName() + book.getAuthor() + book.getPublishYear());
        //"Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
    }
    //- takeBook, который будет принимать количество взятых книг.
    public void returnBook(Book[] book)
    {
        //Выводит на консоль сообщение
        //- "Петров В. В. вернул книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
        //Выводит на консоль сообщение
        //"Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
        int haveBooks = getTakingBooks();
        int nowTakeBooks = book.length;
        setTakingBooks(haveBooks-nowTakeBooks);
        //вівести с массива
        //System.out.println("???? Кто взял:" + book.getName() + book.getAuthor() + book.getPublishYear());
    }
}
