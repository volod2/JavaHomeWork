package com.pb.lyashenko.hw5;

import java.util.Date;

public class Reader {
    private final String fio;
    private int ticketNumber;
    private int takingBooks;
    private final String faculty;
    private final String birsday;
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

    public String getBirsday() {
        return birsday;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }


    public Reader(String fio, int ticketNumber, String faculty, String birsday, String telNumber)
    {
        this.fio = fio;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birsday = birsday;
        this.telNumber = telNumber;
    }

    public void takeBook(int numBooks)
    {
        int haveBooks = getTakingBooks();
        setTakingBooks(haveBooks+numBooks);
        System.out.println(fio + "взял " + numBooks + "книг");
    }

    public void takeBook(String[] name)
    {
        int haveBooks = getTakingBooks();
        setTakingBooks(haveBooks + name.length);
        for (String s: name)
        {
            System.out.print(fio + "взял книги: " + name + " ,");
        }
    }

    public void takeBook(Book[] book)
    {
        int haveBooks = getTakingBooks();
        setTakingBooks(haveBooks + book.length);
        System.out.println("");
        System.out.print(fio + "взял ");
        for (Book s: book) {
            System.out.print(s.getName() + "(" + s.getAuthor() + s.getPublishYear() + "), ");
        }
    }
    public void returnBook(int numBooks)
    {
        int haveBooks = getTakingBooks();
        setTakingBooks(haveBooks - numBooks);
        System.out.println(fio + "вернул " + numBooks + "книг");
    }

    public void returnBook(String[] name)
    {
        int haveBooks = getTakingBooks();
        setTakingBooks(haveBooks - name.length);
        for (String s: name)
        {
            System.out.print(fio + "вернул книг:" + name + " ,");
        }
    }

    public void returnBook(Book[] book)
    {
        int haveBooks = getTakingBooks();
        setTakingBooks(haveBooks - book.length);
        System.out.println("");
        System.out.print(fio + "вернул ");
        for (Book s: book) {
            System.out.print(s.getName() + "(" + s.getAuthor() + s.getPublishYear() + "), ");
        }
    }
}
