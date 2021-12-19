package com.pb.lyashenko.hw11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TelephoneBook implements Serializable {

    List<Contact> list = new ArrayList<>();

    public static void main(String[] args) {
        TelephoneBook tb = new TelephoneBook();
        tb.Add("Ляшенко", LocalDate.of(1979, 12,9), Arrays.asList("0985081670", "0985081671", "0985081673") , "Днепр", LocalDateTime.now());
        ObjectMapper


        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = in.next();
        System.out.println("Введите номер телефона: ");
        String phone = in.next();

        System.out.println("Введите адрес: ");
        String address = in.next();
        System.out.println("Введите дату рождения через в формате XXXX XX XX через пробел: ");
        //LocalDate dateOfBirth = LocalDate.parse(in.next());
        LocalDate.of(year,month,day)
        LocalDate dateOfBirth = LocalDate.of(in.nexInt(), in.nextInt(), in.nextInt())*/
    }

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

/*    private static void contactWrite() throws IOException {
        File file = Paths.get("contacts.data").toFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(contacts);
        System.out.println("Файл записан! ");
        objectOutputStream.close();
        System.out.println(new String(Files.readAllBytes(Paths.get("contacts.data"))));
    }

    private static void contactRead() throws IOException, ClassNotFoundException {
        ArrayList<Contact> newContacts = new ArrayList<>();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("contacts.data"));
        newContacts = (ArrayList<Contact>)objectInputStream.readObject();
        for (Contact c : newContacts) {
            System.out.println(c.toString());
        }
    }

    public static void main(String[] args) throws Exception {
        File file = Paths.get("files/person.data").toFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        Person person = new Person("Alex", "0991234567", LocalDate.of(2000, 2, 12));
        person.setDog(new Dog("Rex"));
        List<Person> list = new ArrayList<>();
        list.add(person);
        list.add(new Person("Jack", "0991244566", LocalDate.now()));


        // сохраняем в файл
        objectOutputStream.writeObject(list);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();
    }*/



}
