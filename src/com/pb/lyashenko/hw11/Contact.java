package com.pb.lyashenko.hw11;

//import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Contact {
//asdfashgdfhagjfhasfdghrtghrt
    //public class Person implements Serializable {

    //private final static long serialVersionUID = 42;

    private String fio;
    private LocalDate dateOfBirth;
    private List<String> telNumber;
    private String adress;
    private LocalDateTime editTime;

    public Contact(String fio, LocalDate dateOfBirth, List<String> telNumber, String adress, LocalDateTime editTime) {
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
        this.telNumber = telNumber;
        this.adress = adress;
        this.editTime = editTime;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<String> getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(List<String> telNumber) {
        this.telNumber = telNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public LocalDateTime getEditTime() {
        return editTime;
    }

    public void setEditTime(LocalDateTime editTime) {
        this.editTime = editTime;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fio='" + fio + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", telNumber=" + telNumber +
                ", adress='" + adress + '\'' +
                ", editTime=" + editTime +
                '}';
    }
}
