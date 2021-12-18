package com.pb.lyashenko.hw11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TelephoneBook {
    public static void main(String[] args) {
        TelephoneBook tb = new TelephoneBook();
        List<String> tn = new ArrayList<String>(1);
        tn.add("0985081670");
        tb.Add("Ляшенко", LocalDate.of(1979, 12,9), tn , "Днепр", LocalDateTime.now());
    }
    List<Contact> list = new ArrayList<>();

    public void Add(String fio, LocalDate dateOfBirth, List<String> telNumber, String adress, LocalDateTime editTime)
    {
        Contact n = new Contact(fio, dateOfBirth, telNumber, adress, editTime);
        list.add(n);
    }

    public void Remove(int index)
    {
        list.remove(index);
    }

    /*public void Edit(int index)
    {
        list.remove (index);
    }*/
}
