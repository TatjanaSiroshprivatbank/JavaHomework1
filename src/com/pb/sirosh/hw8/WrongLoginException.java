package com.pb.sirosh.hw8;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
        System.out.println("Длина логина должна быть от 5 до 20 символов, только латинские буквы и цифры");
    }
}
