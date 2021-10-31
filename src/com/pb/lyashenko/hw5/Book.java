package com.pb.lyashenko.hw5;

import java.util.Date;

public class Book {
    private final String name;
    private final String author;
    private final Date publishYear;

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public Date getPublishYear() {
        return publishYear;
    }

    public Book(String name, String author, Date publishYear){
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }
}

