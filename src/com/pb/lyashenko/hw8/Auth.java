package com.pb.lyashenko.hw8;

import java.util.regex.Pattern;

public class Auth {

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void signUp(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException, WrongConfirmPasswordException {

        if (Pattern.matches("[a-zA-Z0-9]{5,20}", login)) {
            //this.login = login;
        } else {
            throw new WrongLoginException();
        }

        if (Pattern.matches("[a-zA-Z0-9_]{5,}", password)) {
            //this.password = password;
        } else {
            throw new WrongPasswordException();
        }

        if (password.equals(confirmPassword)) {
        } else {
            throw new WrongConfirmPasswordException();
        }
        setLogin(login);
        setPassword(password);
        System.out.println("Регистрация успешна!");

    }

        public void signIn (String login, String password) throws WrongLoginException {
            if (login.equals(getLogin()) && password.equals(getPassword())){
                System.out.println("Вы вошли в аккаунт");
            }
        }
    }

