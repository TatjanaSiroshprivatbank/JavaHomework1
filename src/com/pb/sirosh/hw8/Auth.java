package com.pb.sirosh.hw8;
import java.util.regex.Pattern;

public class Auth {
    String login;
    String password;
    String confirmPassword;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (Pattern.matches("[a-zA-Z0-9]{5,20}", login)) {
            this.login = login;
        }
        else {
            throw new WrongLoginException();
        }
        if (Pattern.matches("[a-zA-Z0-9_]{5,}", password)) {
            this.password = password;
        }
        else {
            throw new WrongPasswordException();

        }
        if ((password.equals(confirmPassword))) {
            this.confirmPassword = confirmPassword;
        }
        else {
            throw new WrongPasswordException();
             }
    }

    public void signIn(String login, String password) throws WrongLoginException {
        if (!login.equals(this.login) || !password.equals(this.password)) {
            throw new WrongLoginException();
        }
    }
}