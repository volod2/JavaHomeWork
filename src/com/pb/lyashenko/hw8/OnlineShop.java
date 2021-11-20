package com.pb.lyashenko.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth auth = new Auth();
        Scanner scan = new Scanner(System.in);
        System.out.println("Зарегистрируйтесь на сайте");
        System.out.println("Введите логин");
        String log = scan.nextLine();

        System.out.println("Введите пароль");
        String pas = scan.nextLine();

        System.out.println("Подтвердите пароль");
        String conPas = scan.nextLine();

        try {
            auth.signUp(log, pas, conPas);
        }
        catch (WrongLoginException e){
            System.out.println(e.getMessage());
        }
        catch (WrongPasswordException e){
            System.out.println(e.getMessage());
        }
        catch (WrongConfirmPasswordException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Ввойдите в аккаунт");
        System.out.println("Введите логин");
        String log2 = scan.nextLine();

        System.out.println("Введите пароль");
        String pas2 = scan.nextLine();

        try {
            auth.signIn(log2, pas2);
        }
        catch (WrongLoginException e){
            System.out.println(e.getMessage());
        }
    }
}
