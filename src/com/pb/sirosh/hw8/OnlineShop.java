package com.pb.sirosh.hw8;
import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {
        Auth auth = new Auth();
        Scanner scan = new Scanner(System.in);


        System.out.println("Пожалуйста, зарегистрируйетсь");

        try {
            System.out.print("Введите логин: ");
            String login = scan.next();
            System.out.print("Введите пароль: ");
            String password = scan.next();
            System.out.print("Подтвердите пароль: ");
            String confirmPassword = scan.next();

            auth.signUp(login, password, confirmPassword);
            System.out.println("Регистрация успешна");

        } catch (WrongLoginException e1) {
            System.out.println("Регистрация не успешна. Длина логина должна быть от 5 до 20 символов, только латинские буквы и цифры");
            e1.printStackTrace();
        }

        catch (WrongPasswordException e2) {
            System.out.println("Регистрация не успешна. Длина пароля должна быть более 5 символов, только латинские буквы и цифры и знак подчеркивания. Или повторный пароль не совпадает" );
            e2.printStackTrace();
        }

        System.out.println("Пожалуйста, ведите логин и пароль, чтобы войти на сайт");

        try {
            System.out.print("Введите логин: ");
            String login = scan.next();
            System.out.print("Введите пароль: ");
            String password = scan.next();

            auth.signIn(login, password);
            System.out.println("Вы успешно вошли на сайт");

        } catch (WrongLoginException e3) {
            System.out.println("Данные введены неверно");
            e3.printStackTrace();
        }

    }

}